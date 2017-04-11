import java.awt.Graphics;

public class Rectangle extends Shape {

	public Rectangle(int sX, int sY, int eX, int eY, String color,
			String shapeType) {
		super(sX, sY, eX, eY, color, shapeType);
		// TODO Auto-generated constructor stub
	}

	public Rectangle(int sX, int sY, int eX, int eY, String color,
			String shapeType, boolean save) {
		// TODO Auto-generated constructor stub
		super(sX, sY, eX, eY, color, shapeType, save);
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(this.myColor(this.getColor()));
		g.drawRect(Math.min(this.getsX(), this.geteX()),
				Math.min(this.getsY(), this.geteY()),
				Math.abs(this.getsX() - this.geteX()),
				Math.abs(this.getsY() - this.geteY()));
	}

	@Override
	public void draw(Graphics g, double zoomLevel, int zoomStartX,
			int zoomEndX, int zoomStartY, int zoomEndY) {

		// g.setColor(this.myColor(this.getColor()));
		// Graphics2D g2 = image.createGraphics();
		// g2.drawImage(image, 0, 0, 1000, 1000, null);
		g.setColor(this.myColor(this.getColor()));
		int minX, minY, maxX, maxY, width, height;
		minX = Math.min(this.getsX(), this.geteX());
		minY = Math.min(this.getsY(), this.geteY());
		maxX = Math.max(this.getsX(), this.geteX());
		maxY = Math.max(this.getsY(), this.geteY());
		width = (int) ((maxX - minX) * zoomLevel);
		height = (int) ((maxY - minY) * zoomLevel);
		System.out.println("zoomStartX =" + zoomStartX + " " + " zoomStartY ="
				+ zoomStartY + " \n" + "zoomEndX =" + zoomEndX + " "
				+ " zoomEndY = " + zoomEndY + " ");
		System.out.println("minX =" + minX + " " + " minY =" + minY + " \n"
				+ "maxX = " + maxX + " maxY = " + maxY);
		// if (minX >= zoomStartX && maxX <= zoomEndX && minY >= zoomStartY
		// && maxY <= zoomEndY) {
		
		minX -= zoomStartX;
		minY -= zoomStartY;
		g.drawRect((int) (minX * zoomLevel), (int) (minY * zoomLevel), width,
				height);
		// }
		// g.drawImage(image, 0, 0, 10, 10, null);
		// TODO Auto-generated method stub

	}
}
