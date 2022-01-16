package minesweeper;

import java.util.Scanner;

public class Main {
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args){
		
		// Scanner definition
	    Scanner scanner = new Scanner(System.in);
	    
	    // Variables
	    int gridSizeBoard;
	    int numberOfBombs;
	    boolean userGridInputCorrect = false;
	    boolean userBombsInputCorrect = false;
	    
        // Receiving grid size value from user
        // Checking if value is legal, illegal value would be any value smaller than 2
	    do {
	        System.out.println("Enter number of Grid Size board:");
	        gridSizeBoard = scanner.nextInt();
	        userGridInputCorrect = gridSizeBoard>=2;
	        if (!userGridInputCorrect) {
	            System.out.println("Error, Size must be at least 2!" + "\r\n" +"Try again");
	        }
	    } while (!userGridInputCorrect);
	    
        // Receiving bombs number value from user
        // Checking if value is legal, illegal value would be any value larger than gridSizeBoard^2
	    do {
	        System.out.println("Enter number of bombs :");
	        numberOfBombs = scanner.nextInt();
	        userBombsInputCorrect = numberOfBombs <= (Math.pow(gridSizeBoard, 2)) && numberOfBombs>=0;
	        if (!userBombsInputCorrect) {
	            System.out.println("Error, number of must be a positive value smaller "+"\r\n" +"or equal to the size of the board!" +"\r\n" 
	        +"Try again");
	        }
	    } while (!userBombsInputCorrect);
  	    
        // creates the board with the bombs
		Board b = new Board(numberOfBombs, gridSizeBoard);
	}
}