import edu.digipen.gameobject.GameObject;

public class Barrel extends GameObject
{

	public Barrel()
	{
		super("Barrel",30,20,"Barrel.png");
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
