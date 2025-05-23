package com.projects.bookmyshow.DTOs;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component( "signupRequestDTO")
public class SignUpRequestDTO {
    private String email;
    private String passwd;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
}
