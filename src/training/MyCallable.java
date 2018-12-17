package training;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {

    public Callback callback;

    public MyCallable(Callback callback) {
        this.callback = callback;
    }

    @Override
    public String call() throws Exception {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        callback.onSucceed();
        return "first collable";
    }
}
