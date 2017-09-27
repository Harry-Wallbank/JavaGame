import edu.digipen.gameobject.GameObject;
public class Water extends GameObject
{
	public Water()
	{
		super("Water",122880,69120,"Water.png");
		setZOrder(-1);
	}
	@Override public void update(float dt)
	{
		setPositionY(getPositionY()-10);
		if(getPositionY()<=-3500)
		{
			setPositionY(3500);
		}
	}
}
