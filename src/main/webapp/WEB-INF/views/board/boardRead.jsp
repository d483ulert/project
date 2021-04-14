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
<script src="/resources/js/jquery-1.7.2.min.js"></script>

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
				<td colspan="4" width="50%">${board.title}</td>
			</tr>
			<tr>				
				<td width="10%"><span>작성자: </span>${board.writer}</td>
				<td width="10%">${board.regdate}</td>
				<td width="10%"><span>조회    </span>${board.inview}</td>
				<td width="10%"><span>추천     </span>${board.recommend}</td>
			</tr>
			<tr>
				<td colspan="5" style="width:200px;">${board.content}</td>
			</tr>
			
		</table>
		
	</div>
	<div class="container">
		<button type="button" class="btn float-right btn-outline-secondary" id="delete" style="margin-left:10px">삭제</button>
		<button type="button" class="btn float-right btn-outline-secondary" id="update" style="margin-left:10px">수정</button>
		<button type="button" class="btn float-right btn-outline-secondary" name="recommend" id="recommend" style="margin-left:10px" value="0">추천</button>
		<button type="button" class="btn float-left btn-outline-secondary" id="list" style="margin-left:10px">목록</button>
		<button type="button" class="btn float-right btn-outline-secondary" id="comend">답글쓰기</button>
	</div>
</body>

<script>
	$('#list').click(function(){
		location.href="/board/list";
	});
	
	$('#delete').click(function(){
		var cf = confirm("삭제하시겠습니까?");
		if(cf){
			location.href='${cp}/board/delete?bno=${board.bno}';
		}
	});
	
	$('#update').click(function(){
		var cf = confirm("수정하시겠습니까?");
		if(cf){
			location.href='${cp}/board/update?bno=${board.bno}';
		}
	});
	 $('#recommend').click(function(){
		var cf = confirm("추천하시겠습니까?");
		if(cf){
			recommend();	
		}
	});
	
	function recommend(){
		var bnoData= {
				recommend:$('#recommend').val(),
		};
		$.ajax({
			type:'post',
			url:'${cp}/board/recommend',
			data:bnoData,
			datatype:'json',
			success:function(){
				alert("추천되었습니다.");
			}
		});
	}; 
</script>
</html>