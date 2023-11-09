package com.triveous.Service;

import java.util.List;

import com.triveous.Entity.User;
import com.triveous.Exception.UserException;

public interface UserService {

	 User getUserByUsername(String username) throws UserException;
	 List<User> getAllUsers() throws UserException;
	 void registerUser(User user) throws UserException;
}
