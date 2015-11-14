
import java.util.List;

/**
 * This class prints CCS name onto the console and approximately center it.
 * 
 * @author Trung M Dang
 * November 13, 2015
 */
public class GroupName {
	
	/** Name of the group.*/
	public final String GROUP_NAME = "The Crazy Code Surgeons - CCS";
	
	/** A string builder object for easier appending string.*/
	private StringBuilder memberName;
	
	/**
	 * Constructor appends the group member names in a list passed as parameter.
	 * 
	 * @param theNames A list of group member names.
	 */
	public GroupName(List<String> theNames) {
		memberName = new StringBuilder();
		for (int i = 0; i < theNames.size(); i++) {
			memberName.append(theNames.get(i));
		}	
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("\t\t\t\t\t%s",GROUP_NAME));
		sb.append("\n");
		sb.append(String.format("\t\t%s",memberName.toString()));
		return sb.toString();
	}
}
