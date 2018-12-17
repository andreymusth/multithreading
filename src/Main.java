import training.Callback;
import training.MyCallable;

import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {


        Callable<String> callable = new MyCallable(new Callback() {
            @Override
            public void onSucceed() {

            }
        });


        FutureTask task = new FutureTask(callable);
        new Thread(task, "My own thread").start();


        System.out.println("current thread = " + Thread.currentThread().getName());

    }
}
