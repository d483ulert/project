package com.my.project.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.my.project.dao.BoardDAO;
import com.my.project.model.BoardVO;
import com.my.project.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoradController {

	
	BoardVO vo = new BoardVO();
	@Autowired
	BoardDAO dao;
	@Autowired
	BoardService bs;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String boardList(Model model) throws Exception {
		
		model.addAttribute("vo",bs.getList());
		
		return "board/boardList";
		
	}
	
	
}
