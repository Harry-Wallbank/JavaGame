import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;
import edu.digipen.level.GameLevel;
import edu.digipen.math.PFRandom;

public class WaterWorld extends GameLevel
{
	public static int a =0;
	public static int b =0;
	public static int index = 0;
	public static boolean board[] = new boolean[19];
	@Override public void create()
	{
	}

	@Override public void initialize()
	{
		GameObject Boat = new Boat();
		ObjectManager.addGameObject(Boat);

		GameObject BackGround = new Water();
		ObjectManager.addGameObject(BackGround);

		GameObject WakeBoard = new WakeBoard();
		ObjectManager.addGameObject(WakeBoard);

	}

	@Override public void update(float v)
	{
		if (a <=10)
		{
			GameObject Barrel = new Barrel();
			ObjectManager.addGameObject(Barrel);
			Barrel.setPositionY(500);

			a++;
		}
		if(b <=10)
		{
			index = PFRandom.randomRange(0,19);
			if(board[index])
			{
				GameObject Log = new Log();
				ObjectManager.addGameObject(Log);
				Log.setPositionY(500);
				Log.setPositionX(index * 100);
				board[index] =false;
				b++;
			}
		}
	}

	@Override public void uninitialize()
	{

	}
}
