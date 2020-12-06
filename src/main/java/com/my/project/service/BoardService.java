package com.my.project.service;

import java.util.List;


import com.my.project.model.BoardVO;


public interface BoardService {

	public List<BoardVO> getList(BoardVO vo) throws Exception;

	public void write(BoardVO vo) throws Exception;

	public List<BoardVO> getRead(BoardVO vo) throws Exception;
}
