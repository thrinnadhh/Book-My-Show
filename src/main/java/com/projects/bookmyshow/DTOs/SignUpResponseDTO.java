package com.projects.bookmyshow.DTOs;

import com.projects.bookmyshow.models.ResponseStatus;

public class SignUpResponseDTO {
    private String message;
    private ResponseStatus resposeStatus;

    public ResponseStatus getResposeStatus() {
        return resposeStatus;
    }

    public void setResposeStatus(ResponseStatus resposeStatus) {
        this.resposeStatus = resposeStatus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
