package game;

import java.util.List;
import java.awt.Graphics;
import java.awt.Point;

/**
 * This class creates a single pawn piece
 * 
 * @author basilvetas
 */
public class Pawn extends Piece {
	/**
	 * Constructor
	 */
	public Pawn(Point initPos) {
		ImageLoader loader = ImageLoader.getLoader();
		this.image = loader.getImage("resources/blackhole.png");
		this.pos = initPos;
	}

	

}
