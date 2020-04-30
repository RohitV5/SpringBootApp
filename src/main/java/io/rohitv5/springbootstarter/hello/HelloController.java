package io.rohitv5.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	//if not specified then it is a GET request
	@RequestMapping(value="/hello",method = RequestMethod.GET)
	public String sayHi() {
		return "Hi";
	}

}
