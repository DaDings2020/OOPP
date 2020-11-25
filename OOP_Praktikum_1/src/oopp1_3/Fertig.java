/*	Programm:	Fertig.java 
 * 	Autoren:	Domenic Heidemann, Philipp Riefer
 * 	Datum: 		25.11.2020
 */

package oopp1_3;

public abstract class Fertig extends Lebensmittel{

	private String verpackungstyp;
	
	//constructor
	public Fertig(String name, double gewicht, String hersteller, String herkunftsland, String inhalt,
			double kuehltemperatur, double mehrwertsteuer, String mindesthaltbarkeitsdatum, double preis, int stueck,
			int vorraetigeEinheiten, String verpackungstyp) {
		super(name, gewicht, hersteller, herkunftsland, inhalt, kuehltemperatur, mehrwertsteuer, mindesthaltbarkeitsdatum,
				preis, stueck, vorraetigeEinheiten);
		this.verpackungstyp=verpackungstyp;
	}

	//getter and setter
	public String getVerpackungstyp() {
		return verpackungstyp;
	}

	public void setVerpackungstyp(String verpackungstyp) {
		this.verpackungstyp = verpackungstyp;
	}

	//methods
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("Verpackungstyp: "+verpackungstyp);
	}
}
