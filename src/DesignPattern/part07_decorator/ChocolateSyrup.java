package DesignPattern.part07_decorator;

/**
 * Decorator class that adds Chocolate Syrup to an existing IceCream.
 */
public class ChocolateSyrup implements IceCream {
    private int cost = 15;
    private String name = "Chocolate Syrup";
    private IceCream iceCream;

    // Constructor to wrap another IceCream object
    ChocolateSyrup(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        return iceCream.getCost() + cost; // Adding Chocolate Syrup cost
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + ", " + name; // Appending description
    }
}
