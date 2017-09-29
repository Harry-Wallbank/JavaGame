import edu.digipen.gameobject.GameObject;
import edu.digipen.level.GameLevel;

public class HelpW extends GameLevel
{
	@Override public void create()
	{
		GameObject background = new Water();
		GameObject Controls = new GameObject("control",400,800,"controls.png");
		Controls.setPositionX(-400);
		GameObject Back = new Back();
		Back.setPositionX(400);
		GameObject cursor = new Cursor();
		GameObject Help = new GameObject("Help",400,800,"Description.png");
		Help.setPositionX(400);

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
