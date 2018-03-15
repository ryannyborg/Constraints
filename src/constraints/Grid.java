package constraints;

public class Grid {
	
	public static final int GRID_WIDTH = 8;
	public static final int GRID_HEIGHT = 8;

	public char[][] MakeGrid (String startingQueenPosition) {
		// For this program, grid is by default 8x8
		
		char[] startingPositionArray = startingQueenPosition.toCharArray();
		
		// Convert letters to numbers ex: 1A = (0,0)
		int startingRow = startingPositionArray[0] - 49; // subtract by 49 because the ASCII value of '1' is 49
		int startingColumn = startingPositionArray[1] - 65; // subtract by 65 because the ASCII value of 'A' is 65
		
		char [][] gridArray = new char [GRID_HEIGHT][GRID_WIDTH];

		for(int i = 0; i < GRID_HEIGHT; i++) {
			for(int j=0; j < GRID_WIDTH; j++) {
				if(i == startingRow && j == startingColumn) {
					gridArray[i][j] = 'Q'; // queen placed (labeled=*)
				} else {
				gridArray[i][j] = '-'; // assign unlabeled indicator
				}
//				System.out.print(gridArray[i][j]);
			}
//			System.out.print("\n");
		}
		
		return gridArray;
	}
	
	public void PrintGrid (char [][] gridArray) {
		for(int i = 0; i < GRID_HEIGHT; i++) {
			for(int j=0; j < GRID_WIDTH; j++) {
				if(gridArray[i][j] == '-') {
					System.out.print("- ");
				} else if (gridArray[i][j] == 'Q') {
					System.out.print("Q ");
				}	else {
					System.out.print(gridArray[i][j]);
				}
			}
			System.out.print("\n");
		}
	}
	
	public int [] GetUnlabelledColumns (char [][] gridArray) {
		
		int [] unlabelled = new int [7];
		
		int exclude = -1; // initialize variable to exclude
		
		for(int i = 0; i < GRID_HEIGHT; i++) {
			for(int j=0; j < GRID_WIDTH; j++) {
				if (gridArray[i][j] == 'Q') {
					exclude = j;
				}
			}
		}
	
		if(exclude == -1) {
			unlabelled[0] = -1; // error
		} else {
			int j = 0;
			for(int i=0; i < GRID_WIDTH; i++) {
				if(i != exclude) {
					unlabelled[j] = i;
					j++;
				}
			}
		}
		return unlabelled;
	}
	
	public int [] GetLabelledColumns (char [][] gridArray) {
		int [] labelled = new int [7];
		
		int include = -1;
		
			for(int i = 0; i < GRID_HEIGHT; i++) {
				for(int j=0; j < GRID_WIDTH; j++) {
					if (gridArray[i][j] == 'Q') {
						include = j;
						labelled[0] = include;
					}
				}
			}
		return labelled;
	}
	
} // end class
