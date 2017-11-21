package it.dario.utils;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

import it.dario.model.Cliente;
import it.dario.model.Prenotazione;
import it.dario.model.Viaggio;

public class DataParser {

	public static ArrayList<Prenotazione> parsePrenotazione(int codiceViaggio) {
		BufferedReader br = FileOpener.getFile(FileOpener.PATH_PRENOTAZIONI);
		String line = null;
		Prenotazione p = null;
		ArrayList<Prenotazione> ap = new ArrayList<>();
		
		try {
			while((line = br.readLine()) != null) {
				String[] vet = line.split(",");
				p = new Prenotazione(Integer.parseInt(vet[0]), vet[1], Integer.parseInt(vet[2]), Integer.parseInt(vet[3]));
				if(p.getCodiceViaggio() == codiceViaggio) {
					ap.add(p);
				}
			}
		}catch (IOException e) {
			System.err.println("Impossibile leggere dal file: ");
			e.getMessage();
		}
		return ap;
	}
	
	public static Viaggio parsViaggio(String destinazione) {
		BufferedReader br = FileOpener.getFile(FileOpener.PATH_VIAGGI);
		String line = null;
		Viaggio v = null;
		
		try {
			while( (line = br.readLine()) != null ) {
				String[] vet = line.split(",");
				if(vet[1].equals(destinazione)) {
					v = new Viaggio(Integer.parseInt(vet[0]), vet[1], vet[2], Integer.parseInt(vet[3]));
				}
			}
		}catch(IOException e){
			System.err.println("Impossibile leggere dal file: ");
			e.getMessage();
		}
	
		return v;
	}
	
	public static Cliente parsCliente(String codiceFiscale){
		BufferedReader br = FileOpener.getFile(FileOpener.PATH_CLIENTI);
		String line = null;
		Cliente c = null;
		
		try {
			while((line = br.readLine()) != null) {
				String[] vet = line.split(",");
				if(vet[0].equals(codiceFiscale))
					c = new Cliente(vet[0], vet[1], vet[2], vet[3]);
			}
		}catch(IOException e) {
			System.err.println("Impossibile leggere dal file: ");
			e.getMessage();
		}
		
		return c;
	}
	
}
