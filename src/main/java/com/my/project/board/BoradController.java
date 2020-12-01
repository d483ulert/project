package com.my.project.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.my.project.dao.BoardDAO;
import com.my.project.model.BoardVO;
import com.my.project.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoradController {

	@Autowired
	BoardDAO dao;
	@Autowired
	BoardService bs;

	@RequestMapping(value = "/list")
	public String boardList(Model model,BoardVO vo) throws Exception {
		List<BoardVO> list = bs.getList(vo);
		model.addAttribute("vo", list);
	
		return "board/boardList";
	}	
}