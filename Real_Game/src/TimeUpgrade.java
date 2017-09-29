import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;

public class TimeUpgrade extends GameObject
{
	int a = 10;
	public TimeUpgrade()
	{
		super("Time",200,200,"TimeUpgrade.png");
		setRectangleCollider(100,100);
		setPositionX(-100);
	}
	@Override public void collisionReaction(GameObject collidedwith)
	{
		if(collidedwith.getName().equals("Cursor_") && InputManager.isMouseButtonTriggered(InputManager.MouseButtons.BUTTON_LEFT) && WaterWorld.coin>=a)
		{
			WaterWorld.coin-=a;
			Log.slowDownTime++;
		}
	}
}
