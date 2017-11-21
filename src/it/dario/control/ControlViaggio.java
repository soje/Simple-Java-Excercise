package it.dario.control;

import it.dario.model.Viaggio;
import it.dario.utils.DataParser;

public class ControlViaggio {

	public ControlViaggio() {
		
	}
	
	public Viaggio getViaggio(String destinazione) {
		return DataParser.parsViaggio(destinazione);
	}
	
}
