package ClasseContaBancaria;

public class Main {
    public static void main(String[] args) {

    BankAccount conta = new BankAccount("1234-5");
        System.out.println("Conta feita: "+conta.getAccountNumber());
        System.out.println("Saldo inicial: "+conta.getBalance());

        conta.deposit(100);
        System.out.println("Ápos o depósito, o saldo é de:" + conta.getBalance());
    }
}

