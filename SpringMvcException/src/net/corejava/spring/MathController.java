package net.corejava.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class MathController {
@RequestMapping(value="/doMath", method=RequestMethod.GET)
public ModelAndView calculateSum(@RequestParam("a") int a,@RequestParam("b") int b) {
ModelAndView model=new ModelAndView("Mathresult");
model.addObject("sum",(a+b));
model.addObject("subtract",(a-b));
model.addObject("multiply",(a*b));
model.addObject("divide",(a/b));
return model;
}  
}