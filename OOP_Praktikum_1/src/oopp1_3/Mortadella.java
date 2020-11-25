/*	Programm:	Mortadella.java 
 * 	Autoren:	Domenic Heidemann, Philipp Riefer
 * 	Datum: 		25.11.2020
 */

package oopp1_3;

public class Mortadella extends Fertig{

	private String fleischsorte;
	
	//constructor
	public Mortadella(String name, double gewicht, String hersteller, String herkunftsland, String inhalt,
			double kuehltemperatur, double mehrwertsteuer, String mindesthaltbarkeitsdatum, double preis, int stueck,
			int vorraetigeEinheiten, String verpackungstyp, String fleischsorte) {
		super(name, gewicht, hersteller, herkunftsland, inhalt, kuehltemperatur, mehrwertsteuer, mindesthaltbarkeitsdatum,
				preis, stueck, vorraetigeEinheiten, verpackungstyp);
		this.fleischsorte=fleischsorte;
	}

	//getter and setter
	public String getFleischsorte() {
		return fleischsorte;
	}

	public void setFleischsorte(String fleischsorte) {
		this.fleischsorte = fleischsorte;
	}

	//methods
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("Fleischsorte: "+fleischsorte);
	}
	
}
