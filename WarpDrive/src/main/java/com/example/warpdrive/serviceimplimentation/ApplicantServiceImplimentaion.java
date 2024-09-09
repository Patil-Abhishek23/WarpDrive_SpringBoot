package com.example.warpdrive.serviceimplimentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.warpdrive.entity.applicant;
import com.example.warpdrive.repository.ApplicantRepository;
import com.example.warpdrive.service.ApplicantService;

@Service
public class ApplicantServiceImplimentaion implements ApplicantService {

    @Autowired
   ApplicantRepository applicantRepository;
    
   

    
    @Override
    public String addApplicant(applicant Applicant) {
      applicantRepository.save(Applicant);
      return "Applicant added";
    
    }

  
    public boolean emailExists(String email) {
      if(applicantRepository.findByEmail(email) != null){
        return true;
      }
      else{
        return false;
      }
    }   
}

// if (userRepository.findByEmail(email) != null) {
//   return true;
// }