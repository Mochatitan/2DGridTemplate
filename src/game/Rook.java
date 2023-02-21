package game;

import java.awt.Point;
import java.util.List;
import java.awt.Graphics;

/**
 * This class creates a single rook piece
 * 
 * @author basilvetas
 */
public class Rook extends Piece {
	/**
	 * Constructor
	 */
	public Rook(Point initPos) {
		ImageLoader loader = ImageLoader.getLoader();
		this.tower = loader.getImage("resources/sun.png");
		this.pos = initPos;
	}


	
}
