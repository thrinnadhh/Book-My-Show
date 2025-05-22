package com.projects.bookmyshow;

import com.projects.bookmyshow.Controller.UserController;
import com.projects.bookmyshow.DTOs.SignUpRequestDTO;
import com.projects.bookmyshow.DTOs.SignupResponseDTO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookMyShowApplication implements CommandLineRunner {
	private final SignupResponseDTO signupResponseDTO;
	private UserController userController;

	public BookMyShowApplication(SignupResponseDTO signupResponseDTO) {
		this.signupResponseDTO = signupResponseDTO;
	}

	public static void main(String[] args) {
		SpringApplication.run(BookMyShowApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		SignUpRequestDTO signUpRequestDTO = new SignUpRequestDTO();
		signUpRequestDTO.setEmail("thrinnadhh.b97@gmail.com");
		signUpRequestDTO.setPasswd("password thinking still not found");
	}
}
