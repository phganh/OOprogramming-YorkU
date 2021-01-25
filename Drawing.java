package Assignment1;

/**
* @author 		Anh P. Trinh
* 
* Drawing class:
* 		Responsible for drawing graphic	
*/

import java.awt.Graphics2D;
import java.awt.geom.*;

public class Drawing {

	/** Draw line method 
	 * @param x1 of starting point
	 * @param y1 of starting point
	 * @param x2 of ending point 
	 * @param y2 of ending point
	 * @param g - Graphics class
	 * */
	public void line(int x1, int y1, int x2, int y2, Graphics2D g2) {
		g2.draw(new Line2D.Double(x1,y1,x2,y2));
	}
	
	/** Draw filled rectangle method
	 * @param x of starting point
	 * @param y of starting point
	 * @param w - width of the rectangle
	 * @param h - height of the rectangle
	 * @param g - Graphics class
	 * */
	public void rect(int x, int y, int w, int h, Graphics2D g2) {
		g2.fill(new Rectangle2D.Double(x,y,w,h));
	}
	
	/** Draw ellipse method	 
	 * @param x of starting point
	 * @param y of starting point
	 * @param w - width of the ellipse
	 * @param h - height of the ellipse
	 * @param g2 - Graphics2D class
	 * */
	public void ellip(double x, double y, double w, double h, Graphics2D g2) {	
		g2.draw(new Ellipse2D.Double(x,y,w,h));
	}	
}