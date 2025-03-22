package com.sp.main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sp.main.entities.User;
import com.sp.main.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	 @Autowired
	    private UserRepository userRepository;


		@Override
		public boolean Saveorders(User user) {
			
			try {
			 userRepository.save(user);
			return true;
			}
			catch(Exception e) {
				e.printStackTrace();
				return false;
			}
		}

	// RestFull API
		
		// create new user(Post)
		@Override
		public User createUser(User user) {
		
			return userRepository.save(user);
		}

		// get user details(Get)
		@Override
		public List<User> getAllUsers() {
			
			return userRepository.findAll();
		}
		// get user details by id
		@Override
		public Optional<User> getUserDetail(int id) {
			return userRepository.findById(id);
		}

		
		//update user details(put)
		@Override
		public User updateUserDetail(int id, User newUser) {
			User userData = userRepository.findById(id).orElse(null);
		    
			if(userData != null) {
				return userRepository.save(newUser);
			}
			else
			{
				throw new RuntimeException("User not Found with id :"+ id);
			}
		}

		// delete user 
		@Override
		public void deleteUser(int id) {
			userRepository.deleteById(id);
			
		}
}
