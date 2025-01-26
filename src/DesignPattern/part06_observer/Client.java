package DesignPattern.part06_observer;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        WeatherData weatherData = new WeatherData();

        // Correctly instantiating observers
        Observer display1 = new Display1();
        Observer display2 = new Display2();

        // Adding observers to the subject
        weatherData.addObserver(display1);
        weatherData.addObserver(display2);

        // Simulating changes in weather data
        weatherData.measurementsChanged();
        Thread.sleep(1000); // Wait for 1 second
        weatherData.measurementsChanged();
        Thread.sleep(1000); // Wait for 1 second
        weatherData.measurementsChanged();
    }
}
