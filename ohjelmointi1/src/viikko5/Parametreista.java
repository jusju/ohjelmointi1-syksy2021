package viikko5;

public class Parametreista {
	public static int eiMuutaParametreja(int luku1, int luku2) {
		luku1 = luku1 + luku2;
		return luku1;
	}

	public static void main(String[] args) {
		int luku1 = 2, luku2 = 5, vastaus;
		vastaus = eiMuutaParametreja(luku1, luku2);
		System.out.println(vastaus);
	}
}