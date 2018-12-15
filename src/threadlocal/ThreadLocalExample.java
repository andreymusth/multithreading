package threadlocal;

public class ThreadLocalExample {


    public static class MyRunnable implements Runnable {

        private ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

        @Override
        public void run() {

            threadLocal.set((int) (Math.random() * 100));

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(threadLocal.get());

        }
    }

    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();

        Thread threadA = new Thread(r);
        Thread threadB = new Thread(r);

        threadA.start();
        threadB.start();
    }

}
