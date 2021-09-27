package viikko5;

import java.util.Scanner;

public class AsunnonMyynti {

	// METODI JOKA KYSYY KÄYTTÄJÄLTÄ MYYNTIHINNAN
	// PALAUTTAA ANNETUN MYYNTIHINNAN
	// METODIN MÄÄRITYS
	public static double kysyMyyntihinta() {
		Scanner lukija = new Scanner(System.in);
		System.out.println("Anna myyntihinta: ");
		double myyntihinta = lukija.nextDouble();
		return myyntihinta;
	}
	// METODI, JOKA SAA PARAMETRINA MYYNTIHINNAN
	// JA LASKEE SIITÄ PALKKION 3.4%
	// METODIN MÄÄRITYS
	public static double laskePalkkio(double myyntihinta) {
		double palkkio = myyntihinta * 0.034;
		return palkkio;
	}
	// METODI, JOKA EI PALAUTA MITÄÄN ELI PALAUTUSARVO VOID
	// METODIN MÄÄRITYS
	public static void tulostaPalkanMaara(double palkkaMyydystaAsunnosta) {
		System.out.println("Palkan määrä on: " + palkkaMyydystaAsunnosta);
	}

	// MAIN ELI PÄÄOHJELMA
	public static void main(String[] args) {
		double myyntihinta, palkkaMyydystaAsunnosta;
		// METODIN KUTSU, JOSSA METODI PALAUTTAA DOUBLEN
		myyntihinta = kysyMyyntihinta();
		// METODIN KUTSU, JOKA SAA PARAMETRINA DOUBLE MUUTTUJAN JA PALAUTTAA DOUBLEN
		palkkaMyydystaAsunnosta = laskePalkkio(myyntihinta);
		// VOID METODIN KUTSU, ELI EI PALAUTA MITÄÄN
		tulostaPalkanMaara(palkkaMyydystaAsunnosta);
	}
}
