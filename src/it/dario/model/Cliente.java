package it.dario.model;

public class Cliente{

	/**
	 * Costruttore
	 * 
	 * @param codiceFiscale
	 * @param cognome
	 * @param nome
	 * @param indirizzo
	 */
	public Cliente(String codiceFiscale, String cognome, String nome, String indirizzo) {
		this.codiceFiscale = codiceFiscale;
		this.cognome = cognome;
		this.Nome = nome;
		this.indirizzo = indirizzo;
	}
	
	//metodi set
	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	//metodi get	
	public String getCodiceFiscale() {
		return codiceFiscale;
	}
	public String getCognome() {
		return cognome;
	}
	public String getNome() {
		return Nome;
	}
	public String getIndirizzo() {
		return indirizzo;
	}
	
	private String codiceFiscale;
	private String cognome;
	private String Nome;
	private String indirizzo;

}
