package com.my.project.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.my.project.model.BoardVO;

@Controller
@RequestMapping("/board")
public class BoradController {

	@Autowired
	BoardVO boardvo;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String boardList(Model model) {
		
		model.addAttribute(boardvo);
		
		return "board/boardList";
	}
	
	
}
