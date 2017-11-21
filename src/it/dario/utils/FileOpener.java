package it.dario.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileOpener {

	public static BufferedReader getFile(String p) {
		Path path = Paths.get(p);
		BufferedReader br = null;
		try{
			br = Files.newBufferedReader(path);
		}catch(IOException e) {
			System.err.println("Impossibile aprire il file Viaggi: ");
			e.printStackTrace();
		}
		return br;
	}
	
	public static final String PATH_VIAGGI = "C:\\Users\\darkv\\workspace\\AGENZIA DI VIAGGI\\Viaggi";
	public static final String PATH_CLIENTI = "C:\\Users\\darkv\\workspace\\AGENZIA DI VIAGGI\\Clienti";
	public static final String PATH_PRENOTAZIONI = "C:\\Users\\darkv\\workspace\\AGENZIA DI VIAGGI\\Prenotazioni";
	
}