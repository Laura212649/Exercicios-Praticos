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

    @Override
    public void receberDano(int pontos) {
        if (this.mana > 10) {
            int danoReduzido = pontos / 2;
            mana -= 5;
            super.receberDano(pontos);
        } else {
            super.receberDano(pontos);
        }
    }
}
