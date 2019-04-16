import java.awt.Color;
import java.awt.Graphics;

public abstract class Polygon extends Shape
{

	public Polygon(Color color, boolean filled) 
	{
		 super(color, filled);
	}
	
	public void draw(Graphics graphics)
	{
		graphics.setColor(this.getColor());
		
		int val = location.length;
		int[] x = new int[val];
		int[] y = new int[val];

		for(int index = 0; index < location.length; ++index)
		{
			x[index] = location[index].x;
			y[index] = location[index].y;
		}
	
		if(this.isFilled()) 
		{
			graphics.fillPolygon(x, y, val);
		}
		graphics.drawPolygon(x, y, val);
	}
}
