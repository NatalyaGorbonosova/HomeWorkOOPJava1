public class Diapers extends BabyProducts{
    private int size;
    private int minWeight;
    private int maxWeight;

    public Diapers(String name, Double price, int quantity, int minAge, boolean hypoallergenic, int size, int minWeight, int maxWeight){
        super(name, price, quantity, minAge, hypoallergenic);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }
    @Override
    public String toString() {
        return String.format("Name: %s, price: %.2f, quantity: %d, min age: %d, size: %d, weight: %d - %d", this.getName(), this.getPrice(), this.getQuantity(), this.getMinAge(), this.size, this.minWeight, this.maxWeight);
    }
    public Integer getSize(){
        return this.size;
    }
    public Integer getMinWeight(){
        return this.minWeight;
    }
    public Integer getMaxWeight(){
        return this.maxWeight;
    }
}
