import edu.digipen.gameobject.GameObject;
import edu.digipen.graphics.Graphics;
import edu.digipen.level.GameLevel;
import edu.digipen.text.FontTypes;
import edu.digipen.text.TextObject;

public class MainMenu extends GameLevel
{
	TextObject text;
	@Override public void create()
	{
		GameObject Background = new Water();
		GameObject Start = new Start();
		GameObject Help = new Help();
		GameObject Upgrades = new Powerupds();
		GameObject Quit = new Quit();
		GameObject Cursor = new Cursor();

	}

	@Override public void initialize()
	{
		Graphics.setCameraPosition(0.0f,0.0f);
		text = new TextObject("text","You have "+WaterWorld.coin+" coins", FontTypes.ARIAL_48);
	}

	@Override public void update(float v)
	{		text.destroy();
		text.setText("You have "+WaterWorld.coin+" coins");
		text.setZOrder(5);
		text.setPosition(-900,500);

	}

	@Override public void uninitialize()
	{

	}
}
