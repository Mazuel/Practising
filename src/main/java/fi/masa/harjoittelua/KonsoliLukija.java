package fi.masa.harjoittelua;

import java.util.Scanner;

public class KonsoliLukija {
	private Scanner scan;

	public KonsoliLukija() {
		scan = new Scanner(System.in);
	}
	
	public String read() {
		return scan.nextLine();
	}

	@Override
	protected void finalize() throws Throwable {
		scan.close();
		super.finalize();
	}
}
