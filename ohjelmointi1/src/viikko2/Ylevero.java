package viikko2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ylevero {

	public static void main(String[] args) {
		// SKANNERIN LUONTI
		Scanner input = new Scanner(System.in);
		// DECIMALFORMATTERIN LUONTI KAHDEN DESIMAALIN TARKKUUDELLE
		DecimalFormat desimaalit = new DecimalFormat("0.00");
		
		System.out.print("Anna vuositulosi ja ik�si: ");
		// SEURAAVAKSI PIT�ISI LUKEA KAKSI LUKUA , JOTKA SY�TET��N PER�KK�IN V�LILY�NTI V�LISS�
		double vuositulo = input.nextDouble();
		int ika = input.nextInt();
		
		double ylevero = 0;
		if(ika < 18) {
			ylevero = 0;
		} else {
			ylevero = 0.0068 * vuositulo;
			// JOS YLEVERO ON YLI 140 LEIKATAAN YLIMENEV� POIS
			if(ylevero > 140) {
				ylevero = 140;
			} else if(ylevero < 70)  {
				ylevero = 0;
			}
		}
		
		System.out.println("Ylevero on " + desimaalit.format(ylevero));
		// Anna vuositulosi ja ik�si: 9000 21
		// Ylevero on 0,00

	}

}
