package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<User, Integer>{


	@Query("select user from User user where user.fname=?1")
	public User findByusername(String username);
	
	@Query("select u from User u where u.fname=?1")
	public List<User> findByName(String fname);
	
	@Query("select up from User up where up.phono=?1")
	public List<User> findByPhono(String phono);

	
}
