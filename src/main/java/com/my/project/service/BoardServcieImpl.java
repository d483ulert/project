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
	public List<BoardVO> getList(BoardVO vo) throws Exception{
		return dao.getList(vo);
	}

	@Override
	public void write(BoardVO vo) {
		try {
			dao.write(vo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
