package it.dario.view;

import java.util.HashMap;

import it.dario.control.ControlPrenotazione;
import it.dario.model.Cliente;

public class TestView {

	public static void main(String[] args) {

		String destinazione = "Marte";
		
		ControlPrenotazione cp = new ControlPrenotazione();
		HashMap<Cliente, Integer> map = cp.getListaClientiPrenotati(destinazione);
		
		for(Cliente c: map.keySet()) {
			System.out.println(c.getCognome()+","+c.getNome()+","+c.getIndirizzo()+","+map.get(c));
		}
		
	}

}
