package com.projects.bookmyshow.Service;

import com.projects.bookmyshow.Repository.UserRepository;
import com.projects.bookmyshow.models.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private UserRepository userRepository;
    public User signUpUser(String email, String password) {
        Optional< User> optionalUser = userRepository.findByEmail(email);
        if(optionalUser.isEmpty()){
            User user = new User();

            BCryptPasswordEncoder bcryptPasswordEncoder = new BCryptPasswordEncoder();
            user.setEmail("thrinnadhh");
            user.setPassword(bcryptPasswordEncoder.encode(password));
            return userRepository.save(user);
        }
        else{
            throw new RuntimeException("User already Exists time for login ");
        }
    }
}
