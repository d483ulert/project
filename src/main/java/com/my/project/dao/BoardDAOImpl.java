package com.my.project.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.my.project.model.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO{

	@Autowired
	SqlSession session;  // Cannot make a static reference to the non-static method selectList(String, Object) from the type SqlSession 

	@Override
	public List<BoardVO> getList(BoardVO vo) throws Exception {

		 return session.selectList("Board.boardlist");
		
	}

	@Override
	public void write(BoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		session.insert("Board.boardwrite");
		
	}

}
