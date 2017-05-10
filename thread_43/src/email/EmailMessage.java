package email;

/**
 * Created by java on 21.04.2017.
 */
public class EmailMessage {
<<<<<<< HEAD

=======
>>>>>>> 636b87fdf002691070861aee1e0806a88d303287
    private String clientEmail;
    private String messageText;
    private String subject;

    public EmailMessage(String clientEmail, String messageText, String subject) {
        this.clientEmail = clientEmail;
        this.messageText = messageText;
        this.subject = subject;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
