/*	Programm:	Banane.java 
 * 	Autoren:	Domenic Heidemann, Philipp Riefer
 * 	Datum: 		25.11.2020
 */

package oopp1_3;

public class Banane extends Frisch {

	private double kruemmung;
	
	//constructor
	public Banane(String name, double gewicht, String hersteller, String herkunftsland, String inhalt,
			double kuehltemperatur, double mehrwertsteuer, String mindesthaltbarkeitsdatum, double preis, int stueck,
			int vorraetigeEinheiten, String quelle, double kruemmung) {
		super(name, gewicht, hersteller, herkunftsland, inhalt, kuehltemperatur, mehrwertsteuer, mindesthaltbarkeitsdatum,
				preis, stueck, vorraetigeEinheiten, quelle);
		this.kruemmung=kruemmung;
	}

	//getter and setter
	public double getKruemmung() {
		return kruemmung;
	}

	public void setKruemmung(double kruemmung) {
		this.kruemmung = kruemmung;
	}

	//methods
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("Krümmung: "+kruemmung+"°");
	}
}
