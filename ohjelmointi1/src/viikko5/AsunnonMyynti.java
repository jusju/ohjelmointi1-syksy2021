package viikko5;

public class AsunnonMyynti {
	public static double kysyMyyntihinta() {

		return myyntihinta;
	}

	public static double laskePalkkio(double myyntihinta) {

		return palkkio;
	}

	public static void main(String[] args) {
		double myyntihinta, palkkio;
		myyntihinta = kysyMyyntihinta();
		palkkio = laskePalkkio(myyntihinta);
	}
}
