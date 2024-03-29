package com.example.demo;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BankController {
	
	@Autowired
	BankDao dao;
	@ResponseBody
	@RequestMapping("/insert_bank")
	public ModelAndView insertControl(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		
		Bank b = new Bank();
		b.setId(Integer.parseInt(request.getParameter("id")));
		b.setBbalance(Float.parseFloat(request.getParameter("Bbalance")));
		float bb = b.getBbalance();
		Bank bi = dao.insert_bank(b);
		if(bi!=null)
			
		{
			if(b.equals(bi)) {
				
			mv.setViewName("proceedpay1.jsp");
		}
			else {
				
				mv.setViewName("payfail.jsp");
			}
	
	}
		return mv;
	}
	@ResponseBody
	@RequestMapping("/getall_bank")
	public ModelAndView displayAll(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
	List<Bank> list =dao.getall_bank();
	mv.setViewName("bankdetails.jsp");
	mv.addObject("list",list);	
	return mv;

}
}
