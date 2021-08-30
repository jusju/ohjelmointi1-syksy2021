package viikko2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Kiinteisto {

	public static void main(String[] args) {
		final double PALKKIOPROSENTTI = 3.44;
		final double MINPALKKIO = 2214.00;
		double myyntihinta, palkkio;
		Scanner input = new Scanner(System.in);
		System.out.print("Anna myyntihinta: ");
		myyntihinta = input.nextDouble();
		palkkio = myyntihinta * (PALKKIOPROSENTTI / 100.0);
		if (palkkio < MINPALKKIO) {
			palkkio = MINPALKKIO;
		}
		DecimalFormat f = new DecimalFormat("0.00");
		System.out.println("Myyntipalkkio on " + f.format(palkkio));
	}
}
