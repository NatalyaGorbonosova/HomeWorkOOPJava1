public class Eggs extends Food{
    private int numberOfPieces;

    public Eggs(String name, Double price, int quantity, String expirationDate, int numberOfPieces){
        super(name, price, quantity, expirationDate);
        this.numberOfPieces = numberOfPieces;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, price: %.2f, quantity: %d, expiration date: %s, eggs: %d: ", this.getName(), this.getPrice(), this.getQuantity(), this.getExpirationDate(), this.numberOfPieces);
    }
    public Integer getNumberOfPieces(){
        return this.numberOfPieces;
    }
}

