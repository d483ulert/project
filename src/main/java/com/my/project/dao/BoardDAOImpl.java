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
		session.insert("Board.boardwrite",vo);  // List�뿉�뒗 vo 媛앹껜瑜� �븞 �꽔�뼱�룄 �릺吏�留� write�뒗 �꽔�뼱以섏빞�븳�떎.
		
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

	@Override
	public void recommend(BoardVO vo) throws Exception {
		session.update("Board.recommend",vo);
	}

	@Override
	public void inview(BoardVO vo) throws Exception {
		session.update("Board.boardinquiry", vo);
		
	}

	
}
