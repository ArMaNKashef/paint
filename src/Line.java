import java.awt.Graphics;

public class Line extends Shape {

	public Line(int sX, int sY, int eX, int eY, String color, String shapeType) {
		super(sX, sY, eX, eY, color, shapeType);
		// TODO Auto-generated constructor stub
	}

	public Line(int sX, int sY, int eX, int eY, String color, String shapeType,
			boolean save) {
		super(sX, sY, eX, eY, color, shapeType, save);
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub

		g.setColor(this.myColor(this.getColor()));
		g.drawLine(this.getsX(), this.getsY(), this.geteX(), this.geteY());
	}

}
