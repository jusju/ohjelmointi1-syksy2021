package viikko8;

import java.util.Scanner;

public class KysyUudestaan {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		System.out.print("Sy�t� kokonaisluku: ");
		int kokonaisluku = 0;
		try {
			kokonaisluku = lukija.nextInt();
			// PUSKURI ENTER LUETTAVA POIS
			lukija.nextLine();
			System.out.println("Sy�tit luvun " + kokonaisluku + ".");
		} catch(Exception e) {
			// PUSKURI ENTER LUETTAVA POIS			
			lukija.nextLine();
			System.out.println("Virheellinen luku!");
			while(true) {
				try {
					System.out.print("Sy�t� kokonaisluku: ");
					kokonaisluku = lukija.nextInt();
					// PUSKURI ENTER LUETTAVA POIS	
					lukija.nextLine();
					System.out.println("Sy�tit luvun " + kokonaisluku + ".");
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
