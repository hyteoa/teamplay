<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>refundMembers</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/js/bootstrap.min.js"></script>

<script>

  $('#myModal').on('shown.bs.modal', function () {
  $('#myInput').trigger('focus')

  
})
</script>
</head>
<body>
<div id="root" align="center">
	<h2>환불하기</h2>
	<table border="1">
		<tr>
			<th>취소하는 멤버십</th>
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
			<th>환불예상 포인트</th>
			<td><input value="1000p"></td>
		</tr>
		<tr>
			<th>총 금액</th>
			<td><input value="0원"></td>
		</tr>
	</table><br>
	



<!-- Button trigger modal -->
<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">
 환불하기
</button>

<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">환불창</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        정말 환불하시겠습니까?
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-primary">환불하기</button>
        <button type="button" class="btn btn-secondary" data-dismiss="modal">취소</button>
      </div>
    </div>
  </div>
</div>

</body>
</html>