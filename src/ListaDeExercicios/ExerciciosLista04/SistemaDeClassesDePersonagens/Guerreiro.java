package ListaDeExercicios.ExerciciosLista04.SistemaDeClassesDePersonagens;

public class Guerreiro extends Personagem {
    private int forcaFisica;

    public Guerreiro (String nome, int nivel, double vida, int forcaFisica) {
        super(nome, nivel, vida + 50);
        this.forcaFisica = forcaFisica;
    }

    @Override
    public void exibirFicha() {
        super.exibirFicha();
        System.out.println("Força física: " + forcaFisica);
    }
}
