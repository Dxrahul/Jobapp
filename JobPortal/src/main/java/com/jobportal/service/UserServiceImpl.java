package com.jobportal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobportal.dto.UserDTO;
import com.jobportal.entity.User;
import com.jobportal.repo.UserRepo;

@Service(value="userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo userRepo;
	@Override
	public UserDTO registerUser(UserDTO userDTO) {

     User user=userDTO.toEntity();
     user= userRepo.save(user);
     return user.toDTO();

	}

}
