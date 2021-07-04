import java.io.Serializable;

public class Command implements Serializable {

    private Commands command;
    private Message message;


    public Command(Commands command){
        this.command = command;
    }

    public Command(Commands command, Message message) {
        this.command = command;
        this.message = message;
    }

    public Commands getCommand() {
        return command;
    }

    public Message getMessage() {
        return message;
    }
}
