package ListaDeExercicios.ExerciciosLista01;

import java.util.Scanner;

public class exerciciopratico10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String USUARIO_DE_ACESSO = "ana";
        final String SENHA_DE_ACESSO = "Computador2@";

        System.out.print("Digite o usuário: ");
        String usuarioDigitado = scanner.nextLine();

        System.out.print("Digite a senha: ");
        String senhaDigitada = scanner.nextLine();

        if (usuarioDigitado.equals(USUARIO_DE_ACESSO) && senhaDigitada.equals(SENHA_DE_ACESSO)) {
            System.out.println("Login bem-sucedido");
        } else {
            System.out.println("Credenciais inválidas");
        }

        scanner.close();
    }
}
