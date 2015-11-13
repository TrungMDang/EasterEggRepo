import java.util.Scanner;

public class EEmain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Program is running.");
		Scanner stdIn = new Scanner(System.in);
	
		System.out.println("What is our group name?");
		boolean bingo = false;
		do {
			String trigger = stdIn.next();
			if (trigger.equalsIgnoreCase("ccs")) {
				bingo = true;
			} else {
				bingo = false;
				System.out.println("We are sorry. Please try again!");
			}
		} while (bingo = false);
		System.out.println("BINGO!!!");
		display();
		stdIn.close();
	}
	
	/**
	 * Display all Easter egg messages.
	 */
	private static void display() {
		//Need formatted output
		System.out.printf("The Crazy Code Surgeons - CCS");
		//new comment
		//new comment
		//this is last one
		//Trung comment to test
		//is my comment visible? If so email me! :)
		
	}


}
