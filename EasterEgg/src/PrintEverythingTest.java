import static org.junit.Assert.*;

public class PrintEverythingTest {

	public void testPrintName() {
		PrintEverything eastenegg = new PrintEverything();
		String test1 = eastenegg.PrintName();
		assertEquals("Scott ", test1);
	}
	
	public void testPrintFace(){
		PrintEverything eastenegg = new PrintEverything();
		String test2 = eastenegg.PrintFace();
		assertEquals("~o.o~", test2);
	}
	
	public void testPrintPic(){
		PrintEverything eastenegg= new PrintEverything();
		String test3 = eastenegg.PrintPic();
		assertEquals("╭⌒╮ ╭⌒╮\n ╱◥██◣ ╭╭ ⌒╮\n |田︱田田| ╰------------- \n ++++++++++++++++++++ CCS",test3);
	}
}
