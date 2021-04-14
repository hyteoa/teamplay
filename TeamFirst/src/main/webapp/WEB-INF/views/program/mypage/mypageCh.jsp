<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>myPage.jsp</title>
<link href="/resources/my/css/mycss.css" rel="stylesheet"
	type="text/css">
<script>
	$(document).ready(function() {
		$("#btnUpdate").click(function(){
			
			if(confirm("수정합니다.")){
				document.form.action = "${path}/mypageMain";
				document.form.submit();
			}
		});
	});

	
	$(document).ready(function() {
		$("#btnDelete").click(function(){
			
			if(confirm("삭제합니다.")){
				document.form.action = "${path}/mypageMain";
				document.form.submit();
			}
		});
	});


</script>
</head>
<body>


	<div align="center">
	<h3>마이페이지</h3>
		
		<span class="text">마이페이지 수정</span>
		<form name="form" method="post">
			<table border="1" width="400px">
				<tr>
					<th>I D</th>
					<td><input name="userID" value="#"></td>
				</tr>
				<tr>
					<th>PASSWORD</th>
					<td><input name="PASSWORD" value="#"></td>
				</tr>
				<tr>
					<th>이름</th>
					<td><input name="userName" value="#"></td>
				</tr>
				<tr>
					<th>멤버십 등급</th>
					<td><input name="membership" value="#"></td>
				</tr>
				<tr>
					<th>이메일</th>
					<td><input name="email" value="#"></td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input type="button" value="수정" id="btnUpdate">
						<input type="button" value="삭제" id="btnDelete">
					</td>
			</table>
		</form>

	

	<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">
						<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">경고</h4>
				</div>
				<div class="modal-body">
					<p>정말 탈퇴 하시겠습니까?</p>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">닫기</button>
					<button type="button" class="btn btn-primary">탈퇴하기</button>
				</div>
			</div>
			<!-- 모달 콘텐츠 -->
		</div>
		<!-- 모달 다이얼로그 -->
	</div>
	<!-- 모달 전체 윈도우 -->

</div>

</body>
</html>