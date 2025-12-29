import java.util.Scanner;

public class exerciciopratico6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("19");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
        scanner.close();
    }
}