import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class PrintFaceTest {
	PrintFace pf;
	
	@Before
	public void setUp() throws Exception {
		pf = new PrintFace();
	}

	@Test
	public void test() {
		StringBuilder sb = new StringBuilder();
		sb.append("\t\t\t\t\t\t\t ^  ^\n");
		sb.append("\t\t\t\t\t\t\t |  |\n");
		sb.append("\t\t\t\t\t\t\t ____\n") ;
		sb.append("\t\t\t\t\t\t\t|____|\n") ;
		assertEquals(sb.toString(), pf.toString());
	}

}
