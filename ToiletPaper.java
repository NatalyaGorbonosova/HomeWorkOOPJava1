public class ToiletPaper extends HygienaItems{
    private int numberOfLayers;
    public ToiletPaper(String name, Double price, int quantity, int numberOfPieces, int numberOfLayers){
        super(name, price, quantity, numberOfPieces);
        this.numberOfLayers = numberOfLayers;
    }
    @Override
    public String toString() {
        return String.format("Name: %s, price: %.2f, quantity: %d, number of pieces: %d, number of layers: %d", this.getName(), this.getPrice(), this.getQuantity(), this.getNumberOfPieces(), this.numberOfLayers);
    }
    public Integer getNumberOfLayers(){
        return numberOfLayers;
    }
}
