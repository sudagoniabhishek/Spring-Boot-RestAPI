package com.example.demo.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.userRespository;
import com.example.demo.dto.UserDTO;
import com.example.demo.entity.User;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	userRespository userRepository;
	
	
	@Override
	public UserDTO getUser() {
		int userId=2;
		User user=userRepository.findById(userId).get();
		UserDTO userDTO =new UserDTO();
		BeanUtils.copyProperties(user,userDTO);
		return userDTO;
	}
	
	@Override
	public UserDTO getUse(int id) {
		User user=userRepository.findById(id).get();
		UserDTO userDTO=new UserDTO();
		BeanUtils.copyProperties(user, userDTO);
		return userDTO;
	}
	
	
	
	public void create(UserDTO userDTO) {
		User user=new User();
	
		/*user.setEno(3);
		user.setEname("bala");
		user.setEsal(189990);
		user.setEmail("bala@gmail.com");*/
		BeanUtils.copyProperties(userDTO, user);
		User savedUser=userRepository.save(user);
		
		System.out.println("saved succesfully");
		
	}
	
	
	
	@Override
	public void update(UserDTO userDTO) {
		User user=new User();
		BeanUtils.copyProperties(userDTO, user);
		User saveedUser=userRepository.save(user);
		
	}
	
	
	@Override
	public void delete() {
		int id=2;
		userRepository.deleteById(id);
		
	}

	
	
	
}
