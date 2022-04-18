import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Font;

import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;

import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Panel_Registrierung extends JPanel {
	private JTextField tfBenutzername;
	private JTextField tfKennwort;
	private JTextField tfwiederholekennwort;

	/**
	 * Create the panel.
	 */
	public Panel_Registrierung(JFrame frame, class_globalParameters GlobalParameters) {
		setLayout(null);
		
		JLabel lblBenutzername = new JLabel("Benutzername");
		lblBenutzername.setForeground(Color.MAGENTA);
		lblBenutzername.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 14));
		lblBenutzername.setBounds(50, 73, 100, 14);
		add(lblBenutzername);
		
		JLabel lblKennwort = new JLabel("Kennwort");
		lblKennwort.setForeground(Color.MAGENTA);
		lblKennwort.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 14));
		lblKennwort.setBounds(50, 118, 100, 14);
		add(lblKennwort);
		
		JLabel lblwiederholeKennwort = new JLabel("wiederhole Kennwort");
		lblwiederholeKennwort.setForeground(Color.MAGENTA);
		lblwiederholeKennwort.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 14));
		lblwiederholeKennwort.setBounds(50, 166, 140, 14);
		add(lblwiederholeKennwort);
		
		JLabel lblRegistrierung = new JLabel("Registrierung");
		lblRegistrierung.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistrierung.setForeground(Color.MAGENTA);
		lblRegistrierung.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 16));
		lblRegistrierung.setBounds(120, 22, 223, 37);
		add(lblRegistrierung);
		
		tfBenutzername = new JTextField();
		tfBenutzername.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 14));
		tfBenutzername.setBounds(211, 71, 171, 20);
		add(tfBenutzername);
		tfBenutzername.setColumns(10);
		
		tfKennwort = new JTextField();
		tfKennwort.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 14));
		tfKennwort.setBounds(211, 116, 171, 20);
		add(tfKennwort);
		tfKennwort.setColumns(10);
		
		tfwiederholekennwort = new JTextField();
		tfwiederholekennwort.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 14));
		tfwiederholekennwort.setBounds(211, 164, 169, 20);
		add(tfwiederholekennwort);
		tfwiederholekennwort.setColumns(10);
		
		JButton btnRegistrieren = new JButton("Jetzt registrieren");
		btnRegistrieren.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!tfBenutzername.getText().isEmpty() && !tfKennwort.getText().isEmpty() && !tfwiederholekennwort.getText().isEmpty())
				{								
					Panel_login login = new Panel_login(frame, GlobalParameters);
					GlobalParameters.setBenutzername(tfBenutzername.getText());
					GlobalParameters.setKennwort(tfKennwort.getText());
					frame.setContentPane(login);					
				}
				else 
				{
					 showMessageDialog(null, "You shall not pass", "No username or password detected", ERROR_MESSAGE);
				}				
				
			}
		});
		btnRegistrieren.setForeground(Color.MAGENTA);
		btnRegistrieren.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 14));
		btnRegistrieren.setBackground(Color.BLACK);
		btnRegistrieren.setBounds(266, 241, 146, 23);
		add(btnRegistrieren);
		
		JButton btnZurueck = new JButton("Zur\u00FCck");
		btnZurueck.setForeground(Color.MAGENTA);
		btnZurueck.setBackground(Color.BLACK);
		btnZurueck.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 14));
		btnZurueck.setBounds(43, 241, 89, 23);
		add(btnZurueck);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\braun\\eclipse-workspace\\Booktracker_Login\\src\\Pictures\\MZYrae.jpg"));
		lblNewLabel.setBounds(0, 0, 450, 300);
		add(lblNewLabel);

	}
}
