import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;

import java.awt.event.KeyEvent;

public class Resume extends GameObject
{
	public Resume()
	{
		super("Resume",400,100,"Resume.png");
		setPositionY(100);
		setRectangleCollider(200,50);
	}
	@Override public void update(float dt)
	{
		if(InputManager.isTriggered(KeyEvent.VK_ENTER))
		{
			ObjectManager.removeAllObjectsByName("Cursor_");
			ObjectManager.removeAllObjectsByName("Resume");
			ObjectManager.removeAllObjectsByName("Quit");
			ObjectManager.unpauseAllObjects();
			WaterWorld.Pause = true;
		}
	}
	@Override public void collisionReaction(GameObject collidedwith)
	{
		if(collidedwith.getName().equals("Cursor_") && InputManager.isMouseButtonTriggered(InputManager.MouseButtons.BUTTON_LEFT))
		{
			ObjectManager.removeAllObjectsByName("Cursor_");
			ObjectManager.removeAllObjectsByName("Resume");
			ObjectManager.removeAllObjectsByName("Quit");
			ObjectManager.unpauseAllObjects();
			WaterWorld.Pause = true;
		}
	}
}
