package ExerciciosLista1;

import java.util.Scanner;

public class exerciciopratico15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldoAtual = 100 + Math.random() * 900;
        saldoAtual = Math.round(saldoAtual * 100.0) / 100.0;

        System.out.println("Caixa Eletrônico");
        System.out.printf("Seu saldo inicial é: R$ %.2f\n", saldoAtual);

        System.out.println("\nEscolha uma opção:");
        System.out.println("1 - Depósito");
        System.out.println("2 - Saque");
        System.out.println("3 - Consulta Saldo");
        System.out.print("Digite sua opção: ");
        int opcao = scanner.nextInt();

        double valor;

        switch (opcao) {
            case 1:
                System.out.print("Digite o valor para depósito: ");
                valor = scanner.nextDouble();
                if (valor > 0) {
                    saldoAtual += valor;
                    System.out.printf("Depósito realizado, Saldo atual: R$ %.2f\n", saldoAtual);
                } else {
                    System.out.println("Valor inválido para depósito.");
                }
                break;
            case 2:
                System.out.print("Digite o valor para saque: ");
                valor = scanner.nextDouble();
                if (valor > 0) {
                    if (saldoAtual >= valor) {
                        saldoAtual -= valor;
                        System.out.printf("Saque realizado, Saldo atual: R$ %.2f\n", saldoAtual);
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                } else {
                    System.out.println("Valor inválido para saque.");
                }
                break;
            case 3:
                System.out.printf("Seu saldo atual é: R$ %.2f\n", saldoAtual);
                break;
            default:
                System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}