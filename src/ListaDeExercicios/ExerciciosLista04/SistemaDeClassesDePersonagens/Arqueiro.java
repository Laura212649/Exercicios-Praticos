package ListaDeExercicios.ExerciciosLista04.SistemaDeClassesDePersonagens;

public class Arqueiro extends Personagem {
    public Arqueiro(String nome, int nivel, double vida) {
        super(nome, nivel, vida);
    }

    @Override
    public void usarHabilidade() {
        System.out.println("O arqueiro está disparando flechas de gelo");
        super.usarHabilidade();
    }
}
