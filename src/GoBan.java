import javax.swing.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.geom.*;

public class GoBan extends JComponent{

	private static final int goBanSize=400;
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(new Color(219,186,86));
		g2.fillRect(5, 5, goBanSize, goBanSize);

		g2.setColor(Color.black);
		int i;

		for(i=5;i<=goBanSize+5;i+=50){
			g2.draw(new Line2D.Double(5, i, goBanSize+5, i));
			g2.draw(new Line2D.Double(i, 5, i, goBanSize+5));

		}
	}
}
