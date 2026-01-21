package ExerciciosLista1;

import java.util.Scanner;

public class exerciciopratico5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sapato");
        String nomeDoProduto = scanner.nextLine();

        System.out.println("5");
        int quantidade = scanner.nextInt();

        System.out.println("30,00");
        double precoUnitario = scanner.nextDouble();

        double valorTotal = quantidade * precoUnitario;
        System.out.printf("O valor total para %s é R$ %.2f%n", nomeDoProduto, valorTotal);

        scanner.close();
    }
}
