package com.application.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.application.web.forms.UserForm;


@Controller
public class LoginController {	
	/*
	 * 
	 * mapping for login
	 */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView get() {
         UserForm userForm= new UserForm();
        return new ModelAndView("login" , "userForm", userForm);
    }

    
    @RequestMapping(value = "/home", method = RequestMethod.POST)
    public ModelAndView save(@ModelAttribute("userForm") UserForm userForm) {
    	
    	System.out.println(userForm.getPassWord());
    	System.out.println(userForm.getUserName());
         
        return new ModelAndView("home", "userForm", userForm);
    }
    

}
