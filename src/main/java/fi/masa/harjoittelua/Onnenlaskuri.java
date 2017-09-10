package fi.masa.harjoittelua;

public class Onnenlaskuri {
	public static void main(String[] args) {
		Onnenlaskuri laskuri = new Onnenlaskuri();
		KonsoliLukija consoleIn = new KonsoliLukija();
		laskuri.laskeNumero(consoleIn);
	}

	public String laskeNumero(KonsoliLukija consoleIn) {
		int onnennumero = -1;
		double onnenkerroin = 0;
		System.out.println("Hei! Haluatko tietää onnennumerosi? (kyllä tai ei)");
		String vastaus = consoleIn.read();

		if (vastaus.equals("kyllä")) {
			System.out.println("Kerro pituutesi");
			int pituus = Integer.parseInt(consoleIn.read());
			System.out.println("Kerro painosi");
			int paino = Integer.parseInt(consoleIn.read());
			onnennumero = (pituus * paino) / 21;
			onnenkerroin = onnennumero / 3.14;
//			System.out.println("Onnennumerosi on: " + onnennumero);
			System.out.println(String.format("Onnennumerosi on %s ja onnenkerroin on %s", onnennumero, onnenkerroin));
		} else {
			System.out.println("Näkemiin.");
		}
		return String.format("Onnennumerosi on %s ja onnenkerroin on %s", onnennumero, onnenkerroin);
	}


	

}
