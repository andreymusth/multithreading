import training.Callback;
import training.MyCallable;

import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {


        String result;

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future future = executor.submit(new MyCallable(new Callback() {
            @Override
            public void onSucceed(String str) {
                System.out.println("CALLBACK");
                System.out.println(Thread.currentThread().getName());
                System.out.println(str);
            }
        }));

        executor.shutdown();

        System.out.println(Thread.currentThread().getName());
    }
}
