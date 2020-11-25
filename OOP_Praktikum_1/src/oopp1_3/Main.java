/*	Programm:	Main.java 
 * 	Autoren:	Domenic Heidemann, Philipp Riefer
 * 	Datum: 		25.11.2020
 */

package oopp1_3;

public class Main {
	public static void main(String[] args) {
		
		//testing "Lebensmittel"
		Lebensmittel Apfel = new Lebensmittel("Apfel", 0.05, "Bauer Fritz", "Deutschland", "Apfel?", 21, 16, "10.07.2021",0.50, 5, 200);
		Apfel.printInfo();
		System.out.println("");
		
		//testing "Pizza"
		Pizza Hawaii = new Pizza("Hawaii", 0.250, "Frischbackfrisch", "Deutschland", "Käse, Schinken, Ananas", 8, 16,"11.07.2021",1,1,30,"Plastik", "Nur für Menschen mit gutem Geschmack");
		Hawaii.printInfo();
		System.out.println("");
		
		//testing "Banane"
		Banane Chiquita = new Banane("Chiquita Banana", 0.075, "Chiquita","Brasilien", "...Banane?", 21, 16, "12.07.2021",0.65,4,150, "Bio-Plantage", 25);
		Chiquita.printInfo();
	}
}