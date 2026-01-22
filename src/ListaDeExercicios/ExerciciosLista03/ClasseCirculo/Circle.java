package ListaDeExercicios.ExerciciosLista03.ClasseCirculo;

public class Circle {
    private double x;
    private double y;
    private double radius;

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;

    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public boolean contains(double px, double py) {
        double dx = px - x;
        double dy = py - y;
        double distanceSquared = dx * dx + dy * dy;
        return distanceSquared <= radius * radius;
    }
}
