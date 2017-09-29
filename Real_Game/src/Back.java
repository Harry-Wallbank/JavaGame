import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;
import edu.digipen.level.GameLevelManager;

public class Back extends GameObject
{
	public Back()
	{
		super("Back",400,100,"Back.png");
		setPositionY(-200);
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
