package IntroToLLD.multithreading.threadCreationType.part03;

import java.util.concurrent.Callable;

class MyCallable implements Callable<String> {
    public String call() {
        return "Task executed by " + Thread.currentThread().getName();
    }
}
