package fr.art.bryan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ActivityController {

	@RequestMapping("/activity")
	@ResponseBody
	String home() {
		return "Crud activity";
	}

}
