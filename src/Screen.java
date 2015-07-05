import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.Container;
import java.awt.BorderLayout;

public class Screen extends JFrame{
	Screen(){
		setTitle("Igo");
		setSize(700,600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addComponentListener(new ComponentAdapter_JFrame());
		
		GoBan ban = new GoBan();
		Container contentPane = getContentPane();
	    contentPane.add(ban);
	}
	
	class ComponentAdapter_JFrame extends ComponentAdapter{
	    public void componentResized(ComponentEvent e) {
	      Screen.this.repaint();
	    }
	  }
}