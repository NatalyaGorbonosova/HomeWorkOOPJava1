
public class Food extends Products{
    private String expirationDate;

    public Food(String name, Double price, int quantity, String expirationDate){
        super(name, price, quantity);
        this.expirationDate = expirationDate;
    }
    @Override
    public String toString() {
        return String.format("Name: %s, price: %.2f, quantity: %d, expiration date: %s", this.getName(), this.getPrice(), this.getQuantity(), this.expirationDate);
    }
    public String getExpirationDate(){
        return this.expirationDate;
    }

}
