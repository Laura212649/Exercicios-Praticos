package ListaDeExercicios.ExerciciosLista04.SistemaDeClassesDePersonagens;

public class Main {
    public static void main(String[] args) {
        GuerreiroAragorn();
        MagoGandolf();
    }

    public static void GuerreiroAragorn() {
        System.out.println("Guerreiro Aragorn");
        Guerreiro Aragorn = new Guerreiro("Aragorn", 10, 100, 85);
        Aragorn.exibirFicha();
        System.out.println("-----");
    }

    public static void MagoGandolf() {
        System.out.println("Mago Gandolf");
        Mago Gandolf = new Mago("Gandolf", 20, 80, 150);
        Gandolf.exibirFicha();
    }
}
