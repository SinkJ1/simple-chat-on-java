import java.io.Serializable;
import java.util.Date;

public class Message implements Serializable {

    private Integer senderId;
    private Integer recipientId;
    private Date time;
    private String message;

    public Message() {
    }

    public Message(Integer senderId, Integer recipientId, Date time, String message) {
        this.senderId = senderId;
        this.recipientId = recipientId;
        this.time = time;
        this.message = message;
    }

    public Integer getSenderId() {
        return senderId;
    }

    public void setSenderId(Integer senderId) {
        this.senderId = senderId;
    }

    public Integer getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(Integer recipientId) {
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
