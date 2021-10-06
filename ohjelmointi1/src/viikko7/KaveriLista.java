package viikko7;

import java.util.Scanner;
import java.util.ArrayList;

public class KaveriLista {

	public static void main(String[] args) {

		Scanner lukija = new Scanner(System.in);

		// LUODAAN KAVERILISTA, JOSSA ON STRING-TYYPPISIÄ MUUTTUJIA ELI OLIOITA
		// KOLME KIRJAINTA JA CTRL+SPACE
		// LISTOJEN KANSSA AINA () SULKEET JA TAULUKOIDEN KANSSA []
		ArrayList<String> kaverit = new ArrayList<String>();
		int valinta = 1;

		while (valinta != 5) {
			System.out.println("Kaverilistan toiminnot");
			System.out.println("1) Lisää kaveri");
			System.out.println("2) Listaa kaverit");
			System.out.println("3) Poista kaveri");
			System.out.println("4) Lopeta");
			System.out.println("Valitse toiminto (1-4): ");
			valinta = lukija.nextInt();
			// SELÄNPÄÄ ENTERIN POISTO, KOSKA LUETTIIN LUKU ELI SYÖTEPUSKURIN TYHJENNYS
			lukija.nextLine();
			if(valinta == 1) {
				System.out.println("Anna nimi: ");
				String nimi = lukija.nextLine();
				// LISTAAN PYSTYTÄÄN LISÄÄMÄÄN SOLUJA ADD-KOMENNOLLA SEURAAVASTI
				kaverit.add(nimi);
			} else if(valinta == 2) {
				// KUTEN TAULUKOISSA, LISTAAMINEN JA KOPIOINTI YMS TARKOITTAA FOR-LAUSETTA
				for (int i = 0; i < kaverit.size(); i++) {
					// LISTASTA SAADAAN HAETTUA SOLUN ARVO GET-KOMENNOLLA
					System.out.println(i + ") " + kaverit.get(i));
				}
				
			} else if(valinta == 3) {
				System.out.print("Anna poistettavan indeksi: ");
				int indeksi = lukija.nextInt();
				// INDEKSIN AVULLA LISTASTA VOI POISTAA TIETOA
				kaverit.remove(indeksi);
			} else if(valinta == 4) {
				// ON OLEMASSA KOMENTO, JOKA TAPPAA JAVA-OHJELMAN VÄLITTÖMÄSTI
				System.exit(0);
			}
		}
	}
}
