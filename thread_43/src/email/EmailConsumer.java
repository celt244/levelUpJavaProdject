package email;

import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by java on 21.04.2017.
 */
public class EmailConsumer {

    private final ArrayBlockingQueue<EmailMessage> queue;

    public EmailConsumer(ArrayBlockingQueue<EmailMessage> queue) {
        this.queue = queue;
    }

    public void start(){
        new Thread(() -> {
            EmailMessage message = null;
            while((message = queue.poll()) !=null)   {
                System.out.println(Thread.currentThread().getName() + "Send message to " +  );
           EmailSender.INSTANCE.sendEmail(message.getClientEmail(), message.getMessageText(), message.getSubject());


        }).start();
}
    }