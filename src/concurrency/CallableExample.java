package concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutorService;

    /*
    Callable is an interface that is part of the java.util.concurrent package,
    and it provides a way to represent tasks that can be executed concurrently
    and return a result. Unlike Runnable, which doesn't return any result,
    Callable can return a result or throw an exception during execution.
     */



public class CallableExample {
    public static void main(String[] args) {
        // Create a thread pool with 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

            // Define a Callable task
        Callable<Integer> task1 = () -> {
            System.out.println("Task 1 is running.");
            Thread.sleep(1000); // Simulate some work
            return 5; // Return a result
        };

        Callable<Integer> task2 = () -> {
            System.out.println("Task 2 is running.");
            Thread.sleep(1500); // Simulate some work
            return 10; // Return a result
        };

            // Submit tasks and get Future objects
            Future<Integer> future1 = executor.submit(task1);
            Future<Integer> future2 = executor.submit(task2);

            try {
                // Wait for the result from both tasks
                Integer result1 = future1.get(); // Blocking call until result is available
                Integer result2 = future2.get(); // Blocking call until result is available

                System.out.println("Result of Task 1: " + result1);
                System.out.println("Result of Task 2: " + result2);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                // Shutdown the executor
            executor.shutdown();
            }
    }
}
