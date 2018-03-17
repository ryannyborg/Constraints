/*
 * 		EightQueensSolver.java
 * 
 * 		Created by Ryan Nyborg on 3/12/18.
 * 		Project: 8 Queens Problem Solver
 * 
 * 		Description: Given the position of the first queen, the program generates the positions
 * 		for the remaining queens, if there is a solution to the problem consistent with this
 * 		assignment. The program also gives a count for the number of backtracks made to the
 * 		assigned value to the queen in each row until a solution is found.
 * 
 * 		Implementations developed to solve the 8-queens problem include:
 * 			1.) Simple Chronological Backtracking
 * 			2.) Forward Checking
 * 			3.) Directional Arc Consistency Look-Ahead
 * 
 */

package constraints;
import java.lang.reflect.Array;
import java.util.Scanner;

public class EightQueensSolver {
	
	/* Solver is kicked off here */
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Backtracking solutionMethods = new Backtracking();
		//Grid grid = new Grid();
		
		String startingQueen = "";
		int positionOne = -1;
		int positionTwo = -1;
		
		while(startingQueen.length() != 2 || positionTwo < 65 || positionTwo > 72 || positionOne != 49) {
			System.out.print("Please enter the position of a queen:\n");
			startingQueen = scanner.nextLine();
			positionOne = startingQueen.charAt(0);
			positionTwo = startingQueen.charAt(1);
			
			if(startingQueen.length()!=2) {
				System.out.print("Incorrect position. Must be 2 characters.\n");
			} else {
				if(positionOne != 49) {
					// ASCII value of 49 = 1; 56 = 8
					System.out.print("First character must 1. Please try again.\n");
				}
				if(positionTwo < 65 || positionTwo > 72) {
					// ASCII value of 65 = A; 72 = H
					System.out.print("Second character must be between A-H. Please try again.\n");
				}
				System.out.print("\n");
			}
		}
		
//		char [][] startingGrid = grid.MakeGrid(startingQueen);
//		
//		grid.PrintGrid(startingGrid);
//		int [] unlabelledColumns = grid.GetUnlabelledColumns(startingGrid);
//		int [] labelledColumns = grid.GetLabelledColumns(startingGrid);
		
		int initialColumn = positionTwo - 65;
		
		solutionMethods.Backtrack(8, initialColumn);
		
		scanner.close();
	}
	
}
