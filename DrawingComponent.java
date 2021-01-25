package Assignment1;
/**
* @author 		Anh P. Trinh
* 
* DrawingComponent class:
* 		Responsible for displaying drawing
*/
import javax.swing.JPanel;
import java.awt.*;

public class DrawingComponent extends JPanel {
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		Graphics2D g2 = (Graphics2D) g;
		Drawing drawing = new Drawing();
		
		/** Text displayed as graphic */
		g.drawString("4 filled pink rectangles, 4 blue lines, and 8 red ellipse.",80,20);
		
		/** A loop to display multiple drawing by calling draw methods from Drawing class*/
		int k = 50;
		for (int i = 0; i<4; i++) {			
			k+= 20;

			g2.setColor(Color.BLUE);
			drawing.line(10, 200+k, 300, 400, g2);
			
			g2.setColor(Color.PINK);
			drawing.rect(k-50, k-40, 10, k+20, g2);
			
			g2.setColor(Color.RED);
			drawing.ellip(120+k, 200, 100, 60, g2);
			drawing.ellip(240, 80+k, 60, 100, g2);	
		}
	}
}
