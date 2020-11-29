package com.my.project.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.my.project.dao.BoardDAO;
import com.my.project.model.BoardVO;

@Service("BoardService")
public class BoardServcieImpl implements BoardService{

	@Autowired
	BoardDAO dao;
	
	@Override
	public List<BoardVO> getList() throws Exception{
		return dao.getList();
	}

}
