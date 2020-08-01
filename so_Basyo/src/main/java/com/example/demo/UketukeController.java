package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UketukeController {

	@Autowired
	private UketukeService uketukeService;

	@GetMapping("/uketuke")
	String index(Model model) {
		List<Uketuke> list = this.uketukeService.getUketukeList();
	    model.addAttribute("list", list);
	    return "uketuke/index";
	}
}