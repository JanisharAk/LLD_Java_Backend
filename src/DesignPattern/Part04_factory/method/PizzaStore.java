package DesignPattern.Part04_factory.method;


import DesignPattern.Part04_factory.simple.Pizza;

public abstract class PizzaStore {
    Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
    // Factory Method -- resposible for creating pizza
    protected abstract Pizza createPizza(String type);
}