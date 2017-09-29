import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;
import edu.digipen.level.GameLevelManager;

public class Help extends GameObject
{
	public Help()
	{
		super("Help",400,100,"Help.png");
		setRectangleCollider(200,50);
	}
	@Override public void collisionReaction(GameObject collidedwith)
	{

		if(collidedwith.getName().equals("Cursor_") && InputManager.isMouseButtonTriggered(InputManager.MouseButtons.BUTTON_LEFT))
		{
			GameLevelManager.goToLevel(new HelpW());
		}
	}
}
