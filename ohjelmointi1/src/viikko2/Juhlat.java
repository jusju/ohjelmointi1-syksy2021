package viikko2;

import java.util.Scanner;
public class Juhlat {
	public static void main(String[] args) {
		// SKANNERIN LUONTI
		Scanner input = new Scanner(System.in);
		System.out.print("Anna juhliin tulevien aikuisten m??r?: ");
		int aikuistenLukumaara = input.nextInt();
		double pullojenMaara = aikuistenLukumaara / 7.0;
		// "PY?RISTET??N" YL?SP?IN
		double alkostaHaetaanPulloja = Math.ceil(pullojenMaara);
		// DESIMAALULUVUN PAKOTTAMINEN INT-MUUTTOJAKSI TAI KAYTTAA MATH.FLOOR
		// PAKOTTAMISTA SANOTAAN MYOS PAKOTETUKSI TYYPPIMUUNNOKSEKSI ELI "KASTAUS"
		int alkostaHaetaanPullojaInt = (int)alkostaHaetaanPulloja;
		System.out.println("Pulloja tarvitaan " + alkostaHaetaanPullojaInt + " kappaletta");
		double viimeisestaPullostaJaa = (alkostaHaetaanPulloja * 7) - aikuistenLukumaara;
		int viimeisestaPullostaJaaInt = (int)viimeisestaPullostaJaa;
		System.out.println("Viimeisest? pullosta j?? " + viimeisestaPullostaJaaInt +  " lasia");
		// Anna juhliin tulevien aikuisten m??r?: 23
		// Pulloja tarvitaan 4 kappaletta
		// Viimeisest? pullosta j?? 5 lasia
	}

}
