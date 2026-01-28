package ListaDeExercicios.ExerciciosLista04.GestaoDeContasBancarias;

public class Main {
    public static void main(String[] args) {
        ContaBancaria();
        ContaPoupanca();
        ContaCorrente();
    }

    public static void ContaBancaria() {
        System.out.println("Conta Bancária");
        ContaBancaria contaBancaria = new ContaBancaria(30);
        System.out.println("Saldo inicial: " + contaBancaria.getSaldo());
        contaBancaria.depositar(50);
        System.out.println("Após o depósito: " + contaBancaria.getSaldo());
        contaBancaria.sacar(30);
        System.out.println("Após o saque: " + contaBancaria.getSaldo());
        System.out.println("-----");
    }

    public static void ContaPoupanca() {
        ContaPoupanca contaPoupanca = new ContaPoupanca(75, 23);
        System.out.println("Conta Poupança");
        System.out.println("Saldo Inicial: " + contaPoupanca.getSaldo());
        System.out.println("Taxa de rendimento: " + contaPoupanca.getTaxaDeRendimento());
        contaPoupanca.depositar(23);
        System.out.println("Após o depósito: " + contaPoupanca.getSaldo());
        contaPoupanca.sacar(12);
        System.out.println("Após o saque: " + contaPoupanca.getSaldo());
        System.out.println("-----");
    }

    public static void ContaCorrente() {
        ContaCorrente contaCorrente = new ContaCorrente(100);
        System.out.println("Conta Corrente");
        System.out.println("Saldo inicial: " + contaCorrente.getSaldo());
        contaCorrente.depositar(98);
        System.out.println("Após o depósito: " + contaCorrente.getSaldo());
        contaCorrente.sacar(32);
        System.out.println("Após o saque: " + contaCorrente.getSaldo());
    }
}
