import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;
import edu.digipen.level.GameLevelManager;

import java.awt.event.KeyEvent;

public class WakeBoard extends GameObject
{
	public GameObject boat = ObjectManager.getGameObjectByName("Player1");

	public  WakeBoard()
	{
		super("Player2",18,56,"WakeBoard.png");
		setPosition(0,-250);
		setZOrder(0);
	}

	@Override public void update(float dt)
	{


		if(InputManager.isPressed(KeyEvent.VK_LEFT)&& getPositionX()>=-940)
		{
			setPositionX(getPositionX()-3);
		}
		if(InputManager.isPressed(KeyEvent.VK_RIGHT)&& getPositionX()<=940)
		{
			setPositionX(getPositionX()+3);
		}
		if(InputManager.isPressed(KeyEvent.VK_DOWN))
		{
			setPositionY(getPositionY()-1);
		}
		if(InputManager.isPressed(KeyEvent.VK_UP))
		{
			setPositionY(getPositionY()+1);
		}
		setPositionX(Clamp(getPositionX(), boat.getPositionX() - 100, boat.getPositionX() + 100));
		setPositionY(Clamp(getPositionY(), boat.getPositionY() - 300, boat.getPositionY() - 150));
	}

	private float Clamp(float current, float min, float max)
	{
		if (current <= max && current>=min)
		{
			return current;
		}
		if(current>max)
		{
			return max;
		}
		else
		{
			return min;
		}
	}
	@Override public void collisionReaction(GameObject collidedWith)
	{
		if(collidedWith.getName().equals("Log"))
		{
			GameLevelManager.goToLevel(new MainMenu());
		}
	}
}
