import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.ImageIcon;

public class Panel_Benutzerübersicht extends JPanel{

	/**
	 * Create the panel.
	 */
	public Panel_Benutzerübersicht(JFrame frame, String benutzername) {				
		setLayout(null);
		
		JLabel lblWelcomeUser = new JLabel("");
		lblWelcomeUser.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeUser.setForeground(Color.MAGENTA);
		lblWelcomeUser.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 20));
		lblWelcomeUser.setBounds(73, 11, 450, 91);
		lblWelcomeUser.setText("Welcome " + benutzername);
		add(lblWelcomeUser);
		
		JList list = new JList();
		list.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 14));
		list.setBounds(110, 175, 365, 529);
		add(list);
		
		JLabel lblBibliothek = new JLabel("Deine Bibliothek");
		lblBibliothek.setForeground(Color.MAGENTA);
		lblBibliothek.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 16));
		lblBibliothek.setBounds(73, 113, 172, 29);
		add(lblBibliothek);
		
		JButton btnAddBook = new JButton("Buch hinzuf\u00FCgen");
		btnAddBook.setBackground(Color.BLACK);
		btnAddBook.setForeground(Color.MAGENTA);
		btnAddBook.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 14));
		btnAddBook.setBounds(424, 741, 135, 23);
		add(btnAddBook);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\braun\\eclipse-workspace\\Booktracker_Login\\src\\Pictures\\MZYrae.jpg"));
		lblNewLabel.setBounds(0, 0, 600, 822);
		add(lblNewLabel);

		frame.setContentPane(this);
		frame.setVisible(true);
		
	}
}
