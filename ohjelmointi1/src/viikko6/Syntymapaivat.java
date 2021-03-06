package viikko6;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Scanner;



// KOETEHTÄVÄ 13.10. 
public class Syntymapaivat {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		System.out.println("Anna henkilön syntymäpäivä (esim. 30.10.1981): ");
		String synttarit = lukija.nextLine();
		// PILKOTAAN ANNETTU PÄIVÄMÄÄRÄ OSIIN
		String[] solut = synttarit.split("\\.");
		int paivat = Integer.parseInt(solut[0]);
		int kuukaudet = Integer.parseInt(solut[1]);
		int vuodet = Integer.parseInt(solut[2]);
		
		LocalDate synttariPaivamaara = LocalDate.of(vuodet, kuukaudet, paivat);
		LocalDate paivaNyt = LocalDate.now();
		
		int vuosiNyt = paivaNyt.getYear();
		long paiviaValissa = 0;
		// ALOITETAAN LASKENTA, KUINKA MONTA PÄIVÄÄ SYNTTÄREIHIN ON?
		if(paivaNyt.getMonthValue() == kuukaudet) {
			if(paivaNyt.getDayOfMonth() > paivat) {
				synttariPaivamaara = LocalDate.of(vuosiNyt + 1,  kuukaudet, paivat);
				paiviaValissa = Duration.between(paivaNyt.atStartOfDay(), synttariPaivamaara.atStartOfDay()).toDays();
				System.out.println("Syntymäpäiviin on " + paiviaValissa + " päivää");
			} else if(paivaNyt.getDayOfMonth() == paivat) {
				System.out.println("Tänään on syntymäpäiväsi!");
			} else {
				synttariPaivamaara = LocalDate.of(vuosiNyt, kuukaudet, paivat);
				paiviaValissa = Duration.between(paivaNyt.atStartOfDay(), synttariPaivamaara.atStartOfDay()).toDays();
				System.out.println("Syntymäpäiviin on " + paiviaValissa + " päivää");
			}
		} else if(paivaNyt.getMonthValue() < kuukaudet) {
			synttariPaivamaara = LocalDate.of(vuosiNyt, kuukaudet, paivat);
			paiviaValissa = Duration.between(paivaNyt.atStartOfDay(), synttariPaivamaara.atStartOfDay()).toDays();
			System.out.println("Syntymäpäiviin on " + paiviaValissa + " päivää");
		} else {
			synttariPaivamaara = LocalDate.of(vuosiNyt+1, kuukaudet, paivat);
			paiviaValissa = Duration.between(paivaNyt.atStartOfDay(), synttariPaivamaara.atStartOfDay()).toDays();
			System.out.println("Syntymäpäiviin on " + paiviaValissa + " päivää");			
		}
	}

}
