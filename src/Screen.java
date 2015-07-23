import javax.swing.JFrame;
import java.awt.Container;

public class Screen extends JFrame{
	Screen(){
		setTitle("Igo");
		setSize(700,600);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GoBan ban = new GoBan();
		Container contentPane = getContentPane();
		contentPane.add(ban);
		
	}
}