package email;

import java.util.Date;
<<<<<<< HEAD
=======
import java.util.List;
>>>>>>> 636b87fdf002691070861aee1e0806a88d303287
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by java on 21.04.2017.
 */
public class EmailConsumer extends Thread {

    private final ArrayBlockingQueue<EmailMessage> queue;

    public EmailConsumer(ArrayBlockingQueue<EmailMessage> queue) {
        this.queue = queue;
    }

<<<<<<< HEAD
    @Override
    public void run() {
        EmailMessage message = null;
        while (true) {
=======

    @Override
    public void run() {
        EmailMessage message = null;
        while(true) {
>>>>>>> 636b87fdf002691070861aee1e0806a88d303287
            while ((message = queue.poll()) != null) {
                System.out.println(new Date() + ": " + Thread.currentThread().getName() + " Send message to: " + message.getClientEmail());
                EmailSender.INSTANCE.sendEmail(message.getClientEmail(), message.getMessageText(), message.getSubject());
            }
        }
    }

<<<<<<< HEAD
}
=======
}
>>>>>>> 636b87fdf002691070861aee1e0806a88d303287
