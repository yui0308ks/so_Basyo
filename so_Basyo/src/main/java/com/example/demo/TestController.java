package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@Autowired
	private TestService testService;

	@GetMapping("/test")
	String index(Model model) {
		List<Test> list = this.testService.getTestList();
	    model.addAttribute("list", list);
	    return "test/index";
	}
}