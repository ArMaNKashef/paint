import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.image.ImageProducer;
import java.util.ArrayList;

public class MyCanvas extends Canvas {
	private static final long serialVersionUID = 1L;
	private ArrayList<Shape> list;
	private Shape shape;
	private String color;
	private String shapeType;
	
	private BufferedImage image;
	private Graphics graphic;
	private double zoomLevel = 1;
	private int zoomStartX = 0;
	private int zoomEndX = 500;
	private int zoomStartY = 0;
	private int zoomEndY = 500;
	private int coorReferenceX = 0;
	private int coorReferenceY = 0;

	public int getCoorReferenceX() {
		return coorReferenceX;
	}

	public void setCoorReferenceX(int coorReferenceX) {
		this.coorReferenceX = coorReferenceX;
	}

	public int getCoorReferenceY() {
		return coorReferenceY;
	}

	public void setCoorReferenceY(int coorReferenceY) {
		this.coorReferenceY = coorReferenceY;
	}

	public int getZoomStartX() {
		return zoomStartX;
	}

	public void setZoomStartX(int zoomStartX) {
		this.zoomStartX = zoomStartX;
	}

	public int getZoomEndX() {
		return zoomEndX;
	}

	public void setZoomEndX(int zoomEndX) {
		this.zoomEndX = zoomEndX;
	}

	public int getZoomStartY() {
		return zoomStartY;
	}

	public void setZoomStartY(int zoomStartY) {
		this.zoomStartY = zoomStartY;
	}

	public int getZoomEndY() {
		return zoomEndY;
	}

	public void setZoomEndY(int zoomEndY) {
		this.zoomEndY = zoomEndY;
	}

	public double getZoomLevel() {
		return zoomLevel;
	}
=======
>>>>>>> parent of c44ba57... zoom added

	public Graphics getGraphic() {
		return graphic;
	}
	public void setGraphic(Graphics graphic) {
		this.graphic = graphic;
	}
	public BufferedImage getImage() {
		return image;
	}
	public void setImage(BufferedImage image) {
		this.image = image;
	}

	public void setZoomOption(double zoomLevel, int zoomStartX, int zoomEndX,
			int zoomStartY, int zoomEndY, int coorX, int coorY) {
		setZoomLevel(zoomLevel);
		setZoomStartX(zoomStartX);
		setZoomStartY(zoomStartY);
		setZoomEndX(zoomEndX);
		setZoomEndY(zoomEndY);
		setCoorReferenceX(coorX);
		setCoorReferenceY(coorY);

	}

	// private Image Scale (Image img , int height, int width){
	// BufferedImage newImg = new BufferedImage(width, height,
	// BufferedImage.TYPE_INT_RGB);
	// Graphics2D g2 = newImg.createGraphics();
	// g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
	// RenderingHints.VALUE_INTERPOLATION_BILINEAR);
	// g2.drawImage(img, 0, 0, width, height, null);
	// g2.dispose();
	// return newImg;
	// }

	public MyCanvas(ArrayList<Shape> list) {
		System.out.println(zoomStartX + " " + zoomStartY + " \n" + zoomEndX
				+ " " + zoomEndY + " ");
		// setImage(new BufferedImage(500, 500, BufferedImage.TYPE_4BYTE_ABGR));
=======
	
	private Image Scale (Image img , int height, int width){
		BufferedImage newImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		Graphics2D g2 = newImg.createGraphics();
		g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		g2.drawImage(img, 0, 0, width, height, null);
		g2.dispose();
		return newImg;
	}
	
	public MyCanvas(ArrayList<Shape> list) {
		setImage(new BufferedImage(500, 500, BufferedImage.TYPE_4BYTE_ABGR));
>>>>>>> parent of c44ba57... zoom added
		this.setList(list);
		MyMouseListener myMouseListener = new MyMouseListener(this);
		this.addMouseListener(myMouseListener);
		this.addMouseMotionListener(myMouseListener);
		this.setSize(500, 500);
		this.setBackground(Color.white);
	}

	public void paint(Graphics g) {
		// super.paint(g);
<<<<<<< HEAD
		// Image img = Scale(getImage(), 100, 100);
		// setGraphic(getImage().getGraphics());
		for (Shape shape : this.list) {
			shape.draw(g, zoomLevel, zoomStartX, zoomEndX, zoomStartY,
					zoomEndY, coorReferenceX, coorReferenceY);
		}
		if (this.shape != null) {
			this.shape.draw(g, zoomLevel, zoomStartX, zoomEndX, zoomStartY,
					zoomEndY, coorReferenceX, coorReferenceY);
		}
		setCoorReferenceX(zoomStartX);
		setCoorReferenceY(zoomStartY);
		// setImage(new BufferedImage(500, 500, BufferedImage.TYPE_4BYTE_ABGR));
		// int newImageWidth = 10;
		// int newImageHeight = 10;

		// g2.drawImage(image, 0, 0, newImageWidth , newImageHeight , null);
		// g2.dispose();
		// g.drawImage(image, 100, 1, 1000, 1000, null);
=======
		setImage(new BufferedImage(500, 500, BufferedImage.TYPE_INT_RGB));
		Image img = Scale(getImage(), 100, 100);
		setGraphic(getImage().getGraphics());
		for (Shape shape : this.list) {
			shape.draw(g);
		}
		if (this.shape != null) {
			this.shape.draw(g);
		}
		int newImageWidth = 10000;
		int newImageHeight = 10000;
		
//		g2.drawImage(image, 0, 0, newImageWidth , newImageHeight , null);
//		g2.dispose();
		//g.drawImage(image, 100, 1, 1000, 1000, null);
>>>>>>> parent of c44ba57... zoom added
	}

	public ArrayList<Shape> getList() {
		return list;
	}

	public void setList(ArrayList<Shape> list) {
		this.list = list;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getShapeType() {
		return shapeType;
	}

	public void setShapeType(String shapeType) {
		this.shapeType = shapeType;
	}

	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}

}
