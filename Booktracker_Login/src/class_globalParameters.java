import java.util.ArrayList;

public class class_globalParameters {
	private String benutzername;	
	private String kennwort;
	private ArrayList<String> class_buecher = new ArrayList<String>();

	
	//Get Methoden
	public String getBenutzername() {
		return this.benutzername;
	}
	public String getKennwort() {
		return this.kennwort; 
	}
	
	
	//Set Methoden
	public void setBenutzername(String newBenutzername) {
		this.benutzername = newBenutzername;
	}
	public void setKennwort(String newKennwort) {
		this.kennwort = newKennwort;
	}
	
	//Buch: 0->Titel, 1->Autor, 2->Zusammenfassung, 3->Rating, 4->Kommentar
	
}
