import java.util.Scanner;

public class EEmain {

	public static void main(String[] args) {
		System.out.println("Program is running.");
		Scanner stdIn = new Scanner(System.in);
	
		System.out.println("What is our group name?");
		boolean bingo = false;
		do {
			String trigger = stdIn.next();
			if (trigger.equalsIgnoreCase("ccs")) {
				bingo = true;
			}
			bingo = false;
			
		} while (bingo = false);
		System.out.println("BINGO!!!");
		display();
		stdIn.close();
	}
	
	private static void display() {
		System.out.println("The Crazy Code Surgeons - CCS");
		//new comment
		//new comment
		//this is last one
		//Trung comment to test
		
		
	}


}
