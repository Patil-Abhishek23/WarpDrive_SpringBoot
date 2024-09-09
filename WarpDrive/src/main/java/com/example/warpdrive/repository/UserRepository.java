package com.example.warpdrive.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.warpdrive.entity.user;

public interface UserRepository extends JpaRepository<user,String>{

	public user findByEmail(String email);

}
