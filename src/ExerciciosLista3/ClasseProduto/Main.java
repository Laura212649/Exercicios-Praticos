package ClasseProduto;
public class Main {
    public static void main(String[] args) {
        Product product = new Product("Computador", 2000, 200);

        System.out.println("Produto: " + product.getName());
        System.out.println("Preço: R$" + product.getPrice());
        System.out.println("Quantidade em estoque: " + product.getStockQuantity());
        System.out.println("Valor total em estoque: R$" + product.getTotalValue());

        product.buy(10);
        System.out.println("\nApós comprar 10 unidades:");
        System.out.println("Quantidade em estoque: " + product.getStockQuantity());
        System.out.println("Valor total em estoque: R$" + product.getTotalValue());
    }
}