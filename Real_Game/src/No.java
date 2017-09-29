import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;
import edu.digipen.level.GameLevelManager;

public class No extends GameObject
{
	public No()
	{
		super("No",400,100,"NoNotReally.png");
		setPositionX(-400);
		setRectangleCollider(200,50);
	}
	@Override public void collisionReaction(GameObject collidedwith)
	{
		if(collidedwith.getName().equals("Cursor_") && InputManager.isMouseButtonTriggered(InputManager.MouseButtons.BUTTON_LEFT))
		{
			GameLevelManager.goToLevel(new MainMenu());
		}
	}
}
