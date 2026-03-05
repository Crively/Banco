public class ContaCorrente extends Conta {

    private double limite;

    public ContaCorrente(String titular, int numeroConta, double saldo, double limite) {
        super(titular, numeroConta, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void saqueCorrente() {

        double limiteTotal = getSaldo() + limite;

        System.out.println("Limite total para saque: " + limiteTotal);
    }
}