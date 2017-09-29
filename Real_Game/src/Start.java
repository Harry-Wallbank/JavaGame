import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;
import edu.digipen.level.GameLevelManager;

import java.awt.event.KeyEvent;

public class Start extends GameObject
{
	public Start()
	{
		super("Start",400,100,"Start.png");
		setPositionY(100);
		setRectangleCollider(200,50);
	}
	@Override public void update(float dt)
	{
		if(InputManager.isTriggered(KeyEvent.VK_ENTER))
		{
			GameLevelManager.goToLevel(new WaterWorld());
		}
	}
	@Override public void collisionReaction(GameObject collidedwith)
	{

		if(collidedwith.getName().equals("Cursor_") && InputManager.isMouseButtonTriggered(InputManager.MouseButtons.BUTTON_LEFT))
		{
			GameLevelManager.goToLevel(new WaterWorld());
		}
	}

}
