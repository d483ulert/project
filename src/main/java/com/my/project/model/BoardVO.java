package com.my.project.model;
import java.util.Date;
import lombok.Data;

@Data
public class BoardVO {

	private  int bno;
	private  String title;
	private  String content;
	private  String writer;
	private  String regdate;
	private  String updatedate;
}
