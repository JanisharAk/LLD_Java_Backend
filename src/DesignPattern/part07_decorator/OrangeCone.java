package DesignPattern.part07_decorator;

/**
 * Concrete class representing the base IceCream component (Orange Cone).
 * It can be used alone or act as a base for decorators.
 */
public class OrangeCone implements IceCream {
    private int cost = 10;
    private String name = "Orange Cone";
    private IceCream iceCream;

    // Default constructor for the base ice cream
    OrangeCone() {
    }

    // Constructor for decorating an existing IceCream
    OrangeCone(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        if (iceCream == null) return cost; // Base case: Orange Cone alone
        return iceCream.getCost() + cost;  // Adding cost of Orange Cone to the decorated object
    }

    @Override
    public String getDescription() {
        if (iceCream == null) return name; // Base case: Orange Cone alone
        return iceCream.getDescription() + ", " + name; // Appending the description
    }
}
