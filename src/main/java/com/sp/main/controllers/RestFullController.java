package com.sp.main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sp.main.entities.User;
import com.sp.main.services.UserService;

@RestController
public class RestFullController {
	@Autowired
	private UserService userService;
	
    @PostMapping("/user")
	public User addUserDetalis(@RequestBody User user) {
		return userService.createUser(user);		
	}
    
    
    @GetMapping("/user")
    public List<User> getAllUserDetalis(){
    	return userService.getAllUsers();
    }
    
    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUserDetails(@PathVariable int id) {
    	
    	User user = userService.getUserDetail(id).orElse(null);
    	
    	if(user != null) {
    		return ResponseEntity.ok(user);
    	}
    	else {
    		 return ResponseEntity.notFound().build();
    	}
    }
    
    
    @PutMapping("/user/{id}")
    public ResponseEntity<User> updateUserDetails(@PathVariable int id, @RequestBody User user){
    	
    	User updateUser = userService.updateUserDetail(id, user);
    	if(updateUser != null) {
    		return ResponseEntity.ok(updateUser);
    	}
    	else {
    		return ResponseEntity.notFound().build();
    	}
    }
    
    @DeleteMapping("/user/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable int id){
    	userService.deleteUser(id);
    	return ResponseEntity.noContent().build();
    }
}
