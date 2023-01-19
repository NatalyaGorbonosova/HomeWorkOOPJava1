public class BabyProducts extends Products{
    private int minAge;
    private boolean hypoallergenic;
    public BabyProducts(String name, Double price, int quantity, int minAge, boolean hypoallergenic){
        super(name, price, quantity);
        this.minAge = minAge;
        this.hypoallergenic = hypoallergenic;
    }
    @Override
    public String toString() {
        return String.format("Name: %s, price: %.2f, quantity: %d, min age: %d", this.getName(), this.getPrice(), this.getQuantity(), this.minAge);
    }
    public Integer getMinAge(){
        return this.minAge;
    }
    public Boolean getHypoallergenic(){
        return this.hypoallergenic;
    }
}
