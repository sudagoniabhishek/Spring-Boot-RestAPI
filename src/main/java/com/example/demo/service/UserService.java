package com.example.demo.service;

import com.example.demo.dto.UserDTO;

public interface UserService {

	public UserDTO getUser();

	public UserDTO getUse(int id);

	public void create(UserDTO userDTO);

	public void update(UserDTO userDTO);

	public void delete();

	

	

	

	

}
