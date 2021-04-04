package com.my.project.service;

import java.util.List;


import com.my.project.model.BoardVO;


public interface BoardService {

	public List<BoardVO> getList(BoardVO vo) throws Exception;

	public void write(BoardVO vo) throws Exception;

	public BoardVO getRead(int bno) throws Exception;
	
	public void delete(int bno) throws Exception;
	
	public void update(BoardVO vo) throws Exception;
	
	public void recommend(BoardVO vo) throws Exception;

	public BoardVO inview(BoardVO vo) throws Exception;
}
	
