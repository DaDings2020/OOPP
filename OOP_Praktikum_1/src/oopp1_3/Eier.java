/*	Programm:	Eier.java 
 * 	Autoren:	Domenic Heidemann, Philipp Riefer
 * 	Datum: 		25.11.2020
 */

package oopp1_3;

public class Eier extends Frisch{
	
	private String huehnerart;

	//constructor
	public Eier(String name, double gewicht, String hersteller, String herkunftsland, String inhalt,
			double kuehltemperatur, double mehrwertsteuer, String mindesthaltbarkeitsdatum, double preis, int stueck,
			int vorraetigeEinheiten, String quelle, String huehnerart) {
		super(name, gewicht, hersteller, herkunftsland, inhalt, kuehltemperatur, mehrwertsteuer, mindesthaltbarkeitsdatum,
				preis, stueck, vorraetigeEinheiten, quelle);
		this.huehnerart=huehnerart;
	}
	
	//getter and setter
	public String getHuehnerart() {
		return huehnerart;
	}

	public void setHuehnerart(String huehnerart) {
		this.huehnerart = huehnerart;
	}

	//methods
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("Hühnerart: "+huehnerart);
	}
}
