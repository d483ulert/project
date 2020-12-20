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
		session.insert("Board.boardwrite",vo);  // List에는 vo 객체를 안 넣어도 되지만 write는 넣어줘야한다.
		
	}

	@Override
	public BoardVO getRead(int bno) throws Exception {
		return session.selectOne("Board.boardread",bno);
	}

	@Override
	public void delete(int bno) throws Exception {
		session.delete("Board.boarddelete",bno);
	}

	@Override
	public void update(BoardVO vo) throws Exception {
		session.update("Board.boardupdate",vo);
		
	}

	
}
