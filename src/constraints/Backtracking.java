/*
 * 		Backtracking.java
 * 
 * 		Created by Ryan Nyborg on 3/12/18.
 * 
 */

package constraints;

import java.util.ArrayList;

public class Backtracking {	
	
	private static boolean isConsistent(int[] q, int n) {
        for (int i = 0; i < n; i++) {
            if (q[i] == q[n])             return false;   // same column
            if ((q[i] - q[n]) == (n - i)) return false;   // same major diagonal
            if ((q[n] - q[i]) == (n - i)) return false;   // same minor diagonal
        }
        return true;
    }
	
	public static void Backtrack(int n) {
        int[] a = new int[n];
        Backtrack(a, 0);
    }

    public static void Backtrack(int[] q, int k) {
        int n = q.length;
        if (k == n) printQueens(q);
        else {
            for (int i = 0; i < n; i++) {
                q[k] = i;
                if (isConsistent(q, k)) Backtrack(q, k+1);
            }
        }
    }  
    
    public static void printQueens(int[] q) {
        int n = q.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (q[i] == j) System.out.print("Q ");
                else           System.out.print("* ");
            }
            System.out.println();
        }  
        System.out.println();
    }

	public void ForwardChecking() {
		// 
	}
	
	public void DirectionalArc() {
		// Full name: Directional Arc Consistency Look-Ahead
		
	}

}
