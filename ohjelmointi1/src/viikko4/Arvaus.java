package viikko4;

import java.util.Random;
import java.util.Scanner;

public class Arvaus {

	static Random satunnaisgeneraattori = new Random();

	public static void main(String[] args) {

		Scanner lukija = new Scanner(System.in);
		int arvaus;
		int arvausKertoja = 0;
		boolean oikein = false;

		int satunnaisluku = 78;

		System.out.print("Arvaa lukua v?lilt? 1-100: ");
		arvaus = lukija.nextInt();
		arvausKertoja = arvausKertoja + 1;

		do {

			if (arvaus == satunnaisluku) {
				System.out.print("Arvasit oikein. Arvauksia oli " + arvausKertoja);
				oikein = true;

			} else if (arvaus > satunnaisluku) {
				System.out.print("Arvaa pienemp??: ");
				arvaus = lukija.nextInt();
				arvausKertoja = arvausKertoja + 1;

			} else if (arvaus < satunnaisluku) {
				System.out.print("Arvaa suurempaa: ");
				arvaus = lukija.nextInt();
				arvausKertoja = arvausKertoja + 1;
			}
		} while (oikein == false);
	}
}