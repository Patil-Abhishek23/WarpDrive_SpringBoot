package com.example.warpdrive.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.warpdrive.entity.user;
import com.example.warpdrive.serviceimplimentation.UserServiceImplimentation;

import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {

	@Autowired
	UserServiceImplimentation userServiceImplimentation;

	@PostMapping("/registration")
	public String addUser(@ModelAttribute user user) {

		String email = user.getEmail();

		boolean status = userServiceImplimentation.emailExists(email);

		if (status == false) {
			userServiceImplimentation.addUser(user);
			System.out.println("User added");

		} else {

			System.out.println("User already exists");
			return "login";

		}

		return "login";
	}

	@PostMapping("/validate")
	public String validates(@RequestParam("email") String email, @RequestParam("password") String password,
			HttpSession session, Model model) {

		if (userServiceImplimentation.ValidateUser(email, password) == true) {

			String role = userServiceImplimentation.getRole(email);

			session.setAttribute("email", email);

			if (role.equals("admin")) {

				return "admin";
			} 
		} 
		return "applicant";
	}
}