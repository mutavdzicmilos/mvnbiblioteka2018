package rs.ac.bg.fon.jgrass.mvnbiblioteka2018.biblioteka.gui;

import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;

import rs.ac.bg.fon.jgrass.mvnbiblioteka2018.biblioteka.*;
import rs.ac.bg.fon.jgrass.mvnbiblioteka2018.biblioteka.gui.kontroler.*;

public class ObrisiKnjiguProzor extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblIsbn;
	private JTextField textFieldISBN;
	private JLabel lblNaslov;
	private JTextField textFieldNaslov;
	private JLabel lblIzdavac;
	private JTextField textFieldIzdavac;
	private JLabel lblIzdanje;
	private JSpinner spinnerIzdanje;
	private JLabel lblAutorIme;
	private JTextField textFieldAutor1Ime;
	private JLabel lblAutorPrezime;
	private JTextField textFieldAutor1Prezime;
	private JLabel lblAutorIme_1;
	private JTextField textFieldAutor2Ime;
	private JLabel lblAutorPrezime_1;
	private JTextField textFieldAutor2Prezime;
	private JButton btnObrisi;
	private JButton btnOdustani;

	private Knjiga k;

	/**
	 * Create the frame.
	 */
	public ObrisiKnjiguProzor(Knjiga k) {
		setResizable(false);
		setIconImage(
				Toolkit.getDefaultToolkit().getImage(ObrisiKnjiguProzor.class.getResource("/icons/bluej-84-toned.jpg")));
		setTitle("Obrisi knjigu");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 306, 281);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(9, 2, 10, 5));
		contentPane.add(getLblIsbn());
		contentPane.add(getTextFieldISBN());
		contentPane.add(getLblNaslov());
		contentPane.add(getTextFieldNaslov());
		contentPane.add(getLblIzdavac());
		contentPane.add(getTextFieldIzdavac());
		contentPane.add(getLblIzdanje());
		contentPane.add(getSpinnerIzdanje());
		contentPane.add(getLblAutorIme());
		contentPane.add(getTextFieldAutor1Ime());
		contentPane.add(getLblAutorPrezime());
		contentPane.add(getTextFieldAutor1Prezime());
		contentPane.add(getLblAutorIme_1());
		contentPane.add(getTextFieldAutor2Ime());
		contentPane.add(getLblAutorPrezime_1());
		contentPane.add(getTextFieldAutor2Prezime());
		contentPane.add(getBtnObrisi());
		contentPane.add(getBtnOdustani());

		this.k = k;
		
		prikaziKnjigu();
	}

	private JLabel getLblIsbn() {
		if (lblIsbn == null) {
			lblIsbn = new JLabel("ISBN");
		}
		return lblIsbn;
	}

	private JTextField getTextFieldISBN() {
		if (textFieldISBN == null) {
			textFieldISBN = new JTextField();
			textFieldISBN.setEnabled(false);
			textFieldISBN.setColumns(10);
		}
		return textFieldISBN;
	}

	private JLabel getLblNaslov() {
		if (lblNaslov == null) {
			lblNaslov = new JLabel("Naslov");
		}
		return lblNaslov;
	}

	private JTextField getTextFieldNaslov() {
		if (textFieldNaslov == null) {
			textFieldNaslov = new JTextField();
			textFieldNaslov.setEnabled(false);
			textFieldNaslov.setColumns(10);
		}
		return textFieldNaslov;
	}

	private JLabel getLblIzdavac() {
		if (lblIzdavac == null) {
			lblIzdavac = new JLabel("Izdavac");
		}
		return lblIzdavac;
	}

	private JTextField getTextFieldIzdavac() {
		if (textFieldIzdavac == null) {
			textFieldIzdavac = new JTextField();
			textFieldIzdavac.setEnabled(false);
			textFieldIzdavac.setColumns(10);
		}
		return textFieldIzdavac;
	}

	private JLabel getLblIzdanje() {
		if (lblIzdanje == null) {
			lblIzdanje = new JLabel("Izdanje");
		}
		return lblIzdanje;
	}

	private JSpinner getSpinnerIzdanje() {
		if (spinnerIzdanje == null) {
			spinnerIzdanje = new JSpinner();
			spinnerIzdanje.setEnabled(false);
			spinnerIzdanje.setModel(new SpinnerNumberModel(1, 1, 100, 1));
		}
		return spinnerIzdanje;
	}

	private JLabel getLblAutorIme() {
		if (lblAutorIme == null) {
			lblAutorIme = new JLabel("Autor1 ime");
		}
		return lblAutorIme;
	}

	private JTextField getTextFieldAutor1Ime() {
		if (textFieldAutor1Ime == null) {
			textFieldAutor1Ime = new JTextField();
			textFieldAutor1Ime.setEnabled(false);
			textFieldAutor1Ime.setColumns(10);
		}
		return textFieldAutor1Ime;
	}

	private JLabel getLblAutorPrezime() {
		if (lblAutorPrezime == null) {
			lblAutorPrezime = new JLabel("Autor 1 prezime");
		}
		return lblAutorPrezime;
	}

	private JTextField getTextFieldAutor1Prezime() {
		if (textFieldAutor1Prezime == null) {
			textFieldAutor1Prezime = new JTextField();
			textFieldAutor1Prezime.setEnabled(false);
			textFieldAutor1Prezime.setColumns(10);
		}
		return textFieldAutor1Prezime;
	}

	private JLabel getLblAutorIme_1() {
		if (lblAutorIme_1 == null) {
			lblAutorIme_1 = new JLabel("Autor 2 ime");
		}
		return lblAutorIme_1;
	}

	private JTextField getTextFieldAutor2Ime() {
		if (textFieldAutor2Ime == null) {
			textFieldAutor2Ime = new JTextField();
			textFieldAutor2Ime.setEnabled(false);
			textFieldAutor2Ime.setColumns(10);
		}
		return textFieldAutor2Ime;
	}

	private JLabel getLblAutorPrezime_1() {
		if (lblAutorPrezime_1 == null) {
			lblAutorPrezime_1 = new JLabel("Autor 2 prezime");
		}
		return lblAutorPrezime_1;
	}

	private JTextField getTextFieldAutor2Prezime() {
		if (textFieldAutor2Prezime == null) {
			textFieldAutor2Prezime = new JTextField();
			textFieldAutor2Prezime.setEnabled(false);
			textFieldAutor2Prezime.setColumns(10);
		}
		return textFieldAutor2Prezime;
	}

	private JButton getBtnObrisi() {
		if (btnObrisi == null) {
			btnObrisi = new JButton("Obrisi");
			btnObrisi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIKontroler.obrisi(k);
					
					dispose();
				}
			});
		}
		return btnObrisi;
	}

	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
		}
		return btnOdustani;
	}
	
	private void prikaziKnjigu() {
		textFieldISBN.setText(k.getIsbn());
		textFieldNaslov.setText(k.getNaslov());
		textFieldIzdavac.setText(k.getIzdavac());
		spinnerIzdanje.setValue(k.getIzdanje());

		Autor[] niz = k.getAutori();

		textFieldAutor1Ime.setText(niz[0].getIme());
		textFieldAutor1Prezime.setText(niz[0].getPrezime());

		if (niz.length > 1) {

			textFieldAutor2Ime.setText(niz[1].getIme());
			textFieldAutor2Prezime.setText(niz[1].getPrezime());
		}
		
	}

}
