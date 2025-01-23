package DesignPattern.Part04_factory.simple;

public class Main {
    public static void main(String[] args) {

//    SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
//    PizzaStore pizzaStore = new PizzaStore(simplePizzaFactory);
        PizzaStore pizzaStore = new PizzaStore();
        pizzaStore.orderPizza("Veggie");
    }
}
