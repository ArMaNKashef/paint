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


	@Override
	public void draw(Graphics g, double zoomLevel, int zoomStartX,
			int zoomEndX, int zoomStartY, int zoomEndY) {

		// g.setColor(this.myColor(this.getColor()));
		// Graphics2D g2 = image.createGraphics();
		// g2.drawImage(image, 0, 0, 1000, 1000, null);
		g.setColor(this.myColor(this.getColor()));
		int minX, minY, maxX, maxY;
		minX = Math.min(this.getsX(), this.geteX());
		minY = Math.min(this.getsY(), this.geteY());
		maxX = Math.max(this.getsX(), this.geteX());
		maxY = Math.max(this.getsY(), this.geteY());
		System.out.println("zoomStartX =" + zoomStartX + " " + " zoomStartY ="
				+ zoomStartY + " \n" + "zoomEndX =" + zoomEndX + " "
				+ " zoomEndY = " + zoomEndY + " ");
		System.out.println("minX =" + minX + " " + " minY =" + minY + " \n"
				+ "maxX = " + maxX + " maxY = " + maxY);
		// if (minX >= zoomStartX && maxX <= zoomEndX && minY >= zoomStartY
		// && maxY <= zoomEndY) {
		minX -= zoomStartX;
		minY -= zoomStartY;
		g.drawLine((int) (minX * zoomLevel), (int) (minY * zoomLevel),
				(int) (maxX * zoomLevel), (int) (maxY * zoomLevel));
		// }
		// g.drawImage(image, 0, 0, 10, 10, null);
		// TODO Auto-generated method stub

	}


}
