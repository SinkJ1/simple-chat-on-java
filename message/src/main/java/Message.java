import java.io.Serializable;
import java.util.Date;

public class Message implements Serializable {

    private Long senderId;
    private Long recipientId;
    private Date time;
    private String message;

    public Message() {
    }

    public Message(Long senderId, Long recipientId, Date time, String message) {
        this.senderId = senderId;
        this.recipientId = recipientId;
        this.time = time;
        this.message = message;
    }

    public Long getSenderId() {
        return senderId;
    }

    public void setSenderId(Long senderId) {
        this.senderId = senderId;
    }

    public Long getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(Long recipientId) {
        this.recipientId = recipientId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
