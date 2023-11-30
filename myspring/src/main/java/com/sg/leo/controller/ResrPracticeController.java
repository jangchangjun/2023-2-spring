package com.sg.leo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class ResrPracticeController {
	@RequestMapping("/hello")
	public String hello() {
		return "return from /hello, RestPracticeController. 10/12 by 장창준";
		
	}



	@GetMapping("/get")
	public String get() {
		return "return from /get, RestPracticeController. 10/16 by 장창준";
	}
	
	@GetMapping(value = "/getchk/{variable}")
	public String getchk(@PathVariable String variable) {
		return "return from /getchk, RestPracticeController. 10/16 by 장창준:" + variable;
	}
	
	@GetMapping(value="/getparam")
	public String getparam(@RequestParam  String name, String email) {
		return "return from /getparm, name = "+ name+"email= "+email;
	}
	
}