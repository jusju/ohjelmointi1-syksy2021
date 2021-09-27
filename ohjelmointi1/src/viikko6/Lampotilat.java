package viikko6;

import java.util.Arrays;
import java.util.Scanner;

public class Lampotilat {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Lampotilat olio = new Lampotilat();
		final int MAX = 100;

		// LUODAAN TAULUKKO
		int[] lampotilat = new int[MAX];

		// METODIA KUTSUTAAN JA PALAUTTAA ARVON
		int maara = olio.kysyLampotilat(lampotilat, MAX);
		
		olio.naytaLampotilat(lampotilat, maara);
		

	}
	// METODIN MAARITYS
	public int kysyLampotilat(int[] lampotilat, final int MAX) {
		Scanner input = new Scanner(System.in);

		int lampo = 0;
		int lkm = 0;
		while (lampo != -999 && lkm < MAX) {
			System.out.println("Anna lämpötila: ");
			lampo = input.nextInt();	
			if(lampo == -999) {
				break;
			}
			lampotilat[lkm] = lampo;
			lkm++;
		}
		// SEURAAVAKSI HANKKIUDUTAAN EROON TURHISTA ISOISTA TAULUKOISTA
		int indeksi = 0;

		Arrays.sort(lampotilat, 0, lkm);		
		return lkm;
	}

	public void naytaLampotilat(int[] lampotilat, int lkm) {
		System.out.println("Annoit lämpötilat: ");
		for (int i = 0; i < lampotilat.length; i++) {
			if(lampotilat[i] != 0) {
				System.out.print(lampotilat[i] +  " ");
			}
		}

	}
}