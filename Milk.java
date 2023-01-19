public class Milk extends Drinks{
    private String expDate;
    private Double fat;

    public Milk(String name, Double price, int quantity, Double volume, String expDate, Double fat){
        super(name, price, quantity, volume);
        this.expDate = expDate;
        this.fat = fat;
    }
    @Override
    public String toString() {
        return String.format("Name: %s, price: %.2f, quantity: %d, volume %.1f, expDate: %s, quantity of fat: %.1f", this.getName(), this.getPrice(), this.getQuantity(), this.getVolume(), this.expDate, this.fat);
    }
    public String getExpDate(){
        return this.expDate;
    }
    public Double getFat(){
        return this.fat;
    }
}
