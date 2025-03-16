package IntroToLLD.multithreading.threadCreationType.part06;

import java.util.concurrent.RecursiveTask;

public class MyRecursiveTask extends RecursiveTask<Integer> {
    private int work;

    MyRecursiveTask(int work) {
        this.work = work;
    }

    protected Integer compute() {
        if (work > 2) {
            MyRecursiveTask subTask1 = new MyRecursiveTask(work / 2);
            MyRecursiveTask subTask2 = new MyRecursiveTask(work / 2);

            subTask1.fork();
            subTask2.fork();

            return subTask1.join() + subTask2.join();
        } else {
            return work;
        }
    }
}
