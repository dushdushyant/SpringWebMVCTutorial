package com.application.web.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.application.web.forms.UserForm;

@Controller
public class TestController {
	
    @RequestMapping(value = "/next", method = RequestMethod.GET)
    public ModelAndView gdet() {
        return new ModelAndView("test");
    }

}
