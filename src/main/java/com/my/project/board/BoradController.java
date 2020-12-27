package com.my.project.board;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@RequestMapping(value="/read")
	public String boardRead(BoardVO vo, Model model,@RequestParam int bno) throws Exception{
		BoardVO list= bs.getRead(bno);
		model.addAttribute("board",list); //Don't know how to iterate over supplied "items" in &lt;forEach&gt; list가아닌데 list로 보내줘서 생긴문제
		return "board/boardRead";
	}
	@RequestMapping(value="/delete")
	public String boardDelete(Model model,@RequestParam int bno) throws Exception{
		bs.delete(bno);
		model.addAttribute(bno);
		return "redirect:/board/list";
	}
	
	@RequestMapping(value="/update")
	public String boardUpdate(BoardVO vo, Model model,@RequestParam int bno) throws Exception {
		model.addAttribute("board",bs.getRead(bno));
		return "board/boardUpdate";
	}

}