package viikko4;

import java.util.Scanner;

public class Lumi {
	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		String nimi = "";
		// ESITELLAAN KERRYTYSROOLINEN MUUTTUJA
		// HUOMAA MENTAL MODELLI
		int nimimaara = 0;
		int lumimaara = 0;
		while(nimi.equals("LOPPU") == false) {
			System.out.print("Anna nimi: ");
			nimi = lukija.nextLine();
			nimimaara = nimimaara + 1;
			if(nimi.equalsIgnoreCase("lumi") == true) {
				lumimaara = lumimaara + 1;
			}
		}
		// MY?S LOPPU KASVATTAA NIMIM??R??
		// ELI V?HENNET??N YKSI
		nimimaara = nimimaara - 1;
		
		System.out.println("Nimi? oli " + nimimaara + " kappaletta.");
		System.out.println("Nimi Lumi esiintyi " + lumimaara + " kertaa.");
		
	}
}
