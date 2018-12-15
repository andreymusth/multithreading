package basic;

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
}
