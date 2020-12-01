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
		<table class="table table-bordered" >
			<tr>
				<th>글번호</th>
				<th>제목</th>
				<th>글쓴이</th>
				<th>날짜</th>
			</tr>
				<c:forEach var="board" items="${vo}">
					<tr>
						<td>${board.bno}</td>
		 				<td>${board.title}</td>
						<td>${board.content}</td>						
						<td>${board.writer}</td>
						<td>${board.regdate}</td>
						<td>${board.updatedate}</td> 
					</tr>
				</c:forEach> 
		</table>
	</div>
</body>

<script type="javascript">

</script>
</html>