import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CatAsciiTest {
	CatAscii ca;
	@Before
	public void setUp() throws Exception {
		ca = new CatAscii();
	}

	@Test
	public void test() {
		StringBuilder sb = new StringBuilder();
		sb.append("\t\t\t\t		      /\\     /\\  \n");
		sb.append("\t\t\t\t		     /  \\___/  \\  \n");
		sb.append("\t\t\t\t		    /           \\  \n");
		sb.append("\t\t\t\t		   /  (.)   (.)  \\  \n");
		sb.append("\t\t\t\t		 ((      /@\\      )) \n");
		sb.append("\t\t\t\t		   \\  ~       ~  /  \n");
		sb.append("\t\t\t\t		    \\ ~~(***)~~ /  \n");
		sb.append("\t\t\t\t		    //--------\\\\  \n");
		sb.append("\t\t\t\t		    =/////\\\\\\\\\\=  \n");
		sb.append("\t\t\t\t		    //  || || \\\\  \n");
		sb.append("\t\t\t\t		   //   || ||  \\\\  \n");
		assertEquals(sb.toString(), ca.toString());
	}

}
