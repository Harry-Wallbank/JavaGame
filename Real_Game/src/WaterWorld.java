import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;
import edu.digipen.level.GameLevel;
import edu.digipen.math.PFRandom;
import edu.digipen.text.FontTypes;
import edu.digipen.text.TextObject;

import java.awt.event.KeyEvent;
import java.util.Arrays;

public class WaterWorld extends GameLevel
{
	public static int coin =0;
	public static boolean Pause = true;
	public static int Index = 0;
	public static boolean Board[] = new boolean[19];
	public static int Index1 = 0;
	public static boolean Board1[] = new boolean[19];
	public static int Score = 0;
	TextObject text;

	@Override public void create()
	{
		Arrays.fill(Board, false);
		Arrays.fill(Board1,false);
		Water BackGround = new Water();
		GameObject Boat = new Boat();
		ObjectManager.addGameObject(Boat);
		Boat.setRectangleCollider(32,112);
		GameObject WakeBoard = new WakeBoard();
		ObjectManager.addGameObject(WakeBoard);
		WakeBoard.setRectangleCollider(9,28);

	}

	@Override public void initialize()
	{
		ObjectManager.unpauseAllObjects();
		text = new TextObject("text","You have "+coin+" coins",FontTypes.ARIAL_48);
	}
	@Override public void update(float v)
	{
		text.destroy();
		text.setText("You have "+coin+" coins");
		text.setZOrder(5);
		text.setPosition(-900,500);
		Index1 = PFRandom.randomRange(0, 18);
		if (!Board1[Index1]&&Score >= 19)
		{
			GameObject Log = new Log();
			ObjectManager.addGameObject(Log);
			Log.setRectangleCollider(50,11);
			Log.setPositionY(PFRandom.randomRange(30,40) * 23);
			Log.setPositionX(Index1 * 100 - 900);
			Board1[Index1] = true;
		}
			Index = PFRandom.randomRange(0, 18);
			if (!Board[Index])
			{
				GameObject Log = new Log();
				ObjectManager.addGameObject(Log);
				Log.setRectangleCollider(50,11);
				Log.setPositionY(PFRandom.randomRange(20,30) * 23);
				Log.setPositionX(Index * 100 - 900);
				Board[Index] = true;
			}

		if(InputManager.isTriggered(KeyEvent.VK_ESCAPE))
		{
			Pause = false;
			ObjectManager.pauseAllObjects();

			Resume Resume = new Resume();
			Resume.setZOrder(3);
			ObjectManager.addGameObject(Resume);

			Quit Quit = new Quit();
			Quit.setZOrder(3);
			ObjectManager.addGameObject(Quit);

			Cursor Cursor = new Cursor();
			Cursor.setZOrder(3);
			ObjectManager.addGameObject(Cursor);
		}
	}

	@Override public void uninitialize()
	{
	ObjectManager.removeAllObjects();
	}
}
