package IntroToLLD.multithreading.threadCreationType.part02;

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread runnable is running: " + Thread.currentThread().getName());
    }
}