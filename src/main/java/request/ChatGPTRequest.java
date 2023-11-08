package request;

import java.util.List;

public class ChatGPTRequest {

    private String model;
    private List<Message> messages;

    public String getModel() {
        return model;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public Integer getMax_tokens() {
        return max_tokens;
    }

    public void setMax_tokens(Integer max_tokens) {
        this.max_tokens = max_tokens;
    }

    private Integer max_tokens;

    public void setModel(String s) {
    }

    public void setMax_tokens(int i) {
    }

    // Constructors, Getters and Setters


}



