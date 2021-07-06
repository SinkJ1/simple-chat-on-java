public class Package {

    private Long userId;
    private boolean isAuth;
    private String token;
    private Command command;
    private Message data;

    public Package(Long userId, boolean isAuth, Command command, Message data) {
        this.userId = userId;
        this.isAuth = isAuth;
        this.command = command;
        this.data = data;
    }

    public Long getUserId() {
        return userId;
    }

    public boolean isAuth() {
        return isAuth;
    }

    public Command getCommand() {
        return command;
    }

    public Message getData() {
        return data;
    }
}
