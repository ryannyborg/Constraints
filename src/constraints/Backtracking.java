/*
 * 		Backtracking.java
 * 
 * 		Created by Ryan Nyborg on 3/12/18.
 * 
 */

package constraints;

import java.util.ArrayList;

public class Backtracking {
	
	public static final int GRID_WIDTH = 8;
	public static final int GRID_HEIGHT = 8;	
	
	private char [][] BTMinus1 (int [] unlabelled, int [] labelled, char[][] grid) {
		
		ArrayList<Integer> unlabelledDynamic = new ArrayList<Integer>();
		
		for(int i=0; i<unlabelled.length; i++) {
			unlabelledDynamic.add(unlabelled[i]);
		}
		
		if(unlabelledDynamic.size() == 0) {
			return grid;
		} else {
			int x = unlabelledDynamic.get(0);
			for (int i=0; i < GRID_HEIGHT; i++) {
				if(ConsistentCheck(labelled)) {
					
				}
				
			}
//			return fail;
		}
		return grid;
	}
	
	private boolean ConsistentCheck(int [] labelledColumns) {
		// checks each constraint
		
		return true;
	}
	
	public void BT(int [] unlabelled, int [] labelled, char[][] grid) {
		/* This function runs the 8-queen problem using simple chronological
		 * backtracking. 
		*/
		
		// store the solution grids into an ArrayList
		ArrayList<char[][]> solutions = new ArrayList<char[][]>(); 
		ArrayList<char[][]> incorrect = new ArrayList<char[][]>();
		
		int labelColCount = 0;
		int labelRowCount = 0;
		int [] labelledRow = new int [8];
		
		
		for(int i=0; i<GRID_WIDTH; i++) {
			for(int j=0; j<GRID_HEIGHT; j++) {
				
				if(grid[i][j] == '-') {
					//check surrounding cells
					
					
					
				} else if(grid[i][j] == 'Q') {
					labelled[labelColCount] = i;
					labelColCount++;
					labelledRow[labelRowCount] = j;
					labelRowCount++;
				}
				
			}
		}
		
//		BTMinus1(unlabelled, labelled, grid);

	}

	public void ForwardChecking() {
		// 
	}
	
	public void DirectionalArc() {
		// Full name: Directional Arc Consistency Look-Ahead
		
	}

}
