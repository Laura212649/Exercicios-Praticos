package ListaDeExercicios.ExerciciosLista04.SistemaDeClassesDePersonagens;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        testeGuerreiroAragorn();
        testeMagoGandolf();
        testeDeEstresse();
        testeTorneioDeHabilidade();
    }

    public static void testeGuerreiroAragorn() {
        System.out.println("== Teste Guerreiro Aragorn ==");
        Guerreiro guerreiro = new Guerreiro("Aragorn", 10, 100, 85);
        guerreiro.exibirFicha();
    }

    public static void testeMagoGandolf() {
        System.out.println("\n== Teste Mago Gandolf ==");
        Mago mago = new Mago("Gandolf", 20, 80, 150);
        mago.exibirFicha();
    }

    public static void testeDeEstresse() {
        Guerreiro guerreiro = new Guerreiro("Aragorn", 10, 150, 85);
        Mago mago = new Mago("Gandolf", 20, 80, 150);

        guerreiro.receberDano(20);
        mago.receberDano(20);

        System.out.println("\n== Teste de Estresse ==\n\nAntes do ataque da criatura poderosa\n");
        guerreiro.exibirFicha();
        mago.exibirFicha();

        guerreiro.receberDano(20);
        mago.receberDano(20);

        System.out.println("\nDepois do ataque da criatura poderosa\n");
        guerreiro.exibirFicha();
        mago.exibirFicha();
    }

    public static void testeTorneioDeHabilidade() {
        ArrayList<Personagem> grupoDeAventura = new ArrayList<>();

        grupoDeAventura.add(new Guerreiro("Aragorn", 10, 100, 80));
        grupoDeAventura.add(new Mago("Gandalf", 20, 80, 150));
        grupoDeAventura.add(new Arqueiro("Legolas", 30, 70));
        System.out.println("\n== Teste De Habilidade ==");
        for (Personagem personagem : grupoDeAventura) {
            personagem.usarHabilidade();
        }
    }
}
