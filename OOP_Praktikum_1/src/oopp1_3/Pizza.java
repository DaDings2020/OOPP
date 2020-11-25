/*	Programm:	Pizza.java 
 * 	Autoren:	Domenic Heidemann, Philipp Riefer
 * 	Datum: 		25.11.2020
 */

package oopp1_3;

public class Pizza extends Fertig {

	private String pizzatyp;
	
	//constructor
	public Pizza(String name, double gewicht, String hersteller, String herkunftsland, String inhalt,
			double kuehltemperatur, double mehrwertsteuer, String mindesthaltbarkeitsdatum, double preis, int stueck,
			int vorraetigeEinheiten, String verpackungstyp, String pizzatyp) {
		
		super(name, gewicht, hersteller, herkunftsland, inhalt, kuehltemperatur, mehrwertsteuer, mindesthaltbarkeitsdatum,
				preis, stueck, vorraetigeEinheiten, verpackungstyp);
		this.pizzatyp=pizzatyp;
	}
	
	//getter and setter
	public String getPizzatyp() {
		return pizzatyp;
	}
	public void setPizzatyp(String pizzatyp) {
		this.pizzatyp = pizzatyp;
	}

	//methods
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("Pizzatyp: "+pizzatyp);
	}
}
