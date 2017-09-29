import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;

import java.awt.event.KeyEvent;

public class Log extends GameObject
{
	boolean a = true;
	boolean f = true;
	private float b =1.0f;
	static int slowDownTime = 0;
	private float timer = 0.0f;

	public Log()
	{
		super("Log",100,23,"Log.png");
		setZOrder(0);
	}
	@Override public void collisionReaction(GameObject collidedWith)
	{
		if(collidedWith.getName().equals("Player1"))
		{
			if(f)
			{
				WaterWorld.coin++;
				f =false;
			}
			a =true;
			setZOrder(-2);
		}
	}
	@Override public void update(float dt)
	{
		if(InputManager.isPressed(KeyEvent.VK_SHIFT) && slowDownTime >= 1 )
		{ timer+=dt;
			if(timer<=10)
			{
				b = 0.5f;
			}
			if(timer>10)
			{
				b=1.0f;
				slowDownTime--;
				timer=0;
			}
		}
		else
		{
			b = 1.0f;
		}
		if(WaterWorld.Pause)
		{
			setPositionY(getPositionY() - b);
			if (getPositionY() <= -540)
			{
				kill();
			}
			if (getPositionY() == -300)
			{
				WaterWorld.Board[WaterWorld.Index] = false;
				WaterWorld.Board1[WaterWorld.Index1] = false;
				WaterWorld.Score++;
				if(WaterWorld.Score ==20 )
				{
					WaterWorld.Score =0;
				}
			}
			setZOrder(0);
		}
	}

}
