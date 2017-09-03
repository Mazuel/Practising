package fi.masa.harjoittelua;

public class TaulukkoTest {

	public static void main(String[] args) {

		/*
		 * 1) tutki, miten taulokko luodaan 2) Täytä taulukko satunnaisluvuilla väliltä
		 * 1-9
		 * 
		 */
		int s = 1;
		int a = 0;

		// for (a = s; e < 25; )
		for (int i = 1; i < 25;) {
			System.out.println(i);
			a = s;
			s = i + s;
			i = a;
		}
		
		
	}

}
/*
 * Tutki, miten linkitetty lista toimii 1) Täytä linkitetty lista 10 eri nimellä
 * 2) Järjesteä nimet aakkosjärjestykseen
 */
