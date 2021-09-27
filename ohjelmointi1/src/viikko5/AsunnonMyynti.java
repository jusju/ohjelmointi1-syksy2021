package viikko5;

import java.util.Scanner;

public class AsunnonMyynti {

	// METODI JOKA KYSYY K�YTT�J�LT� MYYNTIHINNAN
	// PALAUTTAA ANNETUN MYYNTIHINNAN
	// METODIN M��RITYS
	public static double kysyMyyntihinta() {
		Scanner lukija = new Scanner(System.in);
		System.out.println("Anna myyntihinta: ");
		double myyntihinta = lukija.nextDouble();
		return myyntihinta;
	}
	// METODI, JOKA SAA PARAMETRINA MYYNTIHINNAN
	// JA LASKEE SIIT� PALKKION 3.4%
	// METODIN M��RITYS
	public static double laskePalkkio(double myyntihinta) {
		double palkkio = myyntihinta * 0.034;
		return palkkio;
	}
	// METODI, JOKA EI PALAUTA MIT��N ELI PALAUTUSARVO VOID
	// METODIN M��RITYS
	public static void tulostaPalkanMaara(double palkkaMyydystaAsunnosta) {
		System.out.println("Palkan m��r� on: " + palkkaMyydystaAsunnosta);
	}

	// MAIN ELI P��OHJELMA
	public static void main(String[] args) {
		double myyntihinta, palkkaMyydystaAsunnosta;
		// METODIN KUTSU, JOSSA METODI PALAUTTAA DOUBLEN
		myyntihinta = kysyMyyntihinta();
		// METODIN KUTSU, JOKA SAA PARAMETRINA DOUBLE MUUTTUJAN JA PALAUTTAA DOUBLEN
		palkkaMyydystaAsunnosta = laskePalkkio(myyntihinta);
		// VOID METODIN KUTSU, ELI EI PALAUTA MIT��N
		tulostaPalkanMaara(palkkaMyydystaAsunnosta);
	}
}
