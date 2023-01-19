public class Products {
    private String name;
    private Double price;
    private int quantity;

    protected Products(String name, Double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, price: %.2f, quantity: %d", this.name, this.price, this.quantity);
    }

    public String getName(){
        return this.name;
    }
    public Double getPrice(){
        return this.price;
    }
    public Integer getQuantity(){
        return this.quantity;
    }
}