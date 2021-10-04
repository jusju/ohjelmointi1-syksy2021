package viikko6;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Scanner;



// KOETEHT�V� 13.10. 
public class Syntymapaivat {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		System.out.println("Anna henkil�n syntym�p�iv� (esim. 30.10.1981): ");
		String synttarit = lukija.nextLine();
		// PILKOTAAN ANNETTU P�IV�M��R� OSIIN
		String[] solut = synttarit.split("\\.");
		int paivat = Integer.parseInt(solut[0]);
		int kuukaudet = Integer.parseInt(solut[1]);
		int vuodet = Integer.parseInt(solut[2]);
		
		LocalDate synttariPaivamaara = LocalDate.of(vuodet, kuukaudet, paivat);
		LocalDate paivaNyt = LocalDate.now();
		
		int vuosiNyt = paivaNyt.getYear();
		long paiviaValissa = 0;
		// ALOITETAAN LASKENTA, KUINKA MONTA P�IV�� SYNTT�REIHIN ON?
		if(paivaNyt.getMonthValue() == kuukaudet) {
			if(paivaNyt.getDayOfMonth() > paivat) {
				synttariPaivamaara = LocalDate.of(vuosiNyt + 1,  kuukaudet, paivat);
				paiviaValissa = Duration.between(paivaNyt.atStartOfDay(), synttariPaivamaara.atStartOfDay()).toDays();
				System.out.println("Syntym�p�iviin on " + paiviaValissa + " p�iv��");
			} else if(paivaNyt.getDayOfMonth() == paivat) {
				System.out.println("T�n��n on syntym�p�iv�si!");
			} else {
				synttariPaivamaara = LocalDate.of(vuosiNyt, kuukaudet, paivat);
				paiviaValissa = Duration.between(paivaNyt.atStartOfDay(), synttariPaivamaara.atStartOfDay()).toDays();
				System.out.println("Syntym�p�iviin on " + paiviaValissa + " p�iv��");
			}
		} else if(paivaNyt.getMonthValue() < kuukaudet) {
			synttariPaivamaara = LocalDate.of(vuosiNyt, kuukaudet, paivat);
			paiviaValissa = Duration.between(paivaNyt.atStartOfDay(), synttariPaivamaara.atStartOfDay()).toDays();
			System.out.println("Syntym�p�iviin on " + paiviaValissa + " p�iv��");
		} else {
			synttariPaivamaara = LocalDate.of(vuosiNyt+1, kuukaudet, paivat);
			paiviaValissa = Duration.between(paivaNyt.atStartOfDay(), synttariPaivamaara.atStartOfDay()).toDays();
			System.out.println("Syntym�p�iviin on " + paiviaValissa + " p�iv��");			
		}
	}

}
