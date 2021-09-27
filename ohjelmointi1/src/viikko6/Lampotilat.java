package viikko6;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Lampotilat {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Lampotilat olio = new Lampotilat();

		int i = 0;
		int mittaus = 0;
		int mittaukset = 0;
		// LUODAAN TAULUKKO
		int[] lampotilat = null;
		final int MAX = 99;
		// METODIA KUTSUTAAN JA PALAUTTAA ARVON
		int maara = olio.kysyLampotilat(lampotilat, MAX);
		
		int[] tulostettavatLampotilat = new int[mittaukset - 1];
		for (int j = 0; j < tulostettavatLampotilat.length; j++) {
			tulostettavatLampotilat[j] = lampotilat[j];
		}
		int mittaustenMaara = olio.kysyLampotilat(lampotilat, MAX);
		olio.naytaLampotilat(tulostettavatLampotilat, mittaustenMaara);
	}
	// METODIN MAARITYS
	public int kysyLampotilat(int[] lampotilat, final int MAX) {
		Scanner input = new Scanner(System.in);
		// LUODAAN APUTAULUKKO, KOSKA TÄYTYY OLLA TAULUKKO, JOLLE ON ANNETTU KOKO
		// TOISIN KUIN LISTOJA VOI LUODA ILMAN KOKOA
		int[] aputaulukko = new int[99];
		int mittaus = 0;
		int mittaustenMaara = 0;
		while (mittaus != -999 && mittaustenMaara <= MAX) {
			System.out.println("Anna lämpötila: ");
			mittaus = input.nextInt();	
			if(mittaus == -999) {
				break;
			}
			aputaulukko[mittaustenMaara] = mittaus;
			mittaustenMaara++;
		}
		// SEURAAVAKSI HANKKIUDUTAAN EROON TURHISTA ISOISTA TAULUKOISTA
		int indeksi = 0;

		int[] oikeanKokoinenTaulukko = new int[mittaustenMaara];
		while(indeksi <= 99) {
			oikeanKokoinenTaulukko[indeksi] = aputaulukko[indeksi];
		}
		
		// SIJOITETAAN APUTAULUKKO PARAMETRINA TULLEESEEN TAULUKKOON
		lampotilat = oikeanKokoinenTaulukko;
		Arrays.sort(lampotilat);		
		return mittaustenMaara;
	}

	public void naytaLampotilat(int[] lampotilat, int lkm) {
		System.out.println("Annoit lämpötilat: ");
		for (int i = 0; i < lampotilat.length; i++) {
			System.out.print(lampotilat[i] +  " ");
		}

	}
}