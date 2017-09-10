package fi.masa.harjoittelua;

public class PascalTriangle {

    public static void main(String[] args) {
        PascalTriangle laskuri = new PascalTriangle();
        KonsoliLukija consoleIn = new KonsoliLukija();
        laskuri.laskeNumero(consoleIn);

    }

    public String laskeNumero(KonsoliLukija consoleIn) {
        System.out.println("Kuinka monta riviä Pascalin kolmiota tulostetaan?");
        String result = "";
        int rivit = Integer.parseInt(consoleIn.read());

        for (int luku1 = 0; luku1 < rivit; luku1++) {
            int numero = 1;
            System.out.printf("%" + (rivit - luku1) * 2 + "s", "");
            for (int luku2 = 0; luku2 <= luku1; luku2++) {
                System.out.printf("%4d", numero);
                numero = numero * (luku1 - luku2) / (luku2 + 1);
            }
            System.out.println("");

        }

        return result;
    }
}
