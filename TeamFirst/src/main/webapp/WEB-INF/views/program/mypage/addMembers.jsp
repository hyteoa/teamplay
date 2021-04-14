<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>addMembers</title>
</head>
<body>
<div  align="center">
	<h2>멤버십 추가</h2>
	<table border="1">
		<tr>
			<th>멤버십 등급</th>
			<td><input  type="checkbox" checked>실버</td>
		</tr>
		<tr>
			<th>기 간</th>
			<td>
				<select>
					<option>기간선택</option>
					<option>1개월</option>
					<option>2개월</option>
					<option>3개월</option>
				</select>
			</td>
		</tr>
		<tr>
			<th>현재 포인트</th>
			<td><input value="3000p"></td>
		</tr>
		<tr>
			<th>사용할 포인트</th>
			<td><input value="0p"></td>
		</tr>
		<tr>
			<th>총 금액</th>
			<td><input value="0원"></td>
		</tr>
		<tr>
			<th>적립예정금액</th>
			<td><input value="100p"></td>
		</tr>
	</table>
	<button>결제하기</button>
</div>
</body>
</html>