package decoratorPattern;

public class Main {
    public static void main(String[] args) {
        // Order 1: Basic Black Coffee
        Coffee order1 = new BlackCoffee();
        printOrder("Order 1", order1);

        // Order 2: Black Coffee with Milk
        Coffee order2 = new Milk(new BlackCoffee());
        printOrder("Order 2", order2);

        // Order 3: Black Coffee with Milk and Caramel Syrup
        Coffee order3 = new CaramelSyrup(new Milk(new BlackCoffee()));
        printOrder("Order 3", order3);

        // Order 4: Black Coffee with Double Milk and Caramel Syrup
        Coffee order4 = new CaramelSyrup(new Milk(new Milk(new BlackCoffee())));
        printOrder("Order 4", order4);
    }

    private static void printOrder(String label, Coffee coffee) {
        System.out.printf("%s: %s | Cost: ₱ %.2f%n",
                label, coffee.getDescription(), coffee.getCost());
    }
}
