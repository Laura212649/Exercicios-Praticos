package ListaDeExercicios.ExerciciosLista01;

import java.util.Scanner;

public class exerciciopratico7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero > 0 && numero % 2 == 0) {

            System.out.println("Positivo e Par");
        } else if (numero > 0 && numero % 2 != 0) {

            System.out.println("Positivo e Ímpar");
        } else if (numero == 0) {

            System.out.println("Zero");
        } else {

            System.out.println("Negativo");
        }

        scanner.close();
    }
}