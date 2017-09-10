package fi.masa.harjoittelua;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class SatunnaisLista {

    private static ArrayList<Integer> randomArrayList(int number) {

        ArrayList<Integer> arrayRandom = new ArrayList<Integer>(number);
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());

        for (int i = 0; i < number; i++) {
            int r = random.nextInt() % 256;
            arrayRandom.add(r);
        }
        Collections.sort(arrayRandom);
        return arrayRandom;
    }

    private static void ShowArray(ArrayList<Integer> randomArray) {

        int number = randomArray.size();

        ArrayList<Integer> showArray = new ArrayList<Integer>(number);

        for (int i = 0; i < number; i++) {
            int r = randomArray.get(i);
            showArray.add(r);
        }
        System.out.print(showArray);
    }

    public static void main(String[] args) {
        ShowArray(randomArrayList(8));
    }

}
