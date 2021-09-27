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

		int[] aputaulukko = new int[MAX];
		int mittaus = 0;
		int mittaustenMaara = 0;
		while (mittaus != -999 && mittaustenMaara < MAX) {
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
		while(indeksi < oikeanKokoinenTaulukko.length) {
			oikeanKokoinenTaulukko[indeksi] = aputaulukko[indeksi];
			indeksi++;
		}
		
		// SIJOITETAAN APUTAULUKKO PARAMETRINA TULLEESEEN TAULUKKOON
		for (int i = 0; i < oikeanKokoinenTaulukko.length; i++) {
			lampotilat[i] = oikeanKokoinenTaulukko[i];
		}
		Arrays.sort(lampotilat, 0, mittaustenMaara);		
		return mittaustenMaara;
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