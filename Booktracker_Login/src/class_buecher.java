

public class class_buecher {
	private Integer buchID;
	private String titel;
	private String autor;
	private String zusammenfassung;
	private String rating;
	private String kommentar;

	public class_buecher(Integer newBuchID, String newTitel, String newAutor, String newZusammenfassung, String newRating, String newKommentar) {
		this.buchID = newBuchID;
		this.titel = newTitel;
		this.autor = newAutor;
		this.zusammenfassung = newZusammenfassung;
		this.rating = newRating;
		this.kommentar = newKommentar;
	}
	
	public Integer getBuchID() {
		return this.buchID;		
	}
	
	public String getTitel() {
		return this.titel;
	}
	public String getAutor() {
		return this.autor;
	}
	public String getZusammenfassung() {
		return this.zusammenfassung;
	}
	public String getRating() {
		return this.rating;
	}
	public String getKommentar() {
		return this.kommentar;
	}
	
	public void setBuchID() {
		
	}
}
