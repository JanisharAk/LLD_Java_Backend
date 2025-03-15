package IntroToLLD.multithreading.threadCreationType.part01;

public class ExtendThreadClass extends Thread {
    public void run() {
        System.out.println("Thread running: " + Thread.currentThread().getName());
    }
}

