public class Bread extends Food{
    private String flour;

    public Bread(String name, Double price, int quantity, String expirationDate, String flour){
        super(name, price, quantity, expirationDate);
        this.flour = flour;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, price: %.2f, quantity: %d, expiration date: %s, flour: %s", this.getName(), this.getPrice(), this.getQuantity(), this.getExpirationDate(), this.flour);
    }
    public String getFlour(){
        return this.flour;
    }
}

