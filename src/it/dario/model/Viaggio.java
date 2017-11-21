package it.dario.model;

public class Viaggio {
	
	/**
	 * Costruttore
	 * 
	 * @param codiceViaggio
	 * @param destinazione
	 * @param data
	 * @param postiDisponibili
	 */
	public Viaggio(int codiceViaggio, String destinazione, String data, int postiDisponibili) {
		this.codiceViaggio = codiceViaggio;
		this.destinazione = destinazione;
		this.data = data;
		this.postiDisponibili = postiDisponibili;
	}
	
	//metodi set
	public void setCodiceViaggio(int codiceViaggio) {
		this.codiceViaggio = codiceViaggio;
	}
	public void setDestinazione(String destinazione) {
		this.destinazione = destinazione;
	}
	public void setData(String data) {
		this.data = data;
	}
	public void setPostiDisponibili(int postiDisponibili) {
		this.postiDisponibili = postiDisponibili;
	}

	//metodi get
	public int getCodiceViaggio() {
		return codiceViaggio;
	}
	public String getDestinazione() {
		return destinazione;
	}
	public String getData() {
		return data;
	}
	public int getPostiDisponibili() {
		return postiDisponibili;
	}
	
	private int codiceViaggio;
	private String destinazione;
	private String data;
	private int postiDisponibili;
}
