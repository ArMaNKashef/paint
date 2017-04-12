import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MyBtnListener implements ActionListener {

	private MyCanvas myCanvas;
	private JButton button;

	public MyBtnListener(MyCanvas myCanvas, JButton button) {
		// TODO Auto-generated constructor stub
		this.myCanvas = myCanvas;
		this.button = button;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		switch (this.button.getName()) {
		case "btnRectangle":
			this.myCanvas.setShapeType("rectangle");
			this.myCanvas.setZoomOption(1, 0, 500, 0, 500);
			this.myCanvas.repaint();
			break;
		case "btnCircle":
			this.myCanvas.setShapeType("circle");
			this.myCanvas.setZoomOption(1, 0, 500, 0, 500);
			this.myCanvas.repaint();
			break;
		case "btnLine":
			this.myCanvas.setShapeType("line");
			this.myCanvas.setZoomOption(1, 0, 500, 0, 500);
			this.myCanvas.repaint();
			break;

		case "btnZoom":
			this.myCanvas.setShapeType("zoom");
			//this.myCanvas.setZoomLevel(2);
			break;
		case "btnSelect":
			this.myCanvas.repaint();
			this.myCanvas.setShapeType("select");
			this.myCanvas.setZoomOption(1, 0, 500, 0, 500);
			break;
		default:
			this.myCanvas.setShapeType("line");
			this.myCanvas.setZoomOption(1, 0, 500, 0, 500);
			this.myCanvas.repaint();
			break;
		}
	}

}
