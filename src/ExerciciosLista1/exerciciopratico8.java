package ExerciciosLista1;

import java.util.Scanner;

public class exerciciopratico8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota da P1: ");
        double p1 = scanner.nextDouble();

        System.out.print("Digite a nota da P2: ");
        double p2 = scanner.nextDouble();

        System.out.print("Digite a nota da P3: ");
        double p3 = scanner.nextDouble();


        double media = (p1 + p2 + p3) / 3;

        if (media >= 7.0) {
            System.out.println("Aprovado");
        } else if (media >= 5.0) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        scanner.close();
    }
}
