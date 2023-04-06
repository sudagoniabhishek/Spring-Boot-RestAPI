package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UserDTO;
import com.example.demo.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	
	@PostMapping("/create-user")
	public String createUser(@RequestBody UserDTO userDTO) {
		userService.create(userDTO);
		return "user saved";
		
	}
	@PutMapping("/update-user")
	public String updateUser(@RequestBody UserDTO userDTO) {
		
		userService.update(userDTO);
		return "updated success";
		
	}
	@DeleteMapping("/delete-user")
	public String deleteUser() {
		
		userService.delete();
		return "deleted succesful";
		
	}

	/*@GetMapping("/get-user")
	public UserDTO getUser() {
		UserDTO users=new UserDTO(1,"ABHI",15000,"abhi@1234");
		return users;*/
		
	//@GetMapping("/get-users")
	/*public UserDTO getUser() {
		System.out.println("controller invooked!!!!");
	
	  return userService.getUser();*/
	
	@GetMapping("/get-users/{id}")
		public UserDTO getUser(@PathVariable int id) {
			System.out.println("controller invooked!!!! for user id of"+id);
		
		  return userService.getUse(id); }
	
}
