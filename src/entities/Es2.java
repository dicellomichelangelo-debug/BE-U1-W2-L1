package entities;

import java.util.Scanner;

public class Es2 {
    public static void esegui() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- INTERI ---");
        try {
            System.out.println("Inserisci km percorsi: ");
            int km = scanner.nextInt();
            System.out.println("Inserisci litri consumati: ");
            int litri = scanner.nextInt();
            int kmAlLitro = km / litri;
            System.out.println("Risultato: " + kmAlLitro + " km/l");
        } catch (ArithmeticException e) {
            System.out.println("Errore con int: Impossibile dividere per zero!");
        }

        System.out.println("--- DECIMALI ---");
        try {
            System.out.println("Inserisci km percorsi: ");
            double kmDouble = scanner.nextDouble();
            System.out.println("Inserisci litri consumati: ");
            double litriDouble = scanner.nextDouble();

            if (litriDouble == 0) {
                throw new ArithmeticException("Divisione per zero con double!");
            }

            double kmAlLitroDouble = kmDouble / litriDouble;
            System.out.println("Risultato: " + kmAlLitroDouble + " km/l");
        } catch (ArithmeticException e) {
            System.out.println("Errore con double: I litri non possono essere zero!");
        }
    }
}