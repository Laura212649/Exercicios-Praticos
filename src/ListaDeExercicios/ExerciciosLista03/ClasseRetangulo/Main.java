package ListaDeExercicios.ExerciciosLista03.ClasseRetangulo;

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(6, 7, 10, 30);

        System.out.println("Coordenada x: " + rect.getX());
        System.out.println("Coordenada y: " + rect.getY());
        System.out.println("width: " + rect.getWidth());
        System.out.println("height: " + rect.getHeight());

        System.out.println("Área do retângulo é : " + rect.calculateArea());
    }
}

