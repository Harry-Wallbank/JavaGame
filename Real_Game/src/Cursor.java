import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;
import edu.digipen.graphics.Graphics;
import edu.digipen.math.Vec2;

public class Cursor extends GameObject
{
	public Cursor()
	{
		super("Cursor_", 26, 49, "Cursor_.png");
		setRectangleCollider(13, 24);
		Graphics.hideMouseCursor();
		setZOrder(10000);
	}
	@Override public void update(float dt)
	{

		Vec2 mousePos = InputManager.getMousePosition();
		mousePos = Vec2.subtract(mousePos, new Vec2(960,540));
		mousePos = new Vec2(mousePos.getX(), -mousePos.getY());
		setPosition(mousePos);

	}
}
