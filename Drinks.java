public class Drinks extends Products{
    private Double volume;

    public Drinks(String name, Double price, int quantity, Double volume){
        super(name, price, quantity);
        this.volume = volume;
    }
    @Override
    public String toString() {
        return String.format("Name: %s, price: %.2f, quantity: %d, volume %.1f liter", this.getName(), this.getPrice(), this.getQuantity(), this.volume);
    }
    public Double getVolume(){
        return this.volume;
    }

}
