package springmessage;

import org.springframework.stereotype.Controller;
import  org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HelloWorldController {
@RequestMapping("/hello")
public ModelAndView helloWorld()
{
	String message ="HELLO SPRING MVC HOW ARE YOU";
	return new ModelAndView("hellopage","mes",message);
}
}
