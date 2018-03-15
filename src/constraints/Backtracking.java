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
	
	private char [][] BTMinus1 (char [][] unlabelled, char [][] labelled) {
		if(unlabelled.length == 0) {
			return labelled;
		} else {
			char x = unlabelled[0][0];
			for (int i=0; i < unlabelled.length; i++) {
//				if (ConsistentCheck()) {
//					boolean result = BTMinus1();
//				}
			}
//			return fail;
		}
		return unlabelled;
	}
	
	private void ConsistentCheck(int [] labelledColumns) {
		// checks each constraint
		
		
	}
	
	public void BT(char [][] variables) {
		/* This function runs the 8-queen problem using simple chronological
		 * backtracking. 
		*/
		
		// store the solution grids into an ArrayList
		ArrayList<char[][]> solutions = new ArrayList<char[][]>(); 
		ArrayList<char[][]> incorrect = new ArrayList<char[][]>();
		
		char [][] labelled = new char [GRID_WIDTH][GRID_HEIGHT];
		
		BTMinus1(variables, labelled);

	}

	public void ForwardChecking() {
		// 
	}
	
	public void DirectionalArc() {
		// Full name: Directional Arc Consistency Look-Ahead
		
	}

}
