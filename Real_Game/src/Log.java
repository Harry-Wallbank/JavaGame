import edu.digipen.gameobject.GameObject;

public class Log extends GameObject
{
	public Log()
	{
		super("Log",100,23,"Log.png");
	}

	@Override public void update(float dt)
	{
		setPositionY(getPositionY()-1);
		if(getPositionY() == -540)
		{
			kill();
			System.out.println("object is at end");
			WaterWorld.b--;
		}
	}
}
