package tn.enis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("hello")
public class HelloController {
  @RequestMapping(method=RequestMethod.GET)
	public String showPage(Model uiModel)
 { 
	 uiModel.addAttribute("h", "helloWorld");
	 return "hello_page";}
}
