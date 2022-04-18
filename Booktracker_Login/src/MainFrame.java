import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MainFrame extends JFrame {

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 450, 300);						
		this.setTitle("Booktracker");
		this.setForeground(Color.MAGENTA);
		this.setBackground(Color.MAGENTA);
		this.setResizable(false);
	}
}
