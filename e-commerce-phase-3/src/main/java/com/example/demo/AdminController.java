package com.example.demo;

import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {
	@Autowired
	AdminRepo adminRepo;
	@Autowired
	AdminDao dao;
	@ResponseBody


	@RequestMapping("/")
	public ModelAndView displayadminpage(Model m) {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("adminlogin.jsp");
		return mv;
	}
	
//    @ResponseBody
//	@RequestMapping("/insertadmin")
//	public ModelAndView insertControl(HttpServletRequest request,HttpServletResponse response) {
//		ModelAndView mv=new ModelAndView();
//	
//		Admin a = new Admin();
//		
//		a.setEmail(request.getParameter("Email"));
//		a.setUsername(request.getParameter("username"));
//		String user=a.getUsername();
//		a.setPassword(request.getParameter("password"));
//		String pass=a.getPassword();
//		Admin ad = dao.insert(a);
//		if(ad!=null)
//		{
//			if(pass.equals(ad)) {
//			mv.setViewName("adminlogin1.jsp");
//				
//			}
//			else {
//				String msg="Incorrect password..";
//				mv.addObject("msg",msg);
//				mv.setViewName("adminlogin.jsp");
//			}
//			
//		}
//		else {
//			String msg="Not registered admin!! Try again..";
//			mv.addObject("msg",msg);
//			mv.setViewName("adminlogin.jsp");
//	}
//		return mv;
//
//   }  
	
	@ResponseBody
	@GetMapping( "/verifyAdmin")
	public ModelAndView checklogin(HttpServletRequest req, HttpServletResponse res)
	{
		ModelAndView mv = new ModelAndView();
		String Email = req.getParameter("Email");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		Admin ad = adminRepo.findByusernamepassword(username, password);
		if(ad!=null)
		{			
			mv.setViewName("adminlogin1.jsp");
			mv.addObject("ad", ad);
			
		}else 
		{
			mv.setViewName("AdminLogFailed.jsp");
		}
		return mv;
	}
	
////	@ResponseBody
//	@GetMapping("/getall_adminshoesdetails")
//	public ModelAndView displayAll(HttpServletRequest request,HttpServletResponse response) {
//	
//		ModelAndView mv=new ModelAndView();
//		List<Admin> list = adminRepo.findAll(); 
//		 mv.setViewName("shoesdetails.jsp");
//		 mv.addObject("list", list);
//		 return mv; 
//		 }
//	
}
