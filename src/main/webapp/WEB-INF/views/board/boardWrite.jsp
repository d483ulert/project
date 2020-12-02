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
		<form class="text-center" method="post" >
			<label for="exampleFormControlInput1">제목</label>
			<input type="text" name="title" required style="width:820px;">
			<label for="exampleFormControlInput1">작성자</label>
			<input type="text" name="writer" width="30" required>
			<textarea class="textarea" name="content" rows="20" cols="155"></textarea><br>
			<button type="submit" class="btn float-right btn-outline-secondary">등록</button>
		</form>
	</div>
</body>  
<script type="javascript">

</script>
</html>