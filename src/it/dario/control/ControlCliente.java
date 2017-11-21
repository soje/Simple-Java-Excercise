package it.dario.control;

import it.dario.model.Cliente;
import it.dario.utils.DataParser;

public class ControlCliente {

	public ControlCliente() {
		
	}
	
	public Cliente getCliente(String codiceFiscale) {
		return DataParser.parsCliente(codiceFiscale);
	}
	
}
