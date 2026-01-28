package ListaDeExercicios.ExerciciosLista04.FigurasGeometricas;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        testCircle();
        testRectangle();
    }

    public static void testCircle() {
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Circle(3));

        for (Shape shape : shapes) {
            System.out.println("Círculo\nÁrea: " + shape.calculateArea());
            System.out.println("Perímetro: " + shape.calculatePerimeter());
            System.out.println("-------");
        }
    }

    public static void testRectangle() {
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Rectangle(8, 9));

        for (Shape shape : shapes) {
            System.out.println("Retângulo\nÁrea: " + shape.calculateArea());
            System.out.println("Perímetro: " + shape.calculatePerimeter());
        }
    }
}
