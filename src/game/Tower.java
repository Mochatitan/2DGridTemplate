package game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;

/**
 * This is an abstract superclass for a tower in the game
 * 
 * @author basilvetas
 *
 */
abstract public class Tower {
	/* instance variables */
	protected Point pos; // holds position of tower
	protected Image image; // holds tower image
	protected double timeSinceLastFire;// time since last effect was fired
	protected int id; // id of the tower

	public void draw(Graphics g) {
		// Draws tower object to location specified by user
		g.drawImage(image, pos.x, pos.y + anchorY, null);

		// Draws dot on Enemy's (x, y) coordinates
		// g.setColor(Color.WHITE);
		// g.fillOval(position.getX(), position.getY(), 5, 5);
	}

	/**
	 * 
	 * @param c
	 */
	public void setPosition(Point newPos) {
		position = newPos;
	}

	abstract List<Point> ValidLocations();

	

}
