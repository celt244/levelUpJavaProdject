package basic;

import static basic.Main.print;

/**
 * Created by java on 14.04.2017.
 */
public class CounterPrinter {

<<<<<<< HEAD
    public synchronized void print(String text) {
        for (int i = 0; i < 10; i ++) {
            System.out.println(text + " " + i);
=======
    @Override
    public void run() {
        for (int i = initialValue; i < maxValue; i+=step) {
            print(Thread.currentThread().getName() + " " + i);
>>>>>>> 636b87fdf002691070861aee1e0806a88d303287
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
<<<<<<< HEAD
=======

>>>>>>> 636b87fdf002691070861aee1e0806a88d303287
}
