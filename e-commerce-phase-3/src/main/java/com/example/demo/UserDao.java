package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDao {
	
	@Autowired
	UserRepo repo;
	
	public User insert(User u) {
		return repo.save(u);
	}
	


	public List<User> getalluser() {
		
		return repo.findAll();
	}

	

	public List<User> getall() {
		
		return repo.findAll();
	}



//	public User insertuser(User u) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	
	//SEARCH USER BY FIRST NAME
		public List<User> findByName(String fname)
		{
				return repo.findByName(fname);
		}
//		
//		//THIS CODE GIVES RETURN PASSWORD FOR USER USING PHONE NUMBER
		public List<User> forget_pass(String phono)
		{
			return repo.findByPhono(phono);
		}	
//		

//	public User check(User u) {
////		// TODO Auto-generated method stub
//		return repo.ifExits(u);
//	}

}
