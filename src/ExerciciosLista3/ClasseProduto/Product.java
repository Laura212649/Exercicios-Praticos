package ClasseProduto;

public class Product {
    public String name;
    public double price;
    public int stockQuantity;

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




