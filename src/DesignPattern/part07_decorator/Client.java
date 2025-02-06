package DesignPattern.part07_decorator;

/**
 * Client class demonstrating the use of the Decorator Design Pattern.
 * It creates an IceCream with an OrangeCone, adds ChocolateSyrup, and a VanillaScoop.
 */
public class Client {
    public static void main(String[] args) {
        // Creating a decorated ice cream: Orange Cone with Chocolate Syrup and Vanilla Scoop
        IceCream iceCream = new VanillaScoop(new ChocolateSyrup(new OrangeCone()));

        // Printing the total cost
        System.out.println("Total Cost: " + iceCream.getCost());

        // Printing the full description of the ice cream
        System.out.println("Ice Cream Description: " + iceCream.getDescription());
    }
}
