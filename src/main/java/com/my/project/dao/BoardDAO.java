package com.my.project.dao;

import java.util.List;
import com.my.project.model.BoardVO;


public interface BoardDAO {
	
	public List<BoardVO> getList(BoardVO boardvo) throws Exception;
	

}
