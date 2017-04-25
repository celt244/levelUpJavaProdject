package email;

import java.util.concurrent.ArrayBlockingQueue;

import static email.EmailSender.INSTANCE;

/**
 * Created by java on 21.04.2017.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
//        INSTANCE.sendEmail();
//        emailSender.sendEmail();

        ArrayBlockingQueue<EmailMessage> queue = new ArrayBlockingQueue<>(10);
        EmailProducer producer = new EmailProducer(queue);

        EmailConsumer consumer1 = new EmailConsumer(queue);
        EmailConsumer consumer2 = new EmailConsumer(queue);
        EmailConsumer consumer3 = new EmailConsumer(queue);

        producer.start();

        consumer1.start();
        consumer2.start();
        consumer3.start();

        Thread.sleep(10000);

    }


}
