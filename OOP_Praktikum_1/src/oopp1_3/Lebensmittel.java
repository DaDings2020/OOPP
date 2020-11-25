/*	Programm:	Lebensmittel.java 
 * 	Autoren:	Domenic Heidemann, Philipp Riefer
 * 	Datum: 		25.11.2020
 */

package oopp1_3;

public class Lebensmittel {
	
	//attributes
	private String name;
	private double gewicht;
	private String hersteller;
	private String herkunftsland;
	private String inhalt;
	private double kuehltemperatur;
	private double mehrwertsteuer;
	private String mindesthaltbarkeitsdatum;
	private double preis;
	private int stueck;
	private int vorraetigeEinheiten;
	
	//constructors
	public Lebensmittel(String name, 
	double gewicht,
	String hersteller,
	String herkunftsland,
	String inhalt,
	double kuehltemperatur,
	double mehrwertsteuer,
	String mindesthaltbarkeitsdatum,
	double preis,
	int stueck,
	int vorraetigeEinheiten) {
		this.name=name;
		this.gewicht=gewicht;
		this.hersteller=hersteller;
		this.herkunftsland=herkunftsland;
		this.inhalt=inhalt;
		this.kuehltemperatur=kuehltemperatur;
		this.mehrwertsteuer=mehrwertsteuer;
		this.mindesthaltbarkeitsdatum=mindesthaltbarkeitsdatum;
		this.preis=preis;
		this.stueck=stueck;
		this.vorraetigeEinheiten=vorraetigeEinheiten;
	}
	
	
	//getter and setter (only if useful)
	public String getName() {
		return name;
	}
	public double getGewicht() {
		return gewicht;
	}
	public String getHersteller() {
		return hersteller;
	}
	public String getHerkunftsland() {
		return herkunftsland;
	}
	public String getInhalt() {
		return inhalt;
	}
	public double getKuehltemperatur() {
		return kuehltemperatur;
	}
	public double getMehrwertsteuer() {
		return mehrwertsteuer;
	}
	public String getMindesthaltbarkeitsdatum() {
		return mindesthaltbarkeitsdatum;
	}
	public double getPreis() {
		return preis;
	}
	public int getStueck() {
		return stueck;
	}
	public int getVorraetigeEinheiten() {
		return vorraetigeEinheiten;
	}
	
	public void setMehrwertsteuer(double i) {
		mehrwertsteuer=i;
	}
	public void setMindesthaltbarkeitsdatum(String i) {
		mindesthaltbarkeitsdatum=i;
	}
	public void setPreis(double i) {
		preis=i;
	}
	public void setStueck(int i) {
		stueck=i;
	}
	public void setVorraetigeEinheiten(int i) {
		vorraetigeEinheiten=i;
	}
	
	//methods
	public void printInfo() {								//prints all information of the object
		System.out.println("Name: "+ name);
		System.out.println("Gewicht: "+ gewicht +"kg");
		System.out.println("Hersteller: "+ hersteller);
		System.out.println("Herkunftsland: "+ herkunftsland);
		System.out.println("Inhalt: "+ inhalt);
		System.out.println("Kühltemperatur: "+ kuehltemperatur+"°C");
		System.out.println("Mehrwertsteuer: "+ mehrwertsteuer +"%");
		System.out.println("Mindesthaltbarkeitsdatum: "+ mindesthaltbarkeitsdatum);
		System.out.println("Preis: "+ preis +" Euro");
		System.out.println("Stück: "+ stueck);
		System.out.println("Vorrätige Einheiten: "+ vorraetigeEinheiten);
	}
}
