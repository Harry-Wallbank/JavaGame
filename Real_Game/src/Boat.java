import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;
import edu.digipen.graphics.Graphics;
import edu.digipen.math.Vec2;

import java.awt.event.KeyEvent;

public class Boat extends GameObject
{
	private int Heatlh = 2;
	public Boat()
	{
		super("Player1",128,224,"Boat.png");
		setZOrder(1);
	}
	@Override public void update(float dt)
	{
		if(InputManager.isPressed(KeyEvent.VK_A) && getPositionX()>=-930)
		{
			setPositionX(getPositionX()-2);

		}
		if(InputManager.isPressed(KeyEvent.VK_D) && getPositionX()<=930)
		{
			setPositionX(getPositionX()+2);
		}
		Graphics.setCameraPosition(Vec2.scale(getPosition(),1.0f));
	}
}
