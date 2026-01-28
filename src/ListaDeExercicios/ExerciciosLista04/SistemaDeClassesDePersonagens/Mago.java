package ListaDeExercicios.ExerciciosLista04.SistemaDeClassesDePersonagens;

public class Mago extends Personagem {
    private int mana;
    private int inteligencia;

    public Mago(String nome, int nivel, double vida, int mana) {
        super(nome, nivel, vida);
        this.mana = mana;
        this.inteligencia = nivel * 10;
    }

    @Override
    public void exibirFicha() {
        super.exibirFicha();
        System.out.println("Mana: " + mana);
        System.out.println("Inteligência: " + inteligencia);
    }
}
