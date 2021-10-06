package viikko7;

import java.util.Scanner;

public class HenkiloSovellus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		Henkilo henkilo = new Henkilo();

		int valinta = 0;

		do {
			System.out.println("1. Anna henkilö");
			System.out.println("2. Näytä henkilön tiedot");
			System.out.println("3. Muuta henkilön tietoja");
			System.out.println("0. Lopetus");
			System.out.print("Anna valintasi (0-3): ");
			valinta = input.nextInt();
			// SELÄNPÄÄ ENTERIN POISTO
			input.nextLine();

			if (valinta == 1) {
				System.out.print("Anna nimi: ");
				String nimi = input.nextLine();
				henkilo.setNimi(nimi);

				System.out.print("Anna osoite: ");
				String osoite = input.nextLine();
				henkilo.setOsoite(osoite);

			} else if (valinta == 2) {
				if (henkilo.getNimi() == null && henkilo.getOsoite() == null) {
					System.out.println("Henkilöä ei ole");
				} else {
					System.out.println("nimi=" + henkilo.getNimi() +
							", osoite=" + henkilo.getOsoite());
				}

			} else if (valinta == 3) {
				if (henkilo.getNimi() == null && henkilo.getOsoite() == null) {
					System.out.println("Henkilöä ei ole");
				} else {
					System.out.print("Anna nimi: ");
					String nimi = input.nextLine();
					henkilo.setNimi(nimi);

					System.out.print("Anna osoite: ");
					String osoite = input.nextLine();
					henkilo.setOsoite(osoite);
				}
			}
		} while (valinta == 1 || valinta == 2 || valinta == 3);

	}

}