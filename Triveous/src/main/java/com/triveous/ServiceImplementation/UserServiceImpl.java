package com.triveous.ServiceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.triveous.Entity.User;
import com.triveous.Exception.UserException;
import com.triveous.Repository.UserRepository;
import com.triveous.Service.UserService;


public class UserServiceImpl implements UserService {
	
	@Autowired
    private UserRepository userRepository;

    @Override
    public User getUserByUsername(String username) throws UserException {
        try {
        	User user = userRepository.findByUsername(username);  
        	if(user != null) 
            return user;
            else throw new UserException("User not found with username: " + username);		
                    
        } catch (Exception e) {
            throw new UserException("Error getting user by username"+ e.getMessage());
        }
    }

    @Override
    public List<User> getAllUsers() throws UserException {
        try {
            return userRepository.findAll();
        } catch (Exception e) {
            throw new UserException("Error getting all users"+ e.getMessage());
        }
    }

    @Override
    public void registerUser(User user) throws UserException {
        // Check if the username is already taken
        if (userRepository.findByUsername(user.getUsername()) != null) {
            throw new UserException("Username is already taken: " + user.getUsername());
        }

        // Encrypt the user's password before saving it
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        user.setPassword(passwordEncoder.encode(user.getPassword()));

        // Save the user to the database
        try {
            userRepository.save(user);
        } catch (Exception e) {
            throw new UserException("Error registering user"+ e.getMessage());
        }
    }

}
