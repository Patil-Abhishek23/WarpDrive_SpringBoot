package com.example.warpdrive.service;
import com.example.warpdrive.entity.user;

public interface UserService {

    public String addUser(user user);
    public boolean emailExists(String email);
    public boolean ValidateUser(String email, String password);
    public String getRole(String email);

    
    

}
