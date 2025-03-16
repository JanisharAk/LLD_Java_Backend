package IntroToLLD.multithreading.threadCreationType.part06;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinExample {
    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        MyRecursiveTask task = new MyRecursiveTask(8);
        int result = pool.invoke(task);

        System.out.println("Final Result: " + result);
    }
}
