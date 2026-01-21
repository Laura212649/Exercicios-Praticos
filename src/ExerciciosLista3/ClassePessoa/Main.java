package ClassePessoa;
import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        test1();
        test2();
    }

    public static void test1() throws Exception {
        Person p = new Person(
                "001",
                "Ana",
                "ana@email.com",
                "12345678901",
                LocalDate.of(1995, 6, 10),
                60000,
                170);
        System.out.println("Teste1\nID: " + p.getId());
        System.out.println("Nome: " + p.getName());
        System.out.println("Email: " + p.getEmail());
        System.out.println("CPF:" + p.getCpf());
        System.out.println("Idade: " + p.calculateAge(LocalDate.now()));
        System.out.println("IMC: " + p.calculateIMC());
    }

    public static void test2() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Teste2\nDigite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite seu email: ");
        String email = sc.nextLine();

        System.out.print("Digite seu CPF (11 dígitos): ");
        String cpf = sc.nextLine();

        System.out.print("Ano de nascimento: ");
        int ano = sc.nextInt();
        System.out.print("Mês de nascimento: ");
        int mes = sc.nextInt();
        System.out.print("Dia de nascimento: ");
        int dia = sc.nextInt();

        System.out.print("Peso em gramas: ");
        int peso = sc.nextInt();

        System.out.print("Altura em centímetros: ");
        int altura = sc.nextInt();

        System.out.println("Pessoa criada com sucesso!");
    }
}