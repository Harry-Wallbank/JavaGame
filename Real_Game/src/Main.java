import edu.digipen.Game;

public class Main
{

    public static void main(String[] args)
    {
        Game.initialize(1920,1080,60, new WaterWorld());
        while (Game.getQuit()==false)
        {
            Game.update();
        }
        Game.destroy();
    }
}
