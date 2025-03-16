package IntroToLLD.multithreading.threadCreationType.part05;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorExample {
    //Using ScheduledExecutorService (Scheduled Tasks)
    //Allows scheduling tasks to run at fixed intervals.
    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(10);
        executorService.scheduleAtFixedRate(() ->
                        System.out.println("Task executed by " + Thread.currentThread().getName()),
                1, 2, TimeUnit.SECONDS);

       // executorService.shutdown(); // Uncomment to stop execution
    }
}
//🔹 Use for periodic task execution (e.g., cron jobs).