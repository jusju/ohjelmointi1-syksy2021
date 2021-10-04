package viikko7;

import java.util.Scanner;

public class HenkiloOhjelma {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		System.out.print("Anna nimi: ");
		String nimi = lukija.nextLine();
		System.out.print("Anna osoite: ");
		String osoite = lukija.nextLine();
		
		Henkilo henkilo = new Henkilo();
		henkilo.setNimi(nimi);
		henkilo.setOsoite(osoite);
		
		System.out.println("Nimi: " + henkilo.getNimi());
		System.out.println("Osoite: " + henkilo.getOsoite());
	}

}
