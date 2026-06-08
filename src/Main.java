import entities.Es1;
import entities.Es2;
import entities.Es3.BancaException;
import entities.Es3.ContoCorrente;
import entities.Es3.ContoOnline;

public class Main {
    public static void main(String[] args) {

        // ---- TEST ESERCIZIO 1 ----
        Es1.esegui();

        // ---- TEST ESERCIZIO 2 ----
        Es2.esegui();

        // ---- TEST ESERCIZIO 3 ----
        ContoCorrente contoNormale = new ContoCorrente("Mario Rossi", 100);
        ContoOnline contoOnline = new ContoOnline("Michelangelo Di Cello", 500, 200);

        System.out.println("--- Conto Normale ---");
        try {
            System.out.println("Saldo iniziale: " + contoNormale.restituisciSaldo() + "€");
            contoNormale.preleva(150);
        } catch (BancaException e) {
            System.out.println("Errore Banca: " + e.getMessage());
        }

        System.out.println("--- Conto Online ---");
        try {
            contoOnline.stampaSaldo();
            contoOnline.preleva(250);
        } catch (BancaException e) {
            System.out.println("Errore Banca: " + e.getMessage());
        }
    }
}