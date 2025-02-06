package DesignPattern.part07_decorator;

/**
 * Decorator class that adds a Vanilla Scoop to an existing IceCream.
 */
public class VanillaScoop implements IceCream {
    private int cost = 25;
    private String name = "Vanilla Scoop";
    private IceCream iceCream;

    // Constructor to wrap another IceCream object
    VanillaScoop(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        return iceCream.getCost() + cost; // Adding Vanilla Scoop cost
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + ", " + name; // Appending description
    }
}
