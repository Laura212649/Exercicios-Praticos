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

    @Override
    public void receberDano(int pontos) {
        int danoFinal;
        if (pontos <= 5) {
            danoFinal = 1;
        } else {
            danoFinal = pontos - 5;
        }
        super.receberDano(pontos);
    }

    @Override
    public void usarHabilidade() {
        System.out.println("O guerreiro está usando Golpe de Espada");
        super.usarHabilidade();
    }
}

