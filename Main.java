public class Main {

    public static void main(String[] args) {

        Conta conta = new Conta("Felipe", 1234, 1000);
        conta.exibirInformacoes();
        conta.depositar(500);

        System.out.println();

        ContaPoupanca poupanca = new ContaPoupanca("Maria", 5678, 2000, 0.05);
        poupanca.exibirInformacoes();
        poupanca.aplicarJuros();

        System.out.println();

        ContaCorrente corrente = new ContaCorrente("João", 9999, 1500, 500);
        corrente.exibirInformacoes();
        corrente.saqueCorrente();
    }
}