import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Oval extends Shape
{
	private int diameter1;
	private int diameter2;

	public Oval(Point pointUL, int d1, int d2, Color color, boolean filled)
	{
		super(color, filled);
		this.diameter1 = d1;
		this.diameter2 = d2;
	}
	
	public int getDiameter1()
	{
		return diameter1;
		
	}
	
	public int getDiameter2()
	{
		return diameter2;
		
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
			graphics.fillOval(, , diameter1, diameter2);
		}
		graphics.drawOval(, , diameter1, diameter2);
		
	}

}
