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
	protected Point position; // holds position of tower
	protected Image tower; // holds tower image
	protected int anchorX; // shifts X coordinate
	protected int anchorY; // shifts Y coordinate
	protected double timeSinceLastFire;// time since last effect was fired
	protected int id; // id of the tower

	public void draw(Graphics g) {
		// Draws tower object to location specified by user
		g.drawImage(tower, position.x + anchorX, position.y + anchorY, null);

		// Draws dot on Enemy's (x, y) coordinates
		// g.setColor(Color.WHITE);
		// g.fillOval(position.getX(), position.getY(), 5, 5);
	}

	/**
	 * 
	 * @param c
	 */
	public void setPosition(Point c) {
		position = c;
	}

	abstract void interact(Game game, double deltaTime);

	abstract void drawMaker(Graphics g);

}
