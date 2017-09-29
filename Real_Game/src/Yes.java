import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;
import edu.digipen.level.GameLevelManager;

public class Yes extends GameObject
{
	public Yes()
	{
		super("Yes",400,100,"YesButNo.png");
		setPositionX(400);
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
