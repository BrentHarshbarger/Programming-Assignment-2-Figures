import java.util.Scanner;

public class Figures {
	// Declare variables
	int size = 0;
	int option = 0;

	public static void main(String[] args) {
		/*-----------------------------------------------------------------------------------------------------------
		/ Brent Harshbarger
		/ August 1, 2020
		/ Programming Fundamentals
		/ Summer 2020
		/ Programming Assignment 2 (Figures)
		/ 
		-------------------------------------------------------------------------------------------------------------*/

		// Print assignment information
		System.out.println("Programming Fundamentals");
		System.out.println("NAME: Brent Harshbarger");
		System.out.println("PROGRAMMING ASSIGNMENT 2");
		System.out.println();

		// Declare variables
		int size = 0;
		int option = 0;

		// Get initial input from user that will determine the size of the Figure
		Scanner userInput = new Scanner(System.in);

		System.out.print("Enter the size of the figure (odd number): ");
		size = userInput.nextInt();

		if (size % 2 == 0) {
			System.out.println("Invalid figure size - must be an odd number ");
			System.out.println("");
			System.out.print("Renter the size of the figure: "); // Requirement specified Renter instead of Re-enter
			size = userInput.nextInt();
			System.out.println("");

		}
		// Menu loop for user Figure selection
		do {
			// Print a Menu to select the type of Figure
			System.out.println("");
			System.out.println("MENU: ");
			System.out.println("1. Print box");
			System.out.println("2. Print diamond");
			System.out.println("3. Print X");
			System.out.println("4. Quit program");
			System.out.println("");

			// Choose an option for a Figure and go to selected method
			System.out.print("Please select an option: ");
			option = userInput.nextInt();
			
			// If selection is 
			if (option < 1 || option > 4) {
				System.out.print("Invalid value, please re-enter selection: ");
				option = userInput.nextInt();
			}
			System.out.println("");
			if (option == 1) {
				printBox(size);
			}
			if (option == 2) {
				printDiamond(size);
			}
			if (option == 3) {
				printX(size);
			}
		} while (option != 4);

		System.out.println("Good bye!");
		for (int count = 0; count < 64; count++) {
			System.out.print("_");
		}
		userInput.close();
	}

	public static void printBox(int size) {

		// The outer loop prints the rows of the box
		for (int row = 1; row <= size; row++) {

			// The inner loop prints the columns in each row
			for (int column = 1; column <= size; column++) {
				System.out.print("X");
			}

			// This advances the line to print the next row
			System.out.println();
		}
		System.out.println("");
	}

	public static void printDiamond(int size) {
		// Declare a width for calculations that need size+1
		int width = size + 1;
		
		// The outer loop prints the rows of the Diamond
		for (int row = 0; row < size; row++) {

			// The inner loop prints the columns in each row
			for (int column = 0; column <= size + 1; column++) {
				if (column + row == (size / 2) || row + column == (width - 1) + (width / 2)
						|| column == row + (width - 4) || row == column + (size / 2)) {
					System.out.print("X");
				} else {
					System.out.print(" ");
				}

			}

			// This advances the line to print the next row
			System.out.println();
		}
		System.out.println("");

	}

	public static void printX(int size) {

		// The outer loop prints the rows of the X
		for (int row = 0; row <= size; row++) {

			// The inner loop prints the columns in each row
			for (int column = 0; column <= size; column++) {
				if (column == row || (row + column) == ((size) - 1)) {
					System.out.print("X");
				} else {
					System.out.print(" ");
				}

			}

			// This advances the line to print the next row
			System.out.println();

		}
	}

}
