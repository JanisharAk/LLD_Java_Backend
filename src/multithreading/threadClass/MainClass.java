package multithreading.threadClass;

// Main Class
public class MainClass {
    public static void main(String[] args)
    {
        int n = 5; // Number of threads
        for (int i = 0; i < n; i++) {
            // Create an instance of MultithreadingClass
            MultithreadingClass object = new MultithreadingClass();
            // Start the thread
            object.start();
        }
    }
}