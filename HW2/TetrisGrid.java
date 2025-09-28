package HW2;

public class TetrisGrid {
	
	/**
	 * Constructs a new instance with the given grid.
	 * Does not make a copy.
	 * @param grid
	 */
    private boolean[][] grid;

	public TetrisGrid(boolean[][] grid) {
        this.grid = grid;
	}
	
	
	/**
	 * Does row-clearing on the grid (see handout).
	 */
	public void clearRows() {
        for( int r = grid.length - 1; r >= 1; r-- ) {
            for( int c = 0; c < grid[0].length; c++ ) {
                grid[r][c] = grid[r-1][c];
            }
        }
        for( int c = 0; c < grid[0].length; c++ ) {
            grid[0][c] = false;
        }
	}
	
	/**
	 * Returns the internal 2d grid array.
	 * @return 2d grid array
	 */
	boolean[][] getGrid() {
		return grid; // YOUR CODE HERE
	}
}