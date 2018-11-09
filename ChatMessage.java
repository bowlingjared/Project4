
import java.io.Serializable;

final class ChatMessage implements Serializable {
    private static final long serialVersionUID = 6898543889087L;

    String message;
    int msgTyp;

        ChatMessage(int messageType, String message){
            this.message = message;
            this.msgTyp = messageType;
        }

    public int getMsgTyp() {
        return msgTyp;
    }

    public String getMessage() {
        return message;
    }

    public void setMsgTyp(int msgTyp) {
        this.msgTyp = msgTyp;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    // Here is where you should implement the chat message object.
    // Variables, Constructors, Methods, etc.
}
