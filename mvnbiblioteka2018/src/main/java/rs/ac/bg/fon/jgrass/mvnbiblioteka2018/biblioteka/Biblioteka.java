package rs.ac.bg.fon.jgrass.mvnbiblioteka2018.biblioteka;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

import rs.ac.bg.fon.jgrass.mvnbiblioteka2018.biblioteka.interfejs.*;
import rs.ac.bg.fon.jgrass.mvnbiblioteka2018.biblioteka.sistemske_operacije.*;

/**
 * Klasa koja predstavlja Biblioteku sa nekim osnovnim funkcionalnostima.
 * @author Bojan Tomic
 * @version 1.0
 *
 */
public class Biblioteka implements BibliotekaInterfejs{

	/**
	 * Lista knjiga dostupnih u biblioteci
	 */
	private LinkedList<Knjiga> knjige = new LinkedList<Knjiga>();
	
	/**
	 * Dodaje novu knjigu u ponudu biblioteke
	 * @param k nova knjiga koja se dodaje u biblioteku
	 * @throws java.lang.RuntimeException ako je uneta knjiga null ili se vec
	 * nalazi u biblioteci ista takva
	 */
	public void dodajKnjigu(Knjiga k) {
		SODodajKnjigu.izvrsi(k, knjige);	
	}

	/**
	 * Brise knjigu iz ponude biblioteke
	 * @param k knjiga koju je potrebno obrisati
	 * @throws java.lang.RuntimeException ako je uneta knjiga null ili se ne
	 * moze naci u biblioteci
	 */
	public void obrisiKnjigu(Knjiga k) {
		SOObrisiKnjigu.izvrsi(k, knjige);
	}

	/**
	 * Vraca celokupnu ponudu knjiga iz biblioteke
	 * @return lista svih knjiga iz biblioteke
	 */
	public LinkedList<Knjiga> vratiSveKnjige() {
		return knjige;
	}

	/**
	 * Pronalazi i vraca listu sa svim knjigama iz biblioteke koji odgovaraju upitu.
	 * 
	 * Nem oraju se uneti svi parametri, oni koji budu null se ne uzimaju u razmatranje prilikom pretrage
	 * 
	 * @param autor autor knjige
	 * @param isbn isbn knjige
	 * @param naslov DEO naslova knjige ili ceo naslov knjige
	 * @param izdavac DEO naziva izdavaca ili ceo naziv
	 * 
	 * @return lista sa knjigam koje odgovaraju upitu
	 * 
	 * @throws java.lang.RuntimeException ako su svi parametri null
	 */
	public LinkedList<Knjiga> pronadjiKnjigu(Autor autor, String isbn, String naslov, String izdavac) {
		return SOPronadjiKnjigu.izvrsi(autor,
				isbn, naslov, izdavac, knjige);
	}

	/**
	 * Deserijalizuje (ucitava) sve knjige iz fajla i unosi ih u biblioteku.
	 * 
	 * Pre ucitavanja se brise postojeci sadrzaj biblioteke.
	 * 
	 * @param fajl putanja do fajla sa serijalizovanim knjigama.
	 */
	@SuppressWarnings("unchecked")
	public void ucitajKnjige(String fajl) {
		knjige = SOUcitajKnjige.izvrsi(fajl);
	}

	/**
	 * Serijalizuje (cuva) sve knjige iz biblioteke u fajl.
	 * 
	 * @param fajl putanja do fajla u koji treba sacuvati (serijalizovati) knjige.
	 */
	public void sacuvajKnjige(String fajl){
		SOSacuvajKnjige.izvrsi(fajl, knjige);
	}
	
	

}
