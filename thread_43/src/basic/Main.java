//package basic;
//
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//
//public class Main {
//
//    public static void main(String[] args) {
//
////    Thread thread = new Thread() {
////
////            @Override
////            public void run() {
////                System.out.println(Thread.currentThread().getName());
////
////                for (int i = 0; i < 10; i++) {
////                    System.out.println(Thread.currentThread().getName() + " $ " + i);
////                }
////            }
////        };
////
////        thread.start();
////
////        for (int i = 0; i < 10; i++) {
////            System.out.println(Thread.currentThread().getName());
////        }
//
//
//        //basic.CounterThread
////        basic.CounterThread thread1 = new basic.CounterThread(1, 1, 17);
////        basic.CounterThread thread2 = new basic.CounterThread(0, 5, 26);
////
////        thread1.setName("New counter thread");
////
////        thread1.start();
////        thread2.start();
//
//
//        //basic.CounterRunnable
//
//
//        ExecutorService executorService = Executors.newFixedThreadPool(3);
//
//
//        CounterPrinter counterPrinter = new CounterPrinter();
//
//        executorService.execute(new CounterRunnable(1, 2, 13));
//        executorService.execute(new CounterRunnable(17, 10, 99));
//        executorService.execute(new basic.CounterRunnable(4, 3, 36));
////        executorService.execute( () -> System.out.println("Hello world"));
////
//
////        executorService.execute(new Runnable() {
////            @Override
////            public void run() {
////                System.out.println(Thread.currentThread().getName());
////                Thread thread = new Thread(new basic.CounterRunnable(1, 1, 1000));
////                thread.start();
////
////                try {
////                    thread.join();
////                } catch (InterruptedException e) {
////                    e.printStackTrace();
////                }
////
////                System.out.println(Thread.currentThread().getName() + " finished");
////            }
////        });
//
//        System.out.println(Thread.currentThread().getName() + " finished");
//
//
//
//        executorService.shutdown();
//
//
//
//    }
//
//}
