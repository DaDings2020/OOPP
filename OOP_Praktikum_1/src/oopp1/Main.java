/*	Programm:	Main.java 
 * 	Autoren:	Domenic Heidemann, Philipp Riefer
 * 	Datum: 		25.11.2020
 */

package oopp1;

public class Main {
	public static void main(String[] args) {
		//testing Prefix.java
		System.out.println(Prefix.nano);	
		
		//testing Resistor.java
		//creating Resistor R1
		Resistor R1 = new Resistor(Prefix.none, 100.0);  
		System.out.println("Der Wert des Widerstands R1 beträgt "+R1.getTotalResistance()+" Ohm");
		//copying R1
		TotalResistance R11 = R1.deepCopy();
		System.out.println("Der Wert der Widerstandskopie R11 beträgt "+R11.getTotalResistance()+" Ohm");
		//creating R2 for later use
		Resistor R2 = new Resistor(Prefix.none, 150.0);
		System.out.println("Der Wert des Widerstands R2 beträgt "+R2.getTotalResistance()+" Ohm");
		
		//testing ResistorNetwork.java
		//creating an array for the network
		TotalResistance[] RA1 = {R1, R2};		
		//creating ResistorNetwork RN1
		ResistorNetwork RN1 = new ResistorNetwork(false, RA1);
		//isParallel and isSerial
		System.out.println("RN1 Parallel: "+RN1.isParallel());
		System.out.println("RN1 Seriell: "+RN1.isSerial());
		//total Resistance RN1
		System.out.println("Gesamtwert der Widerstände im Netzwerk RN1: "+RN1.getTotalResistance()+" Ohm");
		//getResistor RN1
		TotalResistance R3 = RN1.getResistor(1);
		System.out.println("Der Wert des Widerstands R3 beträgt "+R3.getTotalResistance()+" Ohm");
		//copying RN1 on RN2
		TotalResistance RN2 = RN1.deepCopy();
		System.out.println("Gesamtwert der Widerstände im Netzwerk RN2: "+RN2.getTotalResistance()+" Ohm");
	}
}
