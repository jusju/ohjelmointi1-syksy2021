package viikko7;

public class Kappale {
	private String nimi;
	private Artisti artisti;
	private int vuosi;
	private int kesto;
	
	public Kappale() { }
	public String getNimi() { return nimi; }
	public void setNimi(String nimi) { this.nimi = nimi; }
	public Artisti getArtisti() { return artisti; }
	public void setArtisti(Artisti artisti) { this.artisti = artisti; }
	public int getVuosi() { return vuosi; }
	public void setVuosi(int vuosi) { this.vuosi = vuosi; }
	public int getKesto() { return kesto; }
	public void setKesto(int kesto) { this.kesto = kesto; }

	@Override
	public String toString() {
		if(artisti == null) {
			return nimi;
		} else {
			return nimi + " by " + artisti;
		}
	}
	
	
}
