package it.dario.control;

import java.util.ArrayList;
import java.util.HashMap;

import it.dario.model.Cliente;
import it.dario.model.Prenotazione;
import it.dario.model.Viaggio;
import it.dario.utils.DataParser;

public class ControlPrenotazione {
	
	public ControlPrenotazione() {
		
	}

	public HashMap<Cliente, Integer> getListaClientiPrenotati(String destinazione) {
		ControlViaggio cv = new ControlViaggio();
		Viaggio v = cv.getViaggio(destinazione);
		ArrayList<Prenotazione> ap = getPrenotazioniViaggio(v.getCodiceViaggio());
		HashMap<Cliente, Integer> map = new HashMap<>();
		
		for(Prenotazione p : ap){
			ControlCliente cc = new ControlCliente();
			Cliente c = cc.getCliente(p.getCodiceFiscale());
			if(map.isEmpty())
				map.put(c, 1);
			else {
				if(map.containsKey(c))
					map.put(c, map.get(c)+1);
				else {
					map.put(c, 1);
				}
			}
		}
		return map;
	}
	
	public ArrayList<Prenotazione> getPrenotazioniViaggio(int codiceViaggio){
		return DataParser.parsePrenotazione(codiceViaggio);
	}
}
