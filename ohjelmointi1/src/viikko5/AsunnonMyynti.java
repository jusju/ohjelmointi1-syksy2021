package viikko5;

import java.util.Scanner;

public class AsunnonMyynti {

	// METODI JOKA KYSYY KÄYTTÄJÄLTÄ MYYNTIHINNAN
	// PALAUTTAA ANNETUN MYYNTIHINNAN
	public static double kysyMyyntihinta() {
		Scanner lukija = new Scanner(System.in);
		System.out.println("Anna myyntihinta: ");
		double myyntihinta = lukija.nextDouble();
		return myyntihinta;
	}
	
	
	public static double laskePalkkio(double myyntihinta) {

		return palkkio;
	}


	public static void main(String[] args) {
		double myyntihinta, palkkio;
		myyntihinta = kysyMyyntihinta();
		palkkio = laskePalkkio(myyntihinta);

	}
}
