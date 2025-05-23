package com.projects.bookmyshow;

import com.projects.bookmyshow.Controller.UserController;
import com.projects.bookmyshow.DTOs.SignUpRequestDTO;
import com.projects.bookmyshow.DTOs.SignupResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookMyShowApplication implements CommandLineRunner {
	@Autowired
	private SignupResponseDTO signupResponseDTO;
	@Autowired
	private UserController userController;
	@Autowired
	private SignUpRequestDTO signUpRequestDTO;

	public static void main(String[] args) {
		SpringApplication.run(BookMyShowApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		signUpRequestDTO.setEmail("thrinnadhh.b97@gmail.com");
		signUpRequestDTO.setPasswd("Still thinking about the password");
		signupResponseDTO = userController.signUp(signUpRequestDTO);
		System.out.println(signupResponseDTO.getMessage());
	}
}
