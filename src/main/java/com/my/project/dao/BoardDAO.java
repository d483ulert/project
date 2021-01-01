package com.my.project.dao;

import java.util.List;
import com.my.project.model.BoardVO;


public interface BoardDAO {
	
	public List<BoardVO> getList(BoardVO vo) throws Exception;
	
	public void write(BoardVO vo) throws Exception;	
	
	public BoardVO getRead(int bno) throws Exception;
	
	public void delete(int bno) throws Exception;

	public void update(BoardVO vo) throws Exception;
	
	public void recommend(BoardVO vo) throws Exception;
}
