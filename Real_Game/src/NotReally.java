import edu.digipen.Game;
import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;

public class NotReally extends GameObject
{
	public NotReally()
	{
		super("NoReally",850,100,"DoYouReally.png");
		setPositionY(200);
		setRectangleCollider(200,50);
	}
	@Override public void collisionReaction(GameObject collidedwith)
	{
		if(collidedwith.getName().equals("Cursor_") && InputManager.isMouseButtonTriggered(InputManager.MouseButtons.BUTTON_LEFT))
		{
			Game.destroy();
		}
	}
}
