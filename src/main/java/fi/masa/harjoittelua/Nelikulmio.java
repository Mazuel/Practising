	package fi.masa.harjoittelua;

public class Nelikulmio {
	public static void main(String[] args) {
		Nelikulmio laskuri = new Nelikulmio();
		KonsoliLukija consoleIn = new KonsoliLukija();
		laskuri.laskeNumero(consoleIn);
	}

	public String laskeNumero(KonsoliLukija consoleIn) {
		System.out.println("Haluatko rakentaa nelikulmion?");
		String result = "";
		if (consoleIn.read().equals("kyllä")) {
			System.out.println("Kerro nelikulmion pituus");
			int NelikulmioPituus = Integer.parseInt(consoleIn.read());
			System.out.println("Kerro nelikulmion korkeus");
			int NelikulmioKorkeus = Integer.parseInt(consoleIn.read());

			for (int luku2 = 0; luku2 < NelikulmioKorkeus; ++luku2) {
				System.out.println(" ");
				for (int luku1 = 0; luku1 < NelikulmioPituus; ++luku1) {
					System.out.print("*");
					result = result + "*";
				}
				if (luku2 != NelikulmioKorkeus - 1) {

					result = result + "\n";
				}
			}

		}
		return result;
	}

}
