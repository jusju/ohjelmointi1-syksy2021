package viikko5;

public class PalkkaDemo {
	
	// METODIN M��RITYS, KAKSI PARAMETRI�
	public static double laskePalkka(String koulutus, double veroprosentti) {
		if(koulutus.equals("AMK") || koulutus.equals("DI")) {
			double palkka = 4000 - (4000 * veroprosentti);
			// AINA PALAUTETAAN VAIN YKSI - EI RETURN PALKKA, VEROPROSENTTI
			return palkka;
		} else {
			double palkka = 3000 - (3000 * veroprosentti);			
			return palkka;
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// METODIN KUTSU
		String oppiarvo = "AMK";
		double prossa = 0.25;
		double palkka = laskePalkka(oppiarvo, prossa);
		System.out.println(palkka);
	}
}
