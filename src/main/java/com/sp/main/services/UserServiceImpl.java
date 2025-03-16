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
}
