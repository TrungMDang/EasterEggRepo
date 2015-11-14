
/**
 * This class draws a space needle onto the console.
 * 
 * @author Trung M Dang
 * November 13, 2015
 */
public class SpaceNeedle {
	
	/**
	 * The size of this Space Needle. Default: 2
	 */
	private int mySize;
	
	/**
	 * Constructor initializes size to default.
	 */
	public SpaceNeedle() {
		mySize = 2;
	}
	/**
	 * Draw the space needle.
	 */
	public void draw(){
		drawCore(mySize);
		drawTop(mySize);
		drawLine(mySize);
		drawBot(mySize);
		drawCore(mySize);
		drawBody(mySize);
		drawTop(mySize);
		drawLine(mySize);
	}
	
	/**
	 * Approximately center the space needle on the console.
	 */
	private void centered() {
		for (int i = 0; i < mySize * 3; i++) {
			System.out.print("\t");
		}
	}
	/**
	 * Draw the core (antenna) of the tower and part of the middle section.
	 * 
	 * @param SIZE the default size of space needle.
	 */
	public void drawCore(int SIZE){
		
		for (int line = 1; line <= SIZE; line++){
			centered();
			for (int spaces = 1; spaces <= 3*SIZE; spaces++){
				System.out.print(" ");
			}
			System.out.print("||");
			for (int spaces = 1; spaces <= 3*SIZE; spaces++){
				System.out.print(" ");
			}
			System.out.println();
		}                                                                                                                   
	}
	
	/**
	 * Draw the top of the tower.
	 * 
	 * @param SIZE the default size of the space needle.
	 */
	private void drawTop(int SIZE){
		int spaceCount = 0;
		for (int line = 1; line <= SIZE; line++){
			centered();
			for (int spaces = 1; spaces <= SIZE*3 - line*3; spaces++){
				System.out.print(" ");
				spaceCount++;											//Count the number of spaces drawn
			}
			System.out.print("__/");
			for (int colon = 1; colon <= SIZE*3-3-spaceCount; colon++){	//and use that number to draw the colons
				System.out.print(":");									//because colons + spaces = SIZE*3 - 3 ("__/")
			}
			System.out.print("||");
			for (int colon = 1; colon <= SIZE*3-3-spaceCount; colon++){
				System.out.print(":");
			}
			System.out.print("\\__");
			for (int spaces = 1; spaces <= SIZE*3 - line*3; spaces++){
				System.out.print(" ");
			}
			spaceCount = 0;							//Reset the number of spaces drawn before drawing a new line
			System.out.println();
		}
	}	
	
	/**
	 * Draw a line consists of two vertical lines and quotes.
	 * 
	 * @param SIZE the default size of the space needle.
	 */
	private void drawLine(int SIZE){
		centered();
		System.out.print("|");
		for (int i = 1; i <= SIZE*6; i++){
			System.out.print("\"");
		}
		System.out.print("|");
		System.out.println();
	}
	/**
	 * Draw the bottom of the tower consists of spaces, underscore, and slashes.
	 * 
	 * @param SIZE the default size of the space needle.
	 */
	private void drawBot(int SIZE){
		for (int line = 0; line < SIZE; line++){
			centered();
			for (int spaces = 0; spaces < 2*line; spaces++)	System.out.print(" ");
			System.out.print("\\_");
			for (int frequency = 1; frequency <= SIZE*3 - 1 - 2*line;frequency++)	System.out.print("/\\");
			System.out.print("_/");
			for (int spaces = 0; spaces < 2*line; spaces++)	System.out.print(" ");
			System.out.println();
		}
	}	
	/**
	 * Draw the body of the tower consists of vertical lines, spaces, and percent signs.
	 * 
	 * @param SIZE the default size of the space needle.
	 */
	private void drawBody(int SIZE){
		for (int line = 1; line <= SIZE*SIZE; line++){
			centered();
			for (int spaces = 1; spaces <= SIZE*2+1; spaces++)	System.out.print(" ");
			System.out.print("|");
			for (int percentSign = 1; percentSign <= SIZE - 2; percentSign++) System.out.print("%");
			System.out.print("||");
			for (int percentSign = 1; percentSign <= SIZE - 2; percentSign++) System.out.print("%");
			System.out.print("|");
			System.out.println();
		}
	}
}
