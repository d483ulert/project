package com.my.project.model;

import java.util.Date;

import lombok.Data;

@Data
public class BoardVO {

	private  String bno;
	private  String title;
	private  String content;
	private  String writer;
	private  Date regdate;
	private  Date updatedate;
}
