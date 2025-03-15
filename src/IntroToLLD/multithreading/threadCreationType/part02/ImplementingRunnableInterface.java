package IntroToLLD.multithreading.threadCreationType.part02;

public class ImplementingRunnableInterface {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        t1.start();
    }
}

