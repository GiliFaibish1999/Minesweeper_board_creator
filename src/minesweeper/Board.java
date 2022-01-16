package minesweeper;

import java.util.ArrayList;

public class Board {

	// Variable definitions
	private int[][] twoD_arr;
	private ArrayList<Pair> emptySpots;

	// Board object creation
	public Board(int bombs, int board_size) {
		twoD_arr = new int[board_size][board_size];
		emptySpots = new ArrayList<Pair>();
		
		// creates the empty spots array
		for(int j=0;j<board_size;j++) {
			for(int k=0;k<board_size;k++) {
				Pair temp = new Pair(j, k);
				emptySpots.add(temp);
			}
		}
		
		// Adding bombs
		for(int z=0;z<bombs;z++) {
			int rand= (int)(Math.random()*(emptySpots.size()));
			twoD_arr[emptySpots.get(rand).getRow()][emptySpots.get(rand).getColumn()] = -1;
			
			// removing bomb spot from empty spots list
			emptySpots.remove(rand);
		}
		
		// goes over the board matrix and adds the numbers
		for (int i=0; i < board_size; i++) {
            for (int j = 0; j < board_size; j++) {
            	
            	// If this is a bomb location
            	if ((twoD_arr[i][j])==-1) {
            		;
            	}
            	
            	// If this is an empty location
            	// Checks for bombs in neighbores and assign the count of neighbores bombs
            	// as the value for this index
            	else {
            		int neighboreBombs =0;
            		if(i==0) {
            			if(j==0) {
            				if((twoD_arr[i+1][j+1])==-1) {
                    			neighboreBombs = neighboreBombs+1;
                    		}
            				if((twoD_arr[i+1][j])==-1) {
                    			neighboreBombs = neighboreBombs+1;
                    		}
            				if((twoD_arr[i][j+1])==-1) {
                    			neighboreBombs = neighboreBombs+1;
                    		}	
            			}
            			else if (j==(board_size-1)) {
            				if((twoD_arr[i][j-1])==-1) {
                    			neighboreBombs = neighboreBombs+1;
                    		}
            				if((twoD_arr[i+1][j])==-1) {
                    			neighboreBombs = neighboreBombs+1;
                    		}
            				if((twoD_arr[i][j-1])==-1) {
                    			neighboreBombs = neighboreBombs+1;
                    		}	
            			}
            			else {
            				if((twoD_arr[i+1][j])==-1) {
                    			neighboreBombs = neighboreBombs+1;
                    		}
            				if((twoD_arr[i+1][j+1])==-1) {
                    			neighboreBombs = neighboreBombs+1;
                    		}
            				if((twoD_arr[i+1][j-1])==-1) {
                    			neighboreBombs = neighboreBombs+1;
                    		}
            				if((twoD_arr[i][j+1])==-1) {
                    			neighboreBombs = neighboreBombs+1;
                    		}
            				if((twoD_arr[i][j-1])==-1) {
                    			neighboreBombs = neighboreBombs+1;
                    		}
            			}
            		}
            		else if (i==(board_size-1)) {
            			if(j==0) {
            				if((twoD_arr[i-1][j])==-1) {
                    			neighboreBombs = neighboreBombs+1;
                    		}
            				if((twoD_arr[i-1][j+1])==-1) {
                    			neighboreBombs = neighboreBombs+1;
                    		}
            				if((twoD_arr[i][j+1])==-1) {
                    			neighboreBombs = neighboreBombs+1;
                    		}	
            			}
            			else if(j==(board_size-1)) {
            				if((twoD_arr[i-1][j])==-1) {
                    			neighboreBombs = neighboreBombs+1;
                    		}
            				if((twoD_arr[i-1][j-1])==-1) {
                    			neighboreBombs = neighboreBombs+1;
                    		}
            				if((twoD_arr[i][j-1])==-1) {
                    			neighboreBombs = neighboreBombs+1;
                    		}	
            			}
            			else {
            				if((twoD_arr[i-1][j])==-1) {
                    			neighboreBombs = neighboreBombs+1;
                    		}
            				if((twoD_arr[i-1][j+1])==-1) {
                    			neighboreBombs = neighboreBombs+1;
                    		}
            				if((twoD_arr[i][j+1])==-1) {
                    			neighboreBombs = neighboreBombs+1;
                    		}	
            				if((twoD_arr[i-1][j-1])==-1) {
                    			neighboreBombs = neighboreBombs+1;
                    		}
            				if((twoD_arr[i][j-1])==-1) {
                    			neighboreBombs = neighboreBombs+1;
                    		}	
            			}
            		}
            		else if(j==0) {
            			if((twoD_arr[i-1][j])==-1) {
                			neighboreBombs = neighboreBombs+1;
                		}
            			if((twoD_arr[i+1][j])==-1) {
                			neighboreBombs = neighboreBombs+1;
                		}
            			if((twoD_arr[i-1][j+1])==-1) {
                			neighboreBombs = neighboreBombs+1;
                		}
            			if((twoD_arr[i+1][j+1])==-1) {
                			neighboreBombs = neighboreBombs+1;
                		}
            			if((twoD_arr[i][j+1])==-1) {
                			neighboreBombs = neighboreBombs+1;
                		}
            		}
            		else if(j==(board_size-1)) {
            			if((twoD_arr[i-1][j])==-1) {
                			neighboreBombs = neighboreBombs+1;
                		}
            			if((twoD_arr[i+1][j])==-1) {
                			neighboreBombs = neighboreBombs+1;
                		}
            			if((twoD_arr[i-1][j-1])==-1) {
                			neighboreBombs = neighboreBombs+1;
                		}
            			if((twoD_arr[i+1][j-1])==-1) {
                			neighboreBombs = neighboreBombs+1;
                		}
            			if((twoD_arr[i][j-1])==-1) {
                			neighboreBombs = neighboreBombs+1;
                		}
            		}
            		
            		else {
            			if((twoD_arr[i][j-1])==-1) {
                			neighboreBombs = neighboreBombs+1;
                		}
            			if((twoD_arr[i][j+1])==-1) {
                			neighboreBombs = neighboreBombs+1;
                		}
            			if((twoD_arr[i-1][j])==-1) {
                			neighboreBombs = neighboreBombs+1;
                		}
            			if((twoD_arr[i+1][j])==-1) {
                			neighboreBombs = neighboreBombs+1;
                		}
            			if((twoD_arr[i-1][j-1])==-1) {
                			neighboreBombs = neighboreBombs+1;
                		}
            			if((twoD_arr[i-1][j+1])==-1) {
                			neighboreBombs = neighboreBombs+1;
                		}
            			if((twoD_arr[i+1][j+1])==-1) {
                			neighboreBombs = neighboreBombs+1;
                		}
            			if((twoD_arr[i+1][j-1])==-1) {
                			neighboreBombs = neighboreBombs+1;
                		}
            		}
            		twoD_arr[i][j] =neighboreBombs;
            		
                	
            	}
            }
		}
		
			// Prints the board
			printBoard(twoD_arr, board_size);
        }
		
	// Function to print the board
	public void printBoard(int[][] twoD_arr, int board_size){
		for (int i = 0; i < board_size; i++) {
            for (int j = 0; j < board_size; j++) {
            	if((twoD_arr[i][j])==-1) {
            		System.out.print( "B | ");
            	}
            	else {
            		System.out.print(twoD_arr[i][j] + " | ");
            	} 
            }
            System.out.println();
        }
    }
	
}
