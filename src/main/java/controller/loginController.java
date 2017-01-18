package controller;

import model.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import service.Authenticate;
import serviceImpl.AuthenticateImpl;

@Controller
public class loginController {
	
//	
//	@RequestMapping(value="/" , method= RequestMethod.POST)
//	public String home(){
//		return "redirect:/login";
//	}
//	
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
public String login(@RequestParam("un") String username, @RequestParam("pw") String pass, Model model){
		
		Authenticate a=new AuthenticateImpl();
		
		
		if(a.check(username, pass)){
		
			user  u = new user(username,pass);
			
			
			return "welcome";
			
			
		}
		
		else{
			
			return "login";
		}	
		}
}
