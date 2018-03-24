package fi.masa.harjoittelua;

import java.util.Scanner;

public class Rps {

    public static void main(String[] args) {

        Scanner playerInput = new Scanner(System.in);

        System.out.println("Player 1 enter R, P or S");

        String line = playerInput.nextLine();

        System.out.println("Player 2 enter R, P or S");

        String line2 = playerInput.nextLine();

        if (line.equalsIgnoreCase(line2)) {
            System.out.println("Its a tie!");

        }
        
        playerInput.close();

    }
}
