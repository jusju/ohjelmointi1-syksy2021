package viikko7;

// KOHDELUOKKA ELI ENTITY CLASS
public class Asunto {
	// 1. ATTRIBUUTIT ELI OMINAISUUDET
	private String tyyppi;
	private String osoite;
	private double pintaAla;
	private double hinta;
	private String kuvaus;
	// 2. PARAMETRITÖN JA PARAMETRILLINEN KONSTRUKTORI
	public Asunto() {
	}
	public Asunto(String asunnonTyyppi, String osoite, double pintaAla, double hinta, String kuvaus) {
		this.tyyppi = tyyppi;
		this.osoite = osoite;
		this.pintaAla = pintaAla;
		this.hinta = hinta;
		this.kuvaus = kuvaus;
	}
	// 3. GET- JA SET-METODIT
	public String getTyyppi() {
		return tyyppi;
	}
	public void setTyyppi(String tyyppi) {
		this.tyyppi = tyyppi;
	}
	public String getOsoite() {
		return osoite;
	}
	public void setOsoite(String osoite) {
		this.osoite = osoite;
	}
	public double getPintaAla() {
		return pintaAla;
	}
	public void setPintaAla(double pintaAla) {
		this.pintaAla = pintaAla;
	}
	public double getHinta() {
		return hinta;
	}
	public void setHinta(double hinta) {
		this.hinta = hinta;
	}
	public String getKuvaus() {
		return kuvaus;
	}
	public void setKuvaus(String kuvaus) {
		this.kuvaus = kuvaus;
	}
	// 4. TOSTRING-METODI
	@Override
	public String toString() {
		return "Asunto [tyyppi=" + tyyppi + ", osoite=" + osoite + ", pintaAla=" + pintaAla + ", hinta=" + hinta
				+ ", kuvaus=" + kuvaus + "]";
	}
}
