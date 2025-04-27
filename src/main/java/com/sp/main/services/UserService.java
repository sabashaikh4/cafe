package com.sp.main.services;

import java.util.List;
import java.util.Optional;

import com.sp.main.entities.User;

public interface UserService {

	public boolean Saveorders(User user);
	

	// API create new user
	public User createUser(User user);
	
	// get  user details 
	public List<User> getAllUsers();
	
	//get user detail by id
	public Optional<User> getUserDetail(int id);
	
	// put (Update user detail)
	public User updateUserDetail(int id , User user);
	
	// delete
	public void deleteUser(int id);

}
