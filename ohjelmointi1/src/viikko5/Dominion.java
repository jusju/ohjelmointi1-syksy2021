package viikko5;

import java.util.Scanner;

public class Dominion {

	// MIT? METODIN M??RITYKSEST? PUUTTUU?
	public int laskePisteet(int kirous, int tila, int pitaja, int laani) {
		   //laske pisteiden yhteism??r?
		   //palauta yhteispisteet return-lauseella
		int pisteet = 0;
		pisteet = pisteet + kirous * (-1);
		pisteet = pisteet + (tila * 2);
		pisteet = pisteet + (pitaja * 5);
		pisteet = pisteet + (laani * 8);

		return pisteet;
	}
	
	public static void main(String[] args) {
		// OLION LUONTI OLION PERUSLUONTITAVALLA, T?SS? TARVITAAN OLIO
		// JOTTA METODIA SAADAAN KUTSUTTUA, KOSKA STATIC SANA J?I NYT POIS
		Dominion olio = new Dominion();
		Scanner lukija = new Scanner(System.in);
		System.out.print("Anna kirouskorttien m??r?: ");
		int kirous = lukija.nextInt();
		System.out.print("Anna tilakorttien m??r?: ");
		int tila = lukija.nextInt();		
		System.out.print("Anna pit?j?korttien m??r?: ");
		int pitaja = lukija.nextInt();
		System.out.print("Anna l??nikorttien m??r?: ");
		int laani = lukija.nextInt();
		// METODIA VOI KUTSUA VASTA KUN SEN KUTSUUN LAITETTAVIEN PARAMETRIEN ARVOT OVAT SELVILL?
		// AINA KUN METODI PALAUTTAA JOTAIN, ELI EI LUE VOID, NIIN MUISTA OTTAA PALUUARVO TALTEEN = MERKILL?
		int pisteet = olio.laskePisteet(kirous, tila, pitaja, laani);
		System.out.println("Pisteiden yhteism??r? on " + pisteet);
		System.out.print("");
	}
}
