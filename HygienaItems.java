public class HygienaItems extends Products{
    private int numberOfPieces;

    public HygienaItems(String name, Double price, int quantity, int numberOfPieces){
        super(name, price, quantity);
        this.numberOfPieces = numberOfPieces;
    }
    @Override
    public String toString() {
        return String.format("Name: %s, price: %.2f, quantity: %d, number of pieces: %d", this.getName(), this.getPrice(), this.getQuantity(), this.numberOfPieces);
    }
    public Integer getNumberOfPieces(){
        return this.numberOfPieces;
    }
}
