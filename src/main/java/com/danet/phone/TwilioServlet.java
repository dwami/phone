package com.danet.phone;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TwilioServlet {
	
	@RequestMapping(value="/", method = RequestMethod.GET) 
	@ResponseBody
	public String getCall() {
		return "Hello World";
	}

}
