package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BankRepo extends JpaRepository<Bank, Integer>{
//
//	@Query("select balance from bank as bd where bd.b_id=?1")
//	public Bank insert(Bank b);
//
//	public Bank getReferenceById(Bank b);

	
}
