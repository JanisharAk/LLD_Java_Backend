package IntroToLLD.multithreading.runnableInterface;

public class MainClass {
    public static void main(String[] args)
    {
        int n = 5; // Number of threads
        for (int i = 0; i < n; i++) {
            Thread object = new Thread(new MultithreadingClass());
            object.start();
        }
    }
}
