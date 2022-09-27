package ClassesWithAttributes;

public class Main {
    public static void main(String[] args) {
        Product product = new Product(1,"Laptop", "Monster Laptop", 7000,10,"bilmemne.jpg");
        //product.setName("Laptop");
        //product.setId(1);
        //product.setDescription("Monster Laptop");
        //product.setPrice(7000);
        //product.setStockAmount(3);
        //product.setImage("bilmemne.jpg");

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        System.out.println(product.getCode());
    }
}
