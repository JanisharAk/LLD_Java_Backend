package interfaces;

import inheritanceAndPolymorphism.Cat;
import inheritanceAndPolymorphism.Dog;

public class PlayAnimal {//phonepay
    private Animal animal; // IBankAPI

    public PlayAnimal() {
        animal = new Deer(); // ibankAPI = new ICICIBankAPI();
    }

    public void doAnimalThings(){
        animal.walk(); // bankAPI.checkBalance();
        animal.drink(); // bankAPI.register();....
        animal.eat();

    }
}
