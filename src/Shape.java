import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape {
	private int sX;
	private int sY;
	private int eX;
	private int eY;
	private String color;
	private String shapeType;
	private boolean save;

	public Shape(int sX, int sY, int eX, int eY, String color, String shapeType) {
		this.setsX(sX);
		this.sY = sY;
		this.eX = eX;
		this.eY = eY;
		this.color = color;
		this.shapeType = shapeType;
		this.setSave(false);
	}

	public Shape(int sX, int sY, int eX, int eY, String color,
			String shapeType, boolean save) {
		this(sX, sY, eX, eY, color, shapeType);
		this.setSave(save);
	}

	protected Color myColor(String color) {
		if (color != null) {
			switch (color) {
			case "black":
				return Color.black;
			case "blue":
				return Color.blue;
			case "green":
				return Color.green;
			case "red":
				return Color.red;
			case "yellow":
				return Color.yellow;
			default:
				return Color.black;
			}
		}
		return Color.black;
	}

	public int getsY() {
		return sY;
	}

	public void setsY(int sY) {
		this.sY = sY;
	}

	public int geteX() {
		return eX;
	}

	public void seteX(int eX) {
		this.eX = eX;
	}

	public int geteY() {
		return eY;
	}

	public void seteY(int eY) {
		this.eY = eY;
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

	public abstract void draw(Graphics g);

	public int getsX() {
		return sX;
	}

	public void setsX(int sX) {
		this.sX = sX;
	}

	public boolean isSave() {
		return save;
	}

	public void setSave(boolean save) {
		this.save = save;
	}

}
