public class Conta {

    private String titular;
    private int numeroConta;
    private double saldo;

    public Conta(String titular, int numeroConta, double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void exibirInformacoes() {
        System.out.println("Titular da conta: " + titular);
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Saldo da conta: " + saldo);
    }

    public void depositar(double valorDeposito) {
        saldo += valorDeposito;
        System.out.println("Saldo após depósito: " + saldo);
    }
}