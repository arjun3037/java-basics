package synchronizer;

import java.util.concurrent.CountDownLatch;

// CountDownLatch is used to syncronization of tasks. Suppose i wants to process some task untill by all dependent task finished so i can use
// countDownLath in this case. for every task
public class CountDownLatchDemo {

    public static void main(String[] args) throws InterruptedException {

        CountDownLatch countDownLatch = new CountDownLatch(3);
        new Thread(new Task(countDownLatch),"ThreadName-1").start();
        new Thread(new Task(countDownLatch),"ThreadName-2").start();
        new Thread(new Task(countDownLatch),"ThreadName-3").start();
        countDownLatch.await();
        System.out.println("Service is already running");

    }




}


class Task implements  Runnable{

    private CountDownLatch latch;

    public Task(CountDownLatch latch){
        this.latch = latch;
    }

    @Override
    public void run() {
        //System.out.println("Service is up " + Thread.currentThread().getName());
        try {
            Thread.sleep(10000l);
            System.out.println("Service is up " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        latch.countDown();


    }
}
