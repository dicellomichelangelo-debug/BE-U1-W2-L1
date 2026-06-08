package entities.Es3;

public class ContoOnline extends ContoCorrente {
    private double maxPrelievo;

    public ContoOnline(String titolare, double saldo, double maxP) {
        super(titolare, saldo);
        this.maxPrelievo = maxP;
    }

    public void stampaSaldo() {
        System.out.println("Titolare: " + getTitolare() +
                " - Saldo: " + restituisciSaldo() +
                " - Num movimenti: " + getnMovimenti() +
                " - Massimo movimenti: " + getMaxMovimenti() +
                " - Massimo prelievo possibile: " + maxPrelievo);
    }

    @Override
    public void preleva(double x) throws BancaException {
        if (x > maxPrelievo) {
            throw new BancaException("il prelievo non è disponibile");
        }
        super.preleva(x);
    }
}