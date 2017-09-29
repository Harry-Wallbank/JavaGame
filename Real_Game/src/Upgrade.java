import edu.digipen.gameobject.GameObject;
import edu.digipen.level.GameLevel;
import edu.digipen.text.FontTypes;
import edu.digipen.text.TextObject;

public class Upgrade extends GameLevel
{
	TextObject text;
	@Override public void create()
	{
		GameObject Cursor = new Cursor();
		GameObject Back = new Back();
		GameObject TimeUpgrade = new TimeUpgrade();
	}

	@Override public void initialize()
	{
		text = new TextObject("text","You have "+WaterWorld.coin+" coins", FontTypes.ARIAL_48);
	}

	@Override public void update(float v)
	{
		text.destroy();
		text.setText("You have "+WaterWorld.coin+" coins");
		text.setZOrder(5);
		text.setPosition(-900,500);
	}

	@Override public void uninitialize()
	{

	}
}
