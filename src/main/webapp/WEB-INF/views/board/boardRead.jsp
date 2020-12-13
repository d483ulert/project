<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="/resources/css/bootstrap.css"/>
<title>BOARD</title>
</head>
<body>
	<div class="container">
		<nav class="navbar navbar-light" style="background-color: #e3f2fd;">
			<a class="navbar-brand" href="/board/list">공지사항</a>		
			<a class="navbar-brand" href="#">Navbar</a>		
			<a class="navbar-brand" href="#">Navbar</a>		
			<a class="navbar-brand" href="#">Navbar</a>	
		</nav>
	</div><br>
	<div class="container">
		<table class="table table-bordered" >
			<tr>
				<th>제목</th>
				<th>글쓴이</th>
				<th>시간</th>
				<th>내용</th>
				<th>조회수</th>
				<th>추천수</th>
			</tr>
				<tr>
					<td>${board.title}</td>
					<td>${board.writer}</td>						
					<td>${board.regdate}</td>
					<td>${board.content}</td>
					<td>${board.recommend}</td>
					<td>${board.inquiry} </td> 
				</tr>
		</table>
	</div>
	<div class="container">
		<button type="button" class="btn float-right btn-outline-secondary" id="update" style="margin-left:20px">수정</button>
		<button type="button" class="btn float-right btn-outline-secondary" id="recommend">추천</button>
	</div>
</body>
</html>