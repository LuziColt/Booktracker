import java.awt.EventQueue;

public class class_controller {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {				
				try {
					//Erstellen des Mainframes und Beladung mit Loginbildschirm.
					class_globalParameters GlobalParams = new class_globalParameters();
					MainFrame frame = new MainFrame();
					Panel_login login = new Panel_login(frame, GlobalParams);
				
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
