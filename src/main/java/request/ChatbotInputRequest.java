package request;

import io.swagger.annotations.ApiModel;
import org.springframework.hateoas.RepresentationModel;

@ApiModel("Message")
public class ChatbotInputRequest
        extends RepresentationModel<ChatbotInputRequest> {

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String message;

}
