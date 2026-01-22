package ListaDeExercicios.ExerciciosLista01;

import java.util.Scanner;

public class exerciciopratico12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a expressão: ");
        String entrada = scanner.nextLine();

        String[] partes = entrada.split(" ");
        if (partes.length != 3) {
            System.out.println("Formato inválido! Use: valor operador valor (ex: 10 + 5)");
            scanner.close();
            return;
        }

        int valorEsquerdo;
        int valorDireito;
        try {
            valorEsquerdo = Integer.parseInt(partes[0]);
            valorDireito = Integer.parseInt(partes[2]);
        } catch (NumberFormatException e) {
            System.out.println("Valores inválidos! Certifique-se de digitar números inteiros.");
            scanner.close();
            return;
        }
        String operador = partes[1];

        int resultado = 0;
        boolean valido = true;
        switch (operador) {
            case "+":
                resultado = valorEsquerdo + valorDireito;
                break;
            case "-":
                resultado = valorEsquerdo - valorDireito;
                break;
            case "*":
                resultado = valorEsquerdo * valorDireito;
                break;
            case "/":
                if (valorDireito == 0) {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                    valido = false;
                } else {
                    resultado = valorEsquerdo / valorDireito;
                }
                break;
            case "%":
                if (valorDireito == 0) {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                    valido = false;
                } else {
                    resultado = valorEsquerdo % valorDireito;
                }
                break;
            default:
                System.out.println("Operador inválido! Use +, -, *, / ou %.");
                valido = false;
        }

        if (valido) {
            System.out.println("Resultado: " + resultado);
        }

        scanner.close();
    }
}
