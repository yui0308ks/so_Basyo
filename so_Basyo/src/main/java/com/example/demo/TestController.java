package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

	@Autowired
	private TestService testService;

//	@RequestMapping(path = "/test", method = RequestMethod.GET)
	@GetMapping("/test")
	String index(Model model) {
		List<Test> list = this.testService.getTestList();
	    model.addAttribute("list", list);
	    return "test/index";
	}
}