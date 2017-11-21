package it.dario.model;

public class Prenotazione {

	/**
	 * Costruttore
	 * 
	 * @param codicePrenotazione
	 * @param codiceFiscale
	 * @param codiceViaggio
	 * @param postiPrenotati
	 */
	public Prenotazione(int codicePrenotazione, String codiceFiscale, int codiceViaggio, int postiPrenotati) {
		this.codicePrenotazione = codicePrenotazione;
		this.codiceFiscale = codiceFiscale;
		this.codiceViaggio = codiceViaggio;
		this.postiPrenotati = postiPrenotati;
	}
	
	//motodi set
	public void setCodicePrenotazione(int codicePrenotazione) {
		this.codicePrenotazione = codicePrenotazione;
	}
	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	public void setCodiceViaggio(int codiceViaggio) {
		this.codiceViaggio = codiceViaggio;
	}
	public void setPostiPrenotati(int postiPrenotati) {
		this.postiPrenotati = postiPrenotati;
	}
	
	//metodi get
	public int getCodicePrenotazione() {
		return codicePrenotazione;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public int getCodiceViaggio() {
		return codiceViaggio;
	}

	public int getPostiPrenotati() {
		return postiPrenotati;
	}
	
	private int codicePrenotazione;
	private String codiceFiscale;
	private int codiceViaggio;
	private int postiPrenotati;
}
