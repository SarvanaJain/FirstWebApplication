package webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import webapp.todo.TodoController;


@Controller 
public class WelcomeController {
	@Autowired
	TodoController security;
	@RequestMapping(value = "/" , method =RequestMethod.GET)
//	@ResponseBody
	public String showLoginPage(ModelMap model) {
		model.put("name",security.retrieveLoggedinUserName());
		return "welcome";
	}
	
	
	
}
