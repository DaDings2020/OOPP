/*	Programm:	Milch.java 
 * 	Autoren:	Domenic Heidemann, Philipp Riefer
 * 	Datum: 		25.11.2020
 */

package oopp1_3;

public class Milch extends Frisch{

	private boolean fettarm;
	
	//constructor
	public Milch(String name, double gewicht, String hersteller, String herkunftsland, String inhalt,
			double kuehltemperatur, double mehrwertsteuer, String mindesthaltbarkeitsdatum, double preis, int stueck,
			int vorraetigeEinheiten, String quelle, boolean fettarm) {
		super(name, gewicht, hersteller, herkunftsland, inhalt, kuehltemperatur, mehrwertsteuer, mindesthaltbarkeitsdatum,
				preis, stueck, vorraetigeEinheiten, quelle);
		this.fettarm=fettarm;
	}

	//getter and setter
	public boolean isFettarm() {
		return fettarm;
	}

	public void setFettarm(boolean fettarm) {
		this.fettarm = fettarm;
	}


	//methods
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("Fettarm: " +fettarm);
	}
}
