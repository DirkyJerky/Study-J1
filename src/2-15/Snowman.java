import java.applet.Applet;
import java.awt.*;


public class Snowman extends Applet {
	private static final long serialVersionUID = 6482327669615985582L;

	public void paint (Graphics page) {

		final int MID = 170; // CHANGE: 150 -> 170
		final int WIDTH = 300; // CHANGE: Add this
		final int TOP = 50;

		setBackground (Color.cyan);

		page.setColor (Color.blue);
		page.fillRect (0, 175, 300, 50); // ground

		page.setColor (Color.yellow);
		page.fillOval (-40 + WIDTH, -40, 80, 80); // sun CHANGE: #1 -40 -> -40 + WIDTH

		page.setColor (Color.white);

		page.fillOval (MID-20, TOP, 40, 40); // head 
		page.fillOval (MID-35, TOP+35, 70, 50); // upper torso 
		page.fillOval (MID-50, TOP+80, 100, 60); // lower torso

		page.setColor(Color.red); // CHANGE: Add two red buttons
		page.fillOval(MID-4, TOP+45, 8, 8);
		page.fillOval(MID-5, TOP+60, 10, 10);

		page.setColor (Color.black);

		page.fillOval (MID-10, TOP+10, 5, 5); // left eye
		page.fillOval (MID+5, TOP+10, 5, 5); // right eye

		page.drawArc (MID-10, TOP+20, 20, 10, 10, 160); // smile CHANGE: #5 190 -> 10

		page.drawLine (MID-25, TOP+60, MID-50, TOP+40); // left arm
		page.drawLine (MID+25, TOP+60, MID+55, TOP+60); // right arm

		page.drawLine (MID-20, TOP+5, MID+20, TOP+5); // brim of hat
		page.fillRect (MID-15, TOP-20, 30, 25); // top of hat
		
		page.drawString("Geoff", 5, 20); // CHANGE: Me!
	}
}
