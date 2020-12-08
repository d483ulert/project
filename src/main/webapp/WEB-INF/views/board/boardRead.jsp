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
			</tr>
			<c:forEach var="board" items="${vo}">
				<tr>
					<td>${board.title}</td>
					<td>${board.writer}</td>						
					<td>${board.regdate}</td>
					<td>${board.content}</td>
				</tr>
			</c:forEach> 
		</table>
	</div>
</body>
</html>