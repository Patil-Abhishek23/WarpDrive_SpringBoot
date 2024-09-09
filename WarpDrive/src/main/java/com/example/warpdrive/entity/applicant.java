package com.example.warpdrive.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class applicant {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    Long id;
    String fullname;
    String email;
    String education;
    String skills;
    String expreince;
    String resume;
    String why_you;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getFullname() {
        return fullname;
    }
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEducation() {
        return education;
    }
    public void setEducation(String education) {
        this.education = education;
    }
    public String getSkills() {
        return skills;
    }
    public void setSkills(String skills) {
        this.skills = skills;
    }
    public String getExpreince() {
        return expreince;
    }
    public void setExpreince(String expreince) {
        this.expreince = expreince;
    }
    public String getResume() {
        return resume;
    }
    public void setResume(String resume) {
        this.resume = resume;
    }
    public String getWhy_you() {
        return why_you;
    }
    public void setWhy_you(String why_you) {
        this.why_you = why_you;
    }
    public applicant(Long id, String fullname, String email, String education, String skills, String expreince,
            String resume, String why_you) {
        this.id = id;
        this.fullname = fullname;
        this.email = email;
        this.education = education;
        this.skills = skills;
        this.expreince = expreince;
        this.resume = resume;
        this.why_you = why_you;
    }
    
    public applicant() {
    }
    @Override
    public String toString() {
        return "applicant [id=" + id + ", fullname=" + fullname + ", email=" + email + ", education=" + education
                + ", skills=" + skills + ", expreince=" + expreince + ", resume=" + resume + ", why_you=" + why_you
                + "]";
    }
  
  
    

}
