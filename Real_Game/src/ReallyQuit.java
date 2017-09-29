import edu.digipen.gameobject.GameObject;
import edu.digipen.level.GameLevel;

public class ReallyQuit extends GameLevel
{
	@Override public void create()
	{
		GameObject Background = new Water();
		GameObject Cursor = new Cursor();
		GameObject NotReally = new NotReally();
		GameObject No = new No();
		GameObject Yes = new Yes();
	}

	@Override public void initialize()
	{

	}

	@Override public void update(float v)
	{

	}

	@Override public void uninitialize()
	{

	}
}
