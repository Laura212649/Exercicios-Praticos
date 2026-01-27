package ListaDeExercicios.ExerciciosLista03.ClasseProduto;

public class Product {
    private String name;
    private double price;
    private int stockQuantity;

    public Product(String name, double price, int stockQuantity) {
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getStockQuantity() { return stockQuantity; }

    public boolean buy(int quantity) {
        if (quantity > 0 && stockQuantity >= quantity) {
            stockQuantity -= quantity;
            return true;
        }
        return false;
    }

    public boolean restock(int quantity) {
        if (quantity > 0) {
            stockQuantity += quantity;
            return true;
        }
        return false;
    }

    public double getTotalValue() {
        return price * stockQuantity;
    }
}




