package IntroToLLD.multithreading.executorService;
import java.util.concurrent.*;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        for (int i = 1; i <= 10; i++) {
            int taskId = i;
            executor.submit(() -> {
                System.out.println("Executing Task " + taskId + " by Thread: " + Thread.currentThread().getName());
                try {
                    Thread.sleep(6000);
                } catch (InterruptedException e) {
                    System.out.println("Task " + taskId + " was interrupted.");
                    Thread.currentThread().interrupt(); // Restore the interrupt flag
                }
            });
        }

        executor.shutdown();
        try {
            if (!executor.awaitTermination(5, TimeUnit.SECONDS)) {
                System.out.println("Forcing shutdown...");
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
        }

        System.out.println("All tasks completed.");
    }
}


/*
Steps:
1. Create a fixed-size thread pool using Executors.newFixedThreadPool().
2. Submit multiple tasks using submit() or execute().
3. Shutdown the executor after task completion


Explanation:
1. Executors.newFixedThreadPool(5): Creates a thread pool with 5 threads.
2. submit(): Submits tasks that will run in parallel.
3. shutdown(): Initiates an orderly shutdown.
4. awaitTermination(5, TimeUnit.SECONDS): Waits for 5 seconds before forcefully shutting down.

Output (Example):Executing Task 1 by Thread: pool-1-thread-1
Executing Task 2 by Thread: pool-1-thread-2
Executing Task 3 by Thread: pool-1-thread-3
Executing Task 4 by Thread: pool-1-thread-4
Executing Task 5 by Thread: pool-1-thread-5
Executing Task 6 by Thread: pool-1-thread-1
Executing Task 7 by Thread: pool-1-thread-2
Executing Task 8 by Thread: pool-1-thread-3
Executing Task 9 by Thread: pool-1-thread-4
Executing Task 10 by Thread: pool-1-thread-5
All tasks completed.


If shutdownNow() is called before tasks finish:

Task 6 was interrupted.
Task 7 was interrupted.
Task 8 was interrupted.
Task 9 was interrupted.
Task 10 was interrupted.
Forcing shutdown...
All tasks completed.
 */