package basic;

<<<<<<< HEAD
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class Main {


    public static volatile int number = 17;

    public static void main(String[] args) throws InterruptedException {
//        Thread thread = new Thread() {
=======
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

//    Thread thread = new Thread() {
>>>>>>> 636b87fdf002691070861aee1e0806a88d303287
//
//            @Override
//            public void run() {
//                System.out.println(Thread.currentThread().getName());
//
<<<<<<< HEAD
//                for(int i = 0; i < 10; i++) {
//                    System.out.println(Thread.currentThread().getName() + " & " + i);
=======
//                for (int i = 0; i < 10; i++) {
//                    System.out.println(Thread.currentThread().getName() + " $ " + i);
>>>>>>> 636b87fdf002691070861aee1e0806a88d303287
//                }
//            }
//        };
//
//        thread.start();
//
<<<<<<< HEAD
//
//        for(int i = 0; i < 10; i++) {
//            System.out.println(Thread.currentThread().getName() + " " + i);
//        }

=======
//        for (int i = 0; i < 10; i++) {
//            System.out.println(Thread.currentThread().getName());
//        }


        //basic.CounterThread
>>>>>>> 636b87fdf002691070861aee1e0806a88d303287
//        basic.CounterThread thread1 = new basic.CounterThread(1, 1, 17);
//        basic.CounterThread thread2 = new basic.CounterThread(0, 5, 26);
//
//        thread1.setName("New counter thread");
//
//        thread1.start();
//        thread2.start();


<<<<<<< HEAD
//        ExecutorService executorService = Executors.newFixedThreadPool(3);
//
//
//        CounterPrinter printer = new CounterPrinter();
//
//        executorService.execute(new basic.CounterRunnable(1, 2, 13, printer));
//        executorService.execute(new basic.CounterRunnable(17, 10, 99, printer));
//        executorService.execute(new basic.CounterRunnable(4, 3, 36, printer));
//        executorService.execute(() -> System.out.println("Hello world"));
//


=======
        //basic.CounterRunnable


        ExecutorService executorService = Executors.newFixedThreadPool(3);


        CounterPrinter counterPrinter = new CounterPrinter();

        executorService.execute(new CounterRunnable(1, 2, 13));
        executorService.execute(new CounterRunnable(17, 10, 99));
        executorService.execute(new basic.CounterRunnable(4, 3, 36));
//        executorService.execute( () -> System.out.println("Hello world"));
//

>>>>>>> 636b87fdf002691070861aee1e0806a88d303287
//        executorService.execute(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(Thread.currentThread().getName());
<<<<<<< HEAD
//
//                Thread thread = new Thread(new CounterRunnable(1, 1, 1000));
=======
//                Thread thread = new Thread(new basic.CounterRunnable(1, 1, 1000));
>>>>>>> 636b87fdf002691070861aee1e0806a88d303287
//                thread.start();
//
//                try {
//                    thread.join();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//
//                System.out.println(Thread.currentThread().getName() + " finished");
//            }
//        });
<<<<<<< HEAD
//
//        System.out.println(Thread.currentThread().getName() + " finished");


//        executorService.shutdown();

//        new MyIncThread().start();
//        new MyIncThread().start();
//        new MyIncThread().start();
//        new MyIncThread().start();
//        new MyIncThread().start();
//
//
//        /* Atomic */
//        Client c1 = new Client(1);
//        Client c2 = new Client(2);
//        Client c3 = new Client(3);
//        Client c4 = new Client(4);
//
//        ExecutorService executorService = Executors.newCachedThreadPool();
//
//        Semaphore semaphore = new Semaphore(2);
//
//        long sleepTime = 500;
//
//        executorService.execute(() -> {
//            try {
//                semaphore.acquire();
//
//                c1.increaseBalance(50);
//                Thread.sleep(sleepTime);
//
//                semaphore.release();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//
//        executorService.execute(() -> {
//            try {
//                semaphore.acquire();
//                c2.increaseBalance(25);
//                Thread.sleep(sleepTime);
//
//                semaphore.release();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//
//        executorService.execute(() -> {
//            try {
//                semaphore.acquire();
//                c3.reduceBalance(25);
//                Thread.sleep(sleepTime);
//
//                semaphore.release();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }); //75
//
//        executorService.execute(() -> {
//            try {
//                semaphore.acquire();
//                c1.increaseBalance(25);
//                Thread.sleep(sleepTime);
//
//                semaphore.release();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//        executorService.execute(() -> {
//            try {
//                semaphore.acquire();
//                c1.reduceBalance(100);
//                Thread.sleep(sleepTime);
//
//                semaphore.release();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }); //75
//
//        executorService.execute(() -> {
//            try {
//                semaphore.acquire();
//                c2.increaseBalance(50);
//                Thread.sleep(sleepTime);
//
//                semaphore.release();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//        executorService.execute(() -> {
//            try {
//                semaphore.acquire();
//                c2.increaseBalance(100);
//                Thread.sleep(sleepTime);
//
//                semaphore.release();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//        executorService.execute(() -> {
//            try {
//                semaphore.acquire();
//                c2.reduceBalance(75);
//                Thread.sleep(sleepTime);
//
//                semaphore.release();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }); //200
//
//
//        executorService.execute(() -> {
//            try {
//                semaphore.acquire();
//                c4.increaseBalance(75);
//                Thread.sleep(sleepTime);
//
//                semaphore.release();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//        executorService.execute(() -> {
//            try {
//                semaphore.acquire();
//                c4.increaseBalance(75);
//                Thread.sleep(sleepTime);
//
//                semaphore.release();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//        executorService.execute(() -> {
//            try {
//                semaphore.acquire();
//                c4.reduceBalance(200);
//                Thread.sleep(sleepTime);
//
//                semaphore.release();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }); //50
//
//        Thread.sleep(3000);
//
//        System.out.println("Client 1: " + c1.getBalance());
//        System.out.println("Client 2: " + c2.getBalance());
//        System.out.println("Client 3: " + c3.getBalance());
//        System.out.println("Client 4: " + c4.getBalance());
//
//        executorService.shutdown();

        CountDownLatch latch = new CountDownLatch(5);

        new CountDownThread(latch, "Bob").start();
        Thread.sleep(500);
        new CountDownThread(latch, "Gil").start();
        Thread.sleep(500);
        new CountDownThread(latch, "Tom").start();
        Thread.sleep(500);
        new CountDownThread(latch, "Barbara").start();
        Thread.sleep(500);
        new CountDownThread(latch, "Anton").start();
    }

    public static void sendEmail(String sender) {
        System.out.println("Email sent from: " + sender);
    }

    static class CountDownThread extends Thread {

        private final CountDownLatch latch;

        private final String sender;

        CountDownThread(CountDownLatch latch, String sender) {
            this.latch = latch;
            this.sender = sender;

            latch.countDown();
        }

        @Override
        public void run() {
            System.out.println("Waiting for last sender");
            try {
                latch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Begin email processing for: " + sender);
            sendEmail(sender);
        }
    }

    public static synchronized void inc() {
        for (int i = 0; i < 1000; i++) {
            Main.number += 1;
        }
        System.out.println(Main.number + " " + Thread.currentThread().getName());
=======

        System.out.println(Thread.currentThread().getName() + " finished");



        executorService.shutdown();



>>>>>>> 636b87fdf002691070861aee1e0806a88d303287
    }

}
