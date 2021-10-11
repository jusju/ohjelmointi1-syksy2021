package viikko8;

import java.util.Scanner;

public class IkaOhjelma {
	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		System.out.println("Anna ik�si?");
		// OHJELMAN AJONAIKAINEN VIRHE ELI POIKKEUS - EXCEPTION
		// OHJELMAN SAA KAATUMAAN AJON AIKANA
		// POIKKEUKSEN SYNTYMINEN SAADAAN ESTETTY� TRY-CATCH RAKENTEELLA/LOHKOLLA
		int ika = 0;
		try {
			ika = lukija.nextInt();
			lukija.nextLine();
		} catch(Exception e) {
			lukija.nextLine();
			System.out.println("Annoit ik�si v��r�ss� muodossa!");
			while(true) {
				try {
					System.out.println("Anna ik�si?");
					ika = lukija.nextInt();
					lukija.nextLine();
					break;
				} catch(Exception ex) {
					lukija.nextLine();
					System.out.println("Annoit ik�si v��r�ss� muodossa!");
				} 
			}
		}
		System.out.println("Ik�si on siis: " + ika);
	}
}


