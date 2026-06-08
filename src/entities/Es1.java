package entities;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Es1 {
    public static void esegui() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1;
        }

        System.out.println("Array iniziale: " + Arrays.toString(array));

        while (true) {
            System.out.println("Inserisci un numero (oppure 0 per uscire): ");
            int numero = scanner.nextInt();

            if (numero == 0) {
                System.out.println("Ciao!");
                break;
            }

            System.out.print("In quale posizione vuoi inserirlo (0-4)? ");
            int posizione = scanner.nextInt();
            try {
                array[posizione] = numero;
                System.out.println("Nuovo stato dell'array: " + Arrays.toString(array));
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Errore: Posizione non valida! L'indice deve essere tra 0 e 4.");
            }
        }
    }
}