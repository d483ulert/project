package com.my.project.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/board")
public class BoradController {

	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String boardList() {
	
		
		return "/boardList";
	}
	
	
}
