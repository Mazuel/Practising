package fi.masa.harjoittelua;

import java.util.Scanner;

public class Harjoitus4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 0;
		int b = Integer.parseInt(scan.nextLine());
		int c = b;

		while (c > 0) {
			int d = scan.nextInt();

			a = a + d;
			c = c - 1;

		}
		if (b == 0) {

			System.out.println("heissulivei");
		} else {

			System.out.println(a / b);
		}

	}

}
