package ListaDeExercicios.ExerciciosLista04.SistemaDeClassesDePersonagens;

public class Personagem {
    private String nome;
    private int nivel;
    private double vida;

    public Personagem(String nome, int nivel, double vida) {
        this.nome = nome;
        this.nivel = nivel;
        this.vida = vida;
    }

    public void exibirFicha() {
        System.out.println("Dados Básicos");
        System.out.println("Nome: " + nome);
        System.out.println("Nível: " + nivel);
        System.out.println("Vida: " + vida);
    }

}
