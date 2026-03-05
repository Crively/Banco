public class ContaPoupanca extends Conta {

    private double taxaJuros;

    public ContaPoupanca(String titular, int numeroConta, double saldo, double taxaJuros) {
        super(titular, numeroConta, saldo);
        this.taxaJuros = taxaJuros;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public void aplicarJuros() {

        double rendimento = getSaldo() * taxaJuros;
        double novoSaldo = getSaldo() + rendimento;

        setSaldo(novoSaldo);

        System.out.println("Rendimento: " + rendimento);
        System.out.println("Novo saldo: " + novoSaldo);
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Taxa de juros: " + taxaJuros);
    }
}