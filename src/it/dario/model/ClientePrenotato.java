package it.dario.model;

public class ClientePrenotato extends Cliente {
	
	public ClientePrenotato(String codiceFiscale, String cognome, String nome, String indirizzo, int prenotazioni) {
		super(codiceFiscale, cognome, nome, indirizzo);
		this.prenotazioni = prenotazioni;
	}
	
	public int getPrenotazioni() {
		return prenotazioni;
	}

	public void setPrenotazioni(int prenotazioni) {
		this.prenotazioni = prenotazioni;
	}

	@Override
	public String toString(){
		return super.getCognome()+","+super.getNome()+","+super.getIndirizzo()+","+getPrenotazioni();
	}
	
	private int prenotazioni;
}
