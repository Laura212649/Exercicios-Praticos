package ExerciciosLista1;

import java.util.Scanner;

public class exerciciopratico9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua senha: ");
        String senha = scanner.nextLine();

        boolean tamanhoMinimo = senha.length() >= 8;
        boolean temMaiuscula = senha.matches(".*[A-Z].*");
        boolean temMinuscula = senha.matches(".*[a-z].*");
        boolean temDigito    = senha.matches(".*\\d.*");
        boolean temEspecial  = senha.matches(".*[!@#$%].*");

        int criterios = 0;
        if (tamanhoMinimo) criterios++;
        if (temMaiuscula) criterios++;
        if (temMinuscula) criterios++;
        if (temDigito) criterios++;
        if (temEspecial) criterios++;

        String classificacao;
        if (criterios >= 4) {
            classificacao = "Forte";
        } else if (criterios >= 2) {
            classificacao = "Média";
        } else {
            classificacao = "Fraca";
        }

        System.out.println("Senha: " + senha);
        System.out.println("Classificação: " + classificacao);

        scanner.close();
    }
}