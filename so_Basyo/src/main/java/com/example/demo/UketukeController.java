package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UketukeController {

	@Autowired
	private UketukeService uketukeService;

	@RequestMapping(path = "/uketuke", method = RequestMethod.GET)
	String index(Model model) {
		List<Uketuke> list = this.uketukeService.getUketukeList();
	    model.addAttribute("list", list);
	    return "uketuke/index";
	}
}