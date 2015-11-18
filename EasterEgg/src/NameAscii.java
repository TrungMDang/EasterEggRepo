import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

/**
 * This class draws a string with ascii characters.
 * 
 * @author Emrullah Celik
 * November 15, 2015
 */
public class NameAscii {
	/**s
	 * Draw for ascii chracter
	 */
	public String drawAscii() {
		BufferedImage image = new BufferedImage(144, 32, BufferedImage.TYPE_INT_RGB);
		Graphics g = image.getGraphics();
		g.setFont(new Font("Arial", Font.PLAIN, 13));
		Graphics2D graphics = (Graphics2D) g;
		graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
				RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		graphics.drawString("CCS Autumn 15", 6, 30);
		
		StringBuilder sb1 = new StringBuilder();
		for (int y = 0; y < 30; y++) {
			StringBuilder sb = new StringBuilder();
			for (int x = 0; x < 100; x++)
				sb.append(image.getRGB(x, y) == -16777216 ? " " : image.getRGB(x, y) == -1 ? "@" : "$");
			if (sb.toString().trim().isEmpty()) continue;
			sb1.append("\n");
			
			sb1.append(sb.toString());
			
		}		
		return sb1.toString();
	}
}
