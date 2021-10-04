package viikko7;

import java.text.DecimalFormat;
import java.util.Scanner;

// OHJELMALUOKKA, JOKA SISÄLTÄÄ PÄÄOHJELMAN - PROGRAM CLASS
public class AsuntoOhjelma {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		System.out.print("Anna asunnon tyyppi: ");
		String tyyppi = lukija.nextLine();
		System.out.print("Anna osoite: ");
		String osoite  = lukija.nextLine();
		System.out.print("Anna pinta-ala: ");
		double pintaAla = lukija.nextDouble();
		// ENTER JA SYÖTTÖPUSKURIIN
		lukija.nextLine();
		System.out.print("Anna hinta: ");
		double hinta = lukija.nextDouble();
		// ENTER JA SYÖTTÖPUSKURIIN
		lukija.nextLine();
		System.out.print("Anna kuvaus: ");
		String kuvaus = lukija.nextLine();
		// 1 .LUODA OLIO ASUNTO
		Asunto asunto = new Asunto();
		// 2. ASETETAAN ASUNNOLLE ARVOT SET-METODEILLA
		asunto.setTyyppi(tyyppi);
		asunto.setOsoite(osoite);
		asunto.setPintaAla(pintaAla);
		asunto.setHinta(hinta);
		asunto.setKuvaus(kuvaus);
	
		DecimalFormat desimaalit = new DecimalFormat("0.00");
		// 3. ASUNTO-OLION TIEDOT NÄYTÖLLE HALUTUSSA MUODOSSA
		System.out.println("Tyyppi: " + asunto.getTyyppi());
		System.out.println("Osoite: " + asunto.getOsoite());
		System.out.println("Pinta-ala: " + desimaalit.format(asunto.getPintaAla()));
		System.out.println("Hinta: " + desimaalit.format(asunto.getHinta()) + " euroa");
		System.out.println("Kuvaus: " + asunto.getKuvaus());
	}
}
