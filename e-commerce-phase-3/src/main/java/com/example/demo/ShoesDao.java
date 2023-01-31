package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShoesDao {

	@Autowired
	ShoesRepo repo;

	public Shoes insert_shoes(Shoes s) {
		return repo.save(s);
	}

	public List<Shoes> getall() {
		return repo.findAll();
	}

	public List<Shoes> insertall(List<Shoes> ss) {
		return repo.saveAll(ss);
	}

	public Optional<Shoes> getbyid(int id) {
		return repo.findById(id);
	}

	
//	  public String updatebyname (Shoes s) { 
//		  Shoes ss=repo.findById(s.getId()).orElse(null);
////		  ss.setBrand(s.getBrand());
//	      ss.setName(s.getName());
////	      ss.setPrice(s.getPrice());
//	  
//	  return repo.toString();
//	  }
	 
	public Shoes deletebyid(Shoes s) {

		repo.deleteById(s);
		return s;
	}

	public String edit(Shoes s) {
		Shoes ss = repo.findById(s.getId()).orElse(null);
		ss.setId(s.getId());
	    ss.setBrand(s.getBrand());
	    ss.setName(s.getName());
	    ss.setPrice(s.getPrice());
		return repo.toString();
	}

//	public List<Shoes> getallshoes() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	
}
