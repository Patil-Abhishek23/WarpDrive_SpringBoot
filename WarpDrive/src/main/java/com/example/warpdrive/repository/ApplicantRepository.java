package com.example.warpdrive.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.warpdrive.entity.applicant;
import com.example.warpdrive.entity.user;


public interface ApplicantRepository extends JpaRepository<applicant,Long>{

  
public user findByEmail(String email);
    
} 