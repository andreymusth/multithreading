package example;

public class CreatingAndStartingThreads {


    public static class MyThread extends Thread {

        @Override
        public void run() {
            System.out.println("My thread");
        }
    }

    public static class MyRunnable implements Runnable {

        @Override
        public void run() {
            System.out.println("My runnable");
        }
    }


    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            new Thread("" + i) {
                public void run() {
                    System.out.println("Thread: " + getName() + " running");
                }
            }.start();
        }

    }
}
