package IntroToLLD.multithreading.threadCreationType.part01;

class ThreadExample {
    public static void main(String[] args) {
        ExtendThreadClass t1 = new ExtendThreadClass();
        t1.start(); // Starts the thread
    }
}