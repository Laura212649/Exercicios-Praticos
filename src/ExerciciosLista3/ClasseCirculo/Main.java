package ClasseCirculo;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3, 4, 25);

        System.out.println("Valor da área esperada: " + (Math.PI * 25));
        System.out.println("Retorno da área calculada: " + circle.calculateArea());
        System.out.println("Ponto (7,0) está contido no círculo? " + circle.contains(7, 0));
    }
}
