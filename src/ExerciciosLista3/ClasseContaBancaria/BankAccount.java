package ClasseContaBancaria;

public class BankAccount {
        private String accountNumber;
        private double balance;

        public BankAccount(String accountNumber) {
            this.accountNumber = accountNumber;
            this.balance = 0.0;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public double getBalance() {
            return balance;
        }

        public boolean deposit(double amount) {
            if (amount <= 0) {
                System.out.println("Valor de depósito inválido!");
                return false;
            }
            balance += amount;
            return true;
        }

        public boolean withdraw(double amount) {
            if (amount <= 0) {
                System.out.println("Valor para saque inválido!");
                return false;
            }
            if (balance < amount) {
                System.out.println("Saldo insuficiente!");
                return false;
            }
            balance -= amount;
            return true;
        }
}
