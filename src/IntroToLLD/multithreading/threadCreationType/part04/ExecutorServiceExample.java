package IntroToLLD.multithreading.threadCreationType.part04;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {

    //Using ExecutorService (Thread Pool) for creating multithreading
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            int taskId = i;
            executorService.execute(() -> {
                System.out.println("Executing Task " + taskId + " by " + Thread.currentThread().getName());
            });
        }

        executorService.shutdown();
    }
}
