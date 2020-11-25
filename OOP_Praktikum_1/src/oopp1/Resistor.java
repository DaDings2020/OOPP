/*	Programm:	Resistor.java 
 * 	Autoren:	Domenic Heidemann, Philipp Riefer
 * 	Datum: 		25.11.2020
 */

//simple resistor
package oopp1;

public class Resistor implements TotalResistance {

	
	//attributes
	private double value;
	private Prefix prefix;
	
	//constructors
	public Resistor(double value) {
		this.value=value;
	}
	public Resistor(Prefix prefix, double value) {
		this.prefix=prefix;
		this.value=value;
	}
	
	//methods
	public double getValue() {
		return value;
	}
	public Prefix getPrefix() {
		return prefix;
	}
	
	@Override						//returns the value of the total resistance
	public double getTotalResistance() {
		return value * Math.pow(10, prefix.getExponent());
	}
	@Override						//creates a deep copy of the resistor
	public TotalResistance deepCopy() {
		return new Resistor(prefix, value);
	}
	
}
