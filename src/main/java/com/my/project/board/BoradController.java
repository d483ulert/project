package com.my.project.board;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	
	
	  @ModelAttribute("cp") 
	  public String getContextPath(HttpServletRequest request) {
		  return request.getContextPath();
	  }
	 
	
	@RequestMapping(value = "/list")
	public String boardList(Model model,BoardVO vo) throws Exception {
		List<BoardVO> list = bs.getList(vo);
		model.addAttribute("vo", list);
	
		return "board/boardList";
	}	
	
	@RequestMapping("/write")
	public String boardWrite() throws Exception{
		
		return "board/boardWrite";
	}
	
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	public String boardWrite1(BoardVO vo) throws Exception{
		bs.write(vo);
		return "redirect:/board/list";  // redirect에는 /board/list까지 적어야함 최상위 RequestMapping value까지포함하여. 
	}
	
}