package fi.masa.harjoittelua;

public class Triangle {
    public static void main(String[] args) {
        Triangle laskuri = new Triangle();
        KonsoliLukija consoleIn = new KonsoliLukija();
        laskuri.laskeNumero(consoleIn);
    }

    public String laskeNumero(KonsoliLukija consoleIn) {
        System.out.println("Tulostetaanko salmiakki?");
        String result = "";

        if (consoleIn.read().equals("kyllä")) {
            System.out.println("Kerro salmiakin leveys:");
            final int kolmioKoko = Integer.parseInt(consoleIn.read());
            int kolmioRivi = kolmioKoko;
            int kolmioYlos = kolmioKoko;
            int kolmioAlas = kolmioKoko;

            for (int rivi = 0; rivi < kolmioRivi; rivi++) {
                for (int emptySpaces = 0; emptySpaces < kolmioYlos; ++emptySpaces) {
                    System.out.print(" ");
                    result = result + " ";
                }

                for (int luku = 0; luku <= rivi; luku++) {
                    System.out.print("* ");
                    result = result + "* ";

                }
                kolmioYlos--;
                System.out.println("");
                result = result + "\n";
            }
            for (int rivi = 0; rivi < kolmioRivi; ++rivi) {
                for (int emptySpaces = 0; emptySpaces < rivi; ++emptySpaces) {
                    System.out.print(" ");
                    result = result + " ";
                }

                for (int luku = 0; luku < kolmioAlas - 1; luku++) {
                    if (luku == 0) {
                        System.out.print(" ");
                        result = result + " ";
                    }

                    System.out.print(" *");
                    result = result + " *";
                }
                kolmioAlas--;

                System.out.println("");
                result = result + "\n";

            }
        }
        return result;
    }
}
