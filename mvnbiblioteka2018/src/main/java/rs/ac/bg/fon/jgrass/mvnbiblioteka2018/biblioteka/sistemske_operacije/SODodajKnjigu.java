package rs.ac.bg.fon.jgrass.mvnbiblioteka2018.biblioteka.sistemske_operacije;

import java.util.LinkedList;

import rs.ac.bg.fon.jgrass.mvnbiblioteka2018.biblioteka.Knjiga;

public class SODodajKnjigu {

	public static void izvrsi(Knjiga k, LinkedList<Knjiga> knjige) {
		if (k == null || knjige.contains(k))
			throw new RuntimeException("Knjiga je null ili vec postoji");
		
		knjige.add(k);		
	}
	
}
