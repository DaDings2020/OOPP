/*	Programm:	Orangensaft.java 
 * 	Autoren:	Domenic Heidemann, Philipp Riefer
 * 	Datum: 		25.11.2020
 */

package oopp1_3;

public class Orangensaft extends Fertig{

	private String orangensorte;
	
	//constructor
	public Orangensaft(String name, double gewicht, String hersteller, String herkunftsland, String inhalt,
			double kuehltemperatur, double mehrwertsteuer, String mindesthaltbarkeitsdatum, double preis, int stueck,
			int vorraetigeEinheiten, String verpackungstyp, String orangensorte) {
		super(name, gewicht, hersteller, herkunftsland, inhalt, kuehltemperatur, mehrwertsteuer, mindesthaltbarkeitsdatum,
				preis, stueck, vorraetigeEinheiten, verpackungstyp);
		this.orangensorte=orangensorte;
	}

	//getter and setter
	public String getOrangensorte() {
		return orangensorte;
	}

	public void setOrangensorte(String orangensorte) {
		this.orangensorte = orangensorte;
	}

	//methods
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("Orangensorte: "+orangensorte);
	}
}
