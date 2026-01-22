package ListaDeExercicios.ExerciciosLista03.ClasseProduto;
public class Main {
    public static void main(String[] args) {
        testBuy();
        testRestock();
    }

    public static void testBuy() {
        Product product = new Product("Computador", 2000, 200);

        System.out.println("Produto: " + product.getName());
        System.out.println("Preço: R$" + product.getPrice());
        System.out.println("Quantidade em estoque: " + product.getStockQuantity());
        System.out.println("Valor total em estoque: R$" + product.getTotalValue());

        product.buy(10);
        System.out.println("\nTeste Buy\nApós comprar 10 unidades:");
        System.out.println("Quantidade em estoque: " + product.getStockQuantity());
        System.out.println("Valor total em estoque: R$" + product.getTotalValue());
    }

    public static void testRestock() {
        Product product = new Product("Computador", 2000, 200);

        product.restock(10);
        System.out.println("\nTeste Restock\nApós repor 10 unidades");
        System.out.println("Quantidade em estoque: " + product.getStockQuantity());
        System.out.println("Valor total em estoque: " + product.getTotalValue());
    }
}