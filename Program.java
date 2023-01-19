public class Program {
    public static void showAll(Products[] all){
        int counter = 1;
        for(Products item : all){
            System.out.printf("%d. ", counter);
            System.out.println(item.toString());
            counter++;
        }
    }
    public static void main(String[] args) {
        Products cheese = new Food("cheese", 500.5, 10, "180 days");
        Products bread1 = new Bread("bread", 53.90, 50, "10 dayes", "A");
        Products egg1 = new Eggs("eggs", 89.9, 25, "60 days", 10);
        Products milk1 = new Milk("milk", 81.5, 24, 0.9, "10 days", 3.2);
        Products lemonade1 = new Lemonade("Everest", 89.99, 5, 1.5);
        Products masks1 = new Masks("Individual masks", 69.9, 23, 10);
        Products toiletPaper1 = new ToiletPaper("Puppe", 120.5, 45, 8, 3);
        Products nipple1 = new Nipple("Baby Boom", 399.5, 5, 0, true);
        Products diapers1 = new Diapers("Pampers", 899.9, 3, 1, true, 3, 4, 6, "A");
        //System.out.println(bread1.toString());

        Products[] allProducts = new Products[] {cheese, bread1, egg1, milk1, lemonade1, masks1, toiletPaper1, nipple1, diapers1};
        showAll(allProducts);

    }
}
