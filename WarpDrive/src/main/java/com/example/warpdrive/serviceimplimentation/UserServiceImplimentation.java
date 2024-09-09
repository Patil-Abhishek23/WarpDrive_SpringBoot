package com.example.warpdrive.serviceimplimentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.warpdrive.entity.user;
import com.example.warpdrive.repository.ApplicantRepository;
import com.example.warpdrive.repository.UserRepository;
import com.example.warpdrive.service.UserService;


@Service
public class UserServiceImplimentation implements UserService {

	@Autowired
	UserRepository userRepository;

	@Autowired
	ApplicantRepository ApplicantRepository;


	public String addUser(user user) {
		userRepository.save(user);
		return "User added sucessfully";
	}

	public boolean emailExists(String email) {
		if (userRepository.findByEmail(email)!= null) {
			return true;
		}

		else {
			return false;

		}
	}
	public boolean ValidateUser(String email, String password) {

		user user = userRepository.findByEmail(email);
		String dbpass = user.getPassword();

		if (password.equals(dbpass)) {

			return true;
		} 
		else {

			return false;
		}

	}

	public String getRole(String email) {

		user user = userRepository.findByEmail(email);

		return user.getRole();
	}

}

