package Assignment1;
/**
* @author	Anh P. Trinh
* 
*	DrawingViewer class: main method
* 		Creating the frame for drawing
*/
import javax.swing.JFrame;

public class DrawingViewer{

	public static void main(String[] args) {
		
		/** Creating a frame that:
		 * with title "Drawing Frame"
		 * size 400x400
		 * not able to resizable
		 */
		JFrame f = new JFrame("Drawing Frame");
		f.setSize(400,400);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/** Add components in DrawingComponent class to the frame */
		f.add(new DrawingComponent());
		f.setVisible(true);
	}
}
