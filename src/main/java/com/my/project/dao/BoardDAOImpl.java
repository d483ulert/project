package com.my.project.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.my.project.model.BoardVO;

@Repository("BoardDAO")
public class BoardDAOImpl implements BoardDAO{

	@Autowired
	BoardVO boardvo;
	@Override
	public List<BoardVO> getList(boardvo) throws Exception {
		return SqlSession.selectList("com.my.project.model.boardlist",boardvo);
		
	}

}
