package com.controller;
import org.springframework.stereotype.Controller;
import org.springframework.validation. BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.FormBean.Contact;
import com.sun.org.apache.bcel.internal.generic.NEW;

@Controller
@SessionAttributes

public class ContactController 
{
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String addContact(@ModelAttribute("contact") Contact contact,BindingResult results)
{
	System.out.println("First Name:"+contact.getFirstname()+"Last Name:"+contact.getLastname());
	
	return "results";
}
@RequestMapping("/contacts")
public ModelAndView showContacts()
{
	return new ModelAndView("contact","command",new Contact());
}

}