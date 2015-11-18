
/**
 * This class draws a cat picture with ascii characters.
 * 
 * @author Viktoriya Celik
 * November 16, 2015
 *
 */
public class CatAscii {
	/**
	 * Draw cat picture 
	 */
	@Override
	public String toString() {
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
	    return sb.toString();
	}
	
}
