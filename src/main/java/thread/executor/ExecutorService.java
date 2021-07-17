package thread.executor;

import java.util.concurrent.Executors;

public class ExecutorService {

    public static void main(String[] args) {

        java.util.concurrent.ExecutorService executorService = Executors.newFixedThreadPool(10);

        Executors.newScheduledThreadPool(4);
    }
}
