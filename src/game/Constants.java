package game;

public final class Constants {
    private Constants() {
        // no need for constructor
    }
    
    
    // controls the delay between each tick in ms
    private final int DELAY = 25;
    // controls the size of the board
    public static final int TILE_SIZE = 50;
    public static final int ROWS = 10;
    public static final int COLUMNS = 10;
    // controls how many apples appear on the board
    public static final int NUM_APPLES = 5;
    // suppress serialization warning
    private static final long serialVersionUID = 490905409104883233L;

}
