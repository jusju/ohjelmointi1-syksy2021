package viikko8;

import java.util.Scanner;

public class KysyUudestaan {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		System.out.print("Syötä kokonaisluku: ");
		int kokonaisluku = 0;
		try {
			kokonaisluku = lukija.nextInt();
			// PUSKURI ENTER LUETTAVA POIS
			lukija.nextLine();
			System.out.println("Syötit luvun " + kokonaisluku + ".");
		} catch(Exception e) {
			// PUSKURI ENTER LUETTAVA POIS			
			lukija.nextLine();
			System.out.println("Virheellinen luku!");
			while(true) {
				try {
					System.out.print("Syötä kokonaisluku: ");
					kokonaisluku = lukija.nextInt();
					// PUSKURI ENTER LUETTAVA POIS	
					lukija.nextLine();
					System.out.println("Syötit luvun " + kokonaisluku + ".");
					break;
				} catch(Exception ex) {
					// PUSKURI ENTER LUETTAVA POIS	
					lukija.nextLine();
					System.out.println("Virheellinen luku!");
				}
			}
		}
	}
}
