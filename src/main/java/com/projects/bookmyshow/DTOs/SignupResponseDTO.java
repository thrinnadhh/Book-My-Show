package com.projects.bookmyshow.DTOs;

import com.projects.bookmyshow.models.ResponseStatus;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component( "signupResponseDTO")
public class SignupResponseDTO {
    private String message;
    private ResponseStatus responseStatus;

}
