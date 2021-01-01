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
	public void write(BoardVO vo) throws Exception {
		dao.write(vo);
	}

	@Override
	public BoardVO getRead(int bno) throws Exception {
		return dao.getRead(bno);
		
	}

	@Override
	public void delete(int bno) throws Exception {
		dao.delete(bno);
	}

	@Override
	public void update(BoardVO vo) throws Exception {
		dao.update(vo);
	}

	@Override
	public void recommend(BoardVO vo) throws Exception {
		dao.recommend(vo);
	}

}
