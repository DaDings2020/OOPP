/*	Programm:	Prefix.java 
 * 	Autoren:	Domenic Heidemann, Philipp Riefer
 * 	Datum: 		25.11.2020
 */

//prefixes for the resistors
package oopp1;

public enum Prefix {
	//elements
	nano(-9, "n"),
	mikro(-6, "µ"),
	milli(-3, "m"),
	none(0, ""),
	Kilo(3,"k"),
	Mega(6,"M"),
	Giga(9,"G");
	
	//attributes	
	private int exponent;
	private String symbol;
	
	//constructor
	Prefix(int exponent, String symbol) {
		this.exponent=exponent;
		this.symbol=symbol;
	}
	
	//methods
	public int getExponent() {
		return exponent;
	}
	public String getSymbol() {
		return symbol;
	}
	
	public String toString() {        //prints a prefix in stringform
		if (this.exponent == 0) return "Das Präfix " + this.name() + " hat den Exponenten " + Integer.toString(this.exponent) + " und kein Symbol.";
		else return "Das Präfix " + this.name() + " hat den Exponenten " + Integer.toString(this.exponent) + " und das Symbol " + this.symbol + ".";
	}

	
	
	
	
	
	
	
	
}
