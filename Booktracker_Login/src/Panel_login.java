import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class Panel_login extends JPanel {
	private JTextField tfBenutzername;
	private JPasswordField pfPasswort;
	/**
	 * Create the panel.
	 */
	public Panel_login(JFrame frame, class_globalParameters Global_Parameters) {
		setBorder(new EmptyBorder(0, 0, 0, 0));
		setLayout(null);
		
		JLabel lblBenutzername = new JLabel("Benutzername");
		lblBenutzername.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 14));
		lblBenutzername.setForeground(Color.MAGENTA);
		lblBenutzername.setBounds(46, 66, 140, 16);
		this.add(lblBenutzername);
		
		tfBenutzername = new JTextField();
		tfBenutzername.setBounds(196, 65, 180, 20);
		this.add(tfBenutzername);
		tfBenutzername.setColumns(10);
		
		JLabel lblKennwort = new JLabel("Kennwort");
		lblKennwort.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 14));
		lblKennwort.setForeground(Color.MAGENTA);
		lblKennwort.setBounds(46, 139, 57, 16);
		this.add(lblKennwort);
		
		pfPasswort = new JPasswordField();
		pfPasswort.setBounds(196, 138, 180, 20);
		this.add(pfPasswort);
					
		JButton btnRegister = new JButton("Registrieren");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panel_Registrierung Registrierung = new Panel_Registrierung(frame, Global_Parameters);								
				frame.setContentPane(Registrierung);	
				frame.resize(451, 310);			
			}
		});
		btnRegister.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 14));
		btnRegister.setBackground(Color.BLACK);
		btnRegister.setForeground(Color.MAGENTA);
		btnRegister.setBounds(33, 217, 123, 25);
		this.add(btnRegister);
		
		JButton btnLogIn = new JButton("Einloggen");
		btnLogIn.setForeground(Color.MAGENTA);
		btnLogIn.setBackground(Color.BLACK);
		btnLogIn.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 14));
		btnLogIn.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {				
				//if(!tfBenutzername.getText().isEmpty() && !pfPasswort.getText().isEmpty()) 
				if(tfBenutzername.getText().equals(Global_Parameters.getBenutzername()) && pfPasswort.getText().equals(Global_Parameters.getKennwort())) 	
				{								
					Panel_Benutzerübersicht Benutzeruebersicht = new Panel_Benutzerübersicht(frame, tfBenutzername.getText());
					frame.setContentPane(Benutzeruebersicht);
					frame.resize(600, 824);
				}
				else 
				{
					 showMessageDialog(null, "You shall not pass", "No username or password detected", ERROR_MESSAGE);
				}				
			}
		});
		btnLogIn.setBounds(304, 217, 103, 25);
		this.add(btnLogIn);
		
		JLabel IconLabel = new JLabel("");
		IconLabel.setIcon(new ImageIcon("C:\\Users\\braun\\eclipse-workspace\\Booktracker_Login\\src\\Pictures\\MZYrae.jpg"));
		IconLabel.setBounds(0, 0, 485, 300);
		this.add(IconLabel);			
		
		
		frame.setContentPane(this);
		frame.setVisible(true);
		
	}

}
