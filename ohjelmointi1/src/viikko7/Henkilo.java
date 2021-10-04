package viikko7;

public class Henkilo {
	private String nimi;
	private String osoite;
	
	public Henkilo() {
	}

	public Henkilo(String nimi, String osoite) {
		this.nimi = nimi;
		this.osoite = osoite;
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public String getOsoite() {
		return osoite;
	}

	public void setOsoite(String osoite) {
		this.osoite = osoite;
	}

	@Override
	public String toString() {
		return "Henkilo [nimi=" + nimi + ", osoite=" + osoite + "]";
	}
	
	
	
	
}
