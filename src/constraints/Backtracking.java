/*
 * 		Backtracking.java
 * 
 * 		Created by Ryan Nyborg on 3/12/18.
 * 
 */

package constraints;

import java.util.ArrayList;

public class Backtracking {	
	
	public int solutionNum = 1;
	public int backtrackCounter = 0;
	
	public void Backtrack(int n, int firstColumnSelected, String type) {
        int[] a = new int[n];
        
        switch(type) {
        	case "chronological":
                ChronologicalBacktrack(a, 0, firstColumnSelected);
                System.out.print("Total number of backtracks before all solutions were found (or found there are no solutions): \n");
                System.out.print("Chronologic Backtracking: " + backtrackCounter + "\n\n");
                break;
        	case "forward":
        		System.out.print("Forward Checking not implemented.\n");
        		break;
        	case "directional":
        		System.out.print("Directional Arc Consistency Look-Ahead not implemented.\n");
        		break;
        }
    }

    public void ChronologicalBacktrack(int[] q, int k, int firstColumnSelected) {
        int n = q.length;
        int backtrackInSolution = 0;
        if (k == n) printQueens(q, firstColumnSelected, backtrackInSolution);
        else {
            for (int i = 0; i < n; i++) {
                q[k] = i;
                if (isConsistent(q, k, firstColumnSelected, backtrackInSolution)){
                	ChronologicalBacktrack(q, k+1, firstColumnSelected);
                }
            }
        }
    }

	public void ForwardChecking() {
		// Forward Checking
	}
	
	public void DirectionalArc() {
		// Full name: Directional Arc Consistency Look-Ahead
		
	}
	
    private void printQueens(int[] q, int firstColumnSelected, int backtrackInSolution) {
        int n = q.length;
        if(q[0] == firstColumnSelected){
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
		                if (q[i] == j) {
		                	int tempInteger = j + 65;
		                	char tempChar = (char) tempInteger;
		                	if(i == 0){
		                		System.out.print("Solution " + solutionNum + " with first Queen in 1" + tempChar + ":");
		                		System.out.println();
		                		solutionNum++;
		                	}
		                	System.out.print("Row " + (i+1) + ": " + (i+1) + tempChar);
		                }
	            	}
	            System.out.println();
	        }  
	    //System.out.print("Backtrack in this solution: " + backtrackInSolution + "\n");
        System.out.println();
        }
    }
	
	private boolean isConsistent(int[] q, int n, int firstColumnSelected, int backtrackInSolution) {
		if(q[0] == firstColumnSelected){
			for (int i = 0; i < n; i++) {
		            if (q[i] == q[n]){
		            	backtrackInSolution++;
		            	backtrackCounter++;
		            	return false;   // same column
		            }
		            if ((q[i] - q[n]) == (n - i)){
		            	backtrackInSolution++;
		            	backtrackCounter++;
		            	return false;   // same major diagonal
		            }
		            if ((q[n] - q[i]) == (n - i)){
		            	backtrackInSolution++;
		            	backtrackCounter++;
		            	return false;   // same minor diagonal
		            }
	        }
			return true;
		}
		return false;
    }
}
