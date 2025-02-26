package IntroToLLD.inheritanceAndPolymorphism.overloadAndOverride;

public class Client {
    public static void main(String[] args) {
        System.out.println("Calculation with calculator");
        System.out.println(4);
        Calculator c = new Calculator();
        c.add(1,2);
        c.add(1.1,1.2);
        c.add(1.1,2);
        c.add(2,3.2);

        Car car = new Car();
        car.startCar();
        System.out.println(car.engine);
        Nano n = new Nano();
        System.out.println(n.engine);
        n.startCar();

        Car car1 = new Nano(); //upcasting method
        car1.startCar();
        System.out.println(car1.engine);
    }
}
