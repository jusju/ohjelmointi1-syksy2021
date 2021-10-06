package viikko7;

public class Henkilo {
	
	private String nimi;
	private String osoite;
	
	public Henkilo() {
		
	}
	
	public Henkilo(String nimi, String osoite) {
		this.nimi = nimi;
		this.nimi = osoite;
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
	
	public void nimiMuutos(String nimi) {
        this.nimi += nimi;
  
    }
	
	public void osoiteMuutos(String osoite) {
        this.osoite += osoite;
        
	}    

	@Override
	public String toString() {
		if(nimi == null && osoite == null ) {
			return "Henkil�� ei ole";
		} else {
			return "Henkilo [nimi=" + nimi + ", osoite=" + osoite + "]";
		}
	}
	
	
}