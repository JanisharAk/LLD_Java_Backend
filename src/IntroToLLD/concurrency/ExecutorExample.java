package IntroToLLD.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 Executor framework in Java to manage concurrency.
 The Executor framework helps simplify the management of threads
 by providing higher-level abstractions like ExecutorService to handle
 a pool of worker threads and execute tasks
 */
public class ExecutorExample {
    public static void main(String[] args) {
        // Create a thread pool with 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

            // Define 5 tasks that will be executed concurrently
            for (int i = 1; i <= 5; i++) {
                final int taskId = i;
                executor.submit(() -> {
                    System.out.println("Task " + taskId + " is being executed by " + Thread.currentThread().getName());
                    try {
                        // Simulate some work by sleeping for 2 seconds
                        Thread.sleep(9000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Task " + taskId + " is finished.");
                });
            }

            // Shutdown the executor after all tasks are submitted
            executor.shutdown();

            // Wait for all tasks to finish before exiting the main thread
            while (!executor.isTerminated()) {
                // Do nothing, just wait for the tasks to complete
            }

            System.out.println("All tasks are completed.");
        }

}
