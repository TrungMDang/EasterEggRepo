import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * This class displays team CCS Easter Egg.
 * 
 * @author Team CCS
 * 		Trung M Dang, Siyuan Zhou, Stacie Mashnitskaya, Emrullah Celik, Viktoriya Celik
 * November 13, 2015
 * @version 1.0
 */
public class EEmain {
	
	final static int WIDTH = 112;
	/**
	 * Main uses a loop to check for right trigger then calls display() to create 
	 * Easter egg objects.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Program is running.");
		Scanner stdIn = new Scanner(System.in);
	
		System.out.println("What is our group name?");
		boolean bingo = false;
		while (bingo == false){
			String trigger = stdIn.next();
			if (trigger.equalsIgnoreCase("CCS")) {
				bingo = true;
			} else {
				bingo = false;
				System.out.println("We are sorry. Please try again!");
			}
		} 
		display();
		stdIn.close();
	}
	
	/**
	 * Display all Easter egg messages.
	 */
	private static void display() {
		printGroupName();
		printSpaceNeedle();
		for (int i = 0; i < WIDTH; i++) {
			System.out.print("-");
			if (i == WIDTH - 1) System.out.println();
		}
		printNameAscii();
		
		//ADD CODE HERE, PLEASE

	}


	/**
	 * Print to the console group name approximately centered on the console.
	 */
	private static void printGroupName() {
		for (int i = 0; i < WIDTH; i++) {
			System.out.print("-");
			if (i == WIDTH - 1) System.out.println();
		}
		List<String> memberNames = new ArrayList<String>();
		
		memberNames.add("Trung Dang, ");
		memberNames.add("Siyuan Zhou, ");
		memberNames.add("Stacie Mashnitskaya, ");
		memberNames.add("Emrullah Celik, ");
		memberNames.add("Viktoriya Celik");
		
		GroupName gN = new GroupName(memberNames);
		System.out.println(gN.toString());
		for (int i = 0; i < WIDTH; i++) {
			System.out.print("-");
			if (i == WIDTH - 1) System.out.println();
		}
	}
	/**
	 * Print a space needle by call method from SpaceNeedle class.
	 */
	private static void printSpaceNeedle() {
		SpaceNeedle sn = new SpaceNeedle();
		sn.draw();
	}
	private static void printNameAscii() {
		NameAscii na = new NameAscii();
		na.drawascii();
		
	}
}
