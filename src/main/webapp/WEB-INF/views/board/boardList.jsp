<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

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
			<tr style="text-align:center;">
				<th>글번호</th>
				<th>제목</th>
				<th>글쓴이</th>
				<th>등록일</th>
				<th>최종수정</th>
			</tr>
				<c:forEach var="board" items="${vo}">
					<tr style="text-align:center;">
						<td width="20%">${board.bno}</td>
		 				<td width="50%"><a href="/board/write"></a>${board.title}</td>
						<td width="10%">${board.writer}</td>
						<td width="10%">${board.regdate}</td>
						<td width="10%">${board.updatedate}</td> 
					</tr>
				</c:forEach> 
		</table>
	</div>
	<div class="container">
		<div class="container-fluid full-width">
			<button type="button" class="btn float-right btn-outline-secondary"><a href="/board/write">글쓰기</a></button>
		</div>
	</div>

</body>

<script type="javascript">

</script>
</html>