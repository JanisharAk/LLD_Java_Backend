package interfaces;

public class Main {
    public static void main(String[] args) {
        PlayAnimal playAnimal = new PlayAnimal();
        playAnimal.doAnimalThings();

        Lion l = new Lion();
        //lion reference variable and lion object
        Animal lionAnimal = new Lion();
        //lion's parent as reference variable and lion object -> upcasting
    }
}
