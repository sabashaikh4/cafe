package com.sp.main.services;

import com.sp.main.entities.User;

public interface UserService {

	public boolean Saveorders(User user);

      // API creates a new user
	public User createUser(User user);
	
	// get  user details 
	public List<User> getAllUsers();
	
	//get user details by id
	public Optional<User> getUserDetail(int id);
	
	// put (Update user detail)
	public User updateUserDetail(int id , User user);
	
	// delete
	public void deleteUser(int id);
}
