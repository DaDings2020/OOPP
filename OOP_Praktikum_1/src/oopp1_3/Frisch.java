/*	Programm:	Frisch.java 
 * 	Autoren:	Domenic Heidemann, Philipp Riefer
 * 	Datum: 		25.11.2020
 */

package oopp1_3;

public abstract class Frisch extends Lebensmittel{

	private String quelle;
	
	//constructor
	public Frisch(String name, double gewicht, String hersteller, String herkunftsland, String inhalt,
			double kuehltemperatur, double mehrwertsteuer, String mindesthaltbarkeitsdatum, double preis, int stueck,
			int vorraetigeEinheiten, String quelle) {
		super(name, gewicht, hersteller, herkunftsland, inhalt, kuehltemperatur, mehrwertsteuer, mindesthaltbarkeitsdatum,
				preis, stueck, vorraetigeEinheiten);
		this.quelle=quelle;
	}

	//getter and setter
	public String getQuelle() {
		return quelle;
	}

	public void setQuelle(String quelle) {
		this.quelle = quelle;
	}

	//methods
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("Quelle: "+quelle);
	}
}
