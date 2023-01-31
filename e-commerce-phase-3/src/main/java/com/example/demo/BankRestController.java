package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankRestController {

	@Autowired
	BankDao dao;
	
	@PostMapping("/insert_bank")
	public Bank insert(@RequestBody Bank b) {
		return dao.insert_bank(b);
	}
	
	@GetMapping("getall_bank")
	public List<Bank> getall(){
		return dao.getall_bank();
	}
}
