/*	Programm:	ResistorNetwork.java 
 * 	Autoren:	Domenic Heidemann, Philipp Riefer
 * 	Datum: 		25.11.2020
 */

//network of parallel or serial resistors
package oopp1;

public class ResistorNetwork implements TotalResistance{
	
	//attributes
	private TotalResistance[] resistors;
	private boolean parallel;
	
	//constructors
	public ResistorNetwork(boolean parallel, TotalResistance[] resistors) {
		this.parallel=parallel;
		this.resistors=new TotalResistance[resistors.length];
		for (int i = 0; i < resistors.length; i++) {
			this.resistors[i] = resistors[i];
		}
	}
	public ResistorNetwork(ResistorNetwork rn) {
		this.parallel = rn.parallel;
		this.resistors = new TotalResistance[rn.resistors.length];
		for (int i = 0; i < resistors.length; i++) {
			this.resistors[i] = rn.resistors[i];
		}
	}
	
	//methods
	public double getTotalResistance () {
        double totalResistance = 0.0;

        if (parallel) {
            for (int i = 0; i < resistors.length; i++) {
                totalResistance += 1 / resistors[i].getTotalResistance();
            }
            totalResistance = 1 / totalResistance;
        } else {
            for (int i = 0; i < resistors.length; i++) {
                totalResistance += resistors[i].getTotalResistance();
            }
        }
        return totalResistance;
        // total resistance of network
    }
	
	
	public TotalResistance deepCopy() {
		return new ResistorNetwork(this); 
	}
	public TotalResistance getResistor(int index) {
		return resistors[index];
	}
	public boolean isParallel() {
		return parallel;
	};
	public boolean isSerial() {
		return !parallel;
	};
}
