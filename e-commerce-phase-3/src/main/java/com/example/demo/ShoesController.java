package com.example.demo;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ShoesController {

	@Autowired
	ShoesDao dao;

	

	// INSERTING SHOES CODE
	
	@RequestMapping("/insert_shoes")
	public ModelAndView insertControl(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		Shoes s = new Shoes();
		s.setId(Integer.parseInt(request.getParameter("id")));
		s.setBrand(request.getParameter("brand"));
		s.setName(request.getParameter("name"));
		s.setPrice(Float.parseFloat(request.getParameter("price")));
		Shoes ss = dao.insert_shoes(s);
		if (ss != null) {
			mv.setViewName("success.jsp");
		} 
		return mv;
	}
	
	 @RequestMapping("/editcontroller") 
	 public ModelAndView edit(HttpServletRequest request, HttpServletResponse response) {
		 ModelAndView mv=new ModelAndView();
	     Shoes s = new Shoes();
	    s.setId(Integer.parseInt(request.getParameter("id")));
	    s.setName(request.getParameter("name"));
//	    s.setBrand(request.getParameter("brand"));
//	    s.setPrice(Float.parseFloat(request.getParameter("price")));
	  String s1 = dao.edit(s); 
	  if(s1!=null) 
	  { 
		  mv.setViewName("successedit.jsp");
	  } 
	  
	  return mv; 
	  }
	
	@RequestMapping("/delete_shoe")
	public ModelAndView delete(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		Shoes s = new Shoes();
		s.setId(Integer.parseInt(request.getParameter("id")));
		Shoes s2 = dao.deletebyid(s);
		if (s2 != null) {
			mv.setViewName("successdelete.jsp");
		} 

		return mv;

	}
	
	@RequestMapping("/getallshoesdetails")
	public ModelAndView displayAll(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		List<Shoes> list = dao.getall();
		mv.setViewName("shoesdetails.jsp");
		mv.addObject("list", list);
		return mv;
	}
	
	
	@RequestMapping("/addbank/{id}")
	public RedirectView addBank(@PathVariable("id") int id, HttpServletRequest request, HttpServletResponse response)
	{
		RedirectView rv = new RedirectView();
		Bank b = new Bank();
	      b.setId(id);
		return rv;
	}
	

}