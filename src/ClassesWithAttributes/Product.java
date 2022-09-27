package ClassesWithAttributes;

public class Product {
    public Product(int id, String name, String description, double price, int stockAmount, String image){
        this.id=id;
        this.name=name;
        this.description=description;
        this.stockAmount=stockAmount;
        this.image=image;
    }

    //overloading
    public Product(){

    }

    //attributes
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String image;
    private String code;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        code= this.name.substring(0,1)+this.id;
        return code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
