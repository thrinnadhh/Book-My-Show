package com.projects.bookmyshow.DTOs;

import com.projects.bookmyshow.models.ResponseStatus;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;


@Component( "signupResponseDTO")
public class SignupResponseDTO {
    private String message;
    private ResponseStatus responseStatus;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }
}
