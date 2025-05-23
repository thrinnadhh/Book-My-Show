package com.projects.bookmyshow.Controller;

import com.projects.bookmyshow.DTOs.SignUpRequestDTO;
import com.projects.bookmyshow.DTOs.SignupResponseDTO;
import com.projects.bookmyshow.Service.UserService;
import com.projects.bookmyshow.models.ResponseStatus;
import com.projects.bookmyshow.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @Autowired
    private SignupResponseDTO signUpResponseDTO;
    @Autowired
    private UserService userService;

    public SignupResponseDTO signUp(SignUpRequestDTO signUpRequestDTO) {
        try{
            User user = userService.signUpUser(signUpRequestDTO.getEmail(),signUpRequestDTO.getPasswd());
            signUpResponseDTO.setResponseStatus(ResponseStatus.SUCCESS);
            signUpResponseDTO.setMessage("User registered successfully");

        }catch(Exception e){
            signUpResponseDTO.setResponseStatus(ResponseStatus.FAILURE);
            signUpResponseDTO.setMessage(e.getMessage());
        }
        return signUpResponseDTO;
    }
}
