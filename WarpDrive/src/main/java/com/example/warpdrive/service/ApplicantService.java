package com.example.warpdrive.service;
import com.example.warpdrive.entity.applicant;


public interface ApplicantService {

    public String addApplicant(applicant Applicant);
    public boolean emailExists(String email);
    

    
}
