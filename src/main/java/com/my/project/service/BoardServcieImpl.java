package com.my.project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.my.project.model.BoardVO;

@Service("BoardService")
public class BoardServcieImpl implements BoardService{

	@Override
	public List<BoardVO> getList() throws Exception{
		
		return null;
	}

}
