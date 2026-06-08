package entities.Es3;

public class ContoCorrente {
    private final int maxMovimenti = 50;
    private String titolare;
    private int nMovimenti;
    private double saldo;

    public ContoCorrente(String titolare, double saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
        this.nMovimenti = 0;
    }

    public void preleva(double x) throws BancaException {
        double costoTotale = x;
        if (nMovimenti >= maxMovimenti) {
            costoTotale += 0.50;
        }

        if (saldo - costoTotale < 0) {
            nMovimenti++;
            throw new BancaException("il conto è in rosso");
        }

        if (nMovimenti < maxMovimenti) {
            saldo = saldo - x;
        } else {
            saldo = saldo - x - 0.50;
        }
        nMovimenti++;
    }

    public double restituisciSaldo() {
        return saldo;
    }

    public String getTitolare() {
        return titolare;
    }

    public int getnMovimenti() {
        return nMovimenti;
    }

    public int getMaxMovimenti() {
        return maxMovimenti;
    }
}