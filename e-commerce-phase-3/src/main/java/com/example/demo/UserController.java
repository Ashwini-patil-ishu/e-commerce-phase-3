package com.example.demo;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	@Autowired
	UserRepo repo;
	@Autowired
	UserDao dao;
	@Autowired
	ShoesDao shoedao;

//
//	@RequestMapping("/userpage")
//	public ModelAndView displaypage(HttpServletRequest request,HttpServletResponse response) {
//		ModelAndView mv=new ModelAndView();
//		mv.setViewName("userlogin.jsp");
//		return mv;
//	}


	
	@RequestMapping("/insertuser")
	public ModelAndView insertControl(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		User u = new User();
		u.setId(Integer.parseInt(request.getParameter("id")));
		u.setFname(request.getParameter("fname"));
		u.setLname(request.getParameter("lname"));
		u.setPhono(Integer.parseInt(request.getParameter("phono")));
		u.setUsername(request.getParameter("username"));
		u.setPassword(request.getParameter("password"));
		
		
		User ur = dao.insert(u);
		if(ur!=null)
		{
		
			mv.setViewName("user_reg_succ.jsp");
		}
		return mv;
	}
	
	
	@RequestMapping("/loginuser")
	public String logincontrol(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		User e= new User();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String pass= e.getPassword();
		User ad = repo.findByusername(username);
		if(ad!=null)
		{
			
//			mv.setViewName("userloginsuccess.jsp");
				return "Welcome Back"+" "+username;
		}
		
		else {
			
			
		return "Check Credentisl's or Register" + " ";
				
			}
		
}

	//ADMIN CAN SEE LIST OF SIGN-UP USER'S USING THIS CODE
	@RequestMapping("/userlist")
	public ModelAndView userlist(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		List<User> list =dao.getalluser();
		mv.setViewName("all_user_list.jsp");
		mv.addObject("list", list);
		return mv;
	}

	
	@RequestMapping("/forget_pass")
	public ModelAndView forget_pass(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		List<User> list =dao.getalluser();
		mv.setViewName("all_user_list.jsp");
		mv.addObject("list", list);
		return mv;
	}
	
	
	@RequestMapping("/getall_usershoesdetails")
	public ModelAndView displayAll(HttpServletRequest request,HttpServletResponse response) {
	
		ModelAndView mv=new ModelAndView();
		List<Shoes> list = shoedao.getall();
		mv.setViewName("usershoesdetails.jsp");
		mv.addObject("list", list);
		return mv;

}
	
}
