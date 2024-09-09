package com.example.warpdrive.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.warpdrive.entity.applicant;
import com.example.warpdrive.entity.user;
import com.example.warpdrive.serviceimplimentation.ApplicantServiceImplimentaion;
import com.example.warpdrive.serviceimplimentation.UserServiceImplimentation;

@Controller
public class ApplicantController {


@Autowired
ApplicantServiceImplimentaion applicantServiceImplimentaion;
@Autowired
UserServiceImplimentation userServiceImplimentation;


@PostMapping("/applicant")
public String addapplcants(@ModelAttribute applicant Applicant){

    String email=Applicant.getEmail();
    boolean status=applicantServiceImplimentaion.emailExists(email);

    if(status==false){
        applicantServiceImplimentaion.addApplicant(Applicant);
        return "ApplicationSubmitted";
    }
    else{
        System.out.println("Email already in the database");
        return "preapp";
    }
 
   }
  

@PostMapping("/registration")
public String addUser(@ModelAttribute user user) {

    String email = user.getEmail();

    boolean status =userServiceImplimentation.emailExists(email);

    if (status == false) {
        userServiceImplimentation.addUser(user);
        System.out.println("User added");

    } else {

        System.out.println("User already exists");
        return "login";

    }

    return "login";
}
}
