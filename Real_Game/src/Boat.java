import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;

import java.awt.event.KeyEvent;

public class Boat extends GameObject
{
	public Boat()
	{
		super("Player1",128,224,"Boat.png");
		setZOrder(2);
	}

	@Override public void update(float dt)
	{
		if(InputManager.isPressed(KeyEvent.VK_A) && getPositionX()>=-830)
		{
			setPositionX(getPositionX()-2);

		}
		if(InputManager.isPressed(KeyEvent.VK_D) && getPositionX()<=830)
		{
			setPositionX(getPositionX()+2);
		}
	}
}
