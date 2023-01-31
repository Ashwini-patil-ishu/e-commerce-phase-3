package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AdminRepo extends JpaRepository<Admin, Integer>{

//	@Query(value = "select a from Admin a where a.username=?1", nativeQuery = true)
//	public Admin FindUsername(String username);
//	
//	@Query(value ="select a from Admin a where a.password=?1", nativeQuery = true)
//	public Admin FindPassword(String pass);
//	
	@Query("select admin from Admin admin where admin.username=?1 and admin.password=?2")
	public Admin findByusernamepassword(String username, String password);

}
