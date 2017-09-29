import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;
import edu.digipen.level.GameLevelManager;

public class Powerupds extends GameObject
{
	public Powerupds()
	{
		super("Upgrades",400,100,"Upgrades.png");
		setPositionY(-100);
		setRectangleCollider(200,50);
	}
	@Override public void collisionReaction(GameObject collidedwith)
	{
		if(collidedwith.getName().equals("Cursor_") && InputManager.isMouseButtonTriggered(InputManager.MouseButtons.BUTTON_LEFT))
		{
			GameLevelManager.goToLevel(new Upgrade());
		}
	}
}
