package com.qll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 * index controller
 * @author Administrator
 *
 */
@Controller
public class IndexController {
	
	
	
	
	
	/**
	 * index
	 * @return
	 */
	@RequestMapping("/index.htm")
	public String index(){
		
		
		String viewName = "index/index";
		
		return viewName;
		
	}
			
			
	

}
