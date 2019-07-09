<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>리뷰 수정</title>
</head>
<body>
	<%@include file="../layout/header.jsp" %>
	<c:set var="path" value="${pageContext.request.contextPath}" />
	<link type="text/css" href="${path}/resources/css/headStyle.css" rel="stylesheet">
	<link href="http://netdna.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.css" rel="stylesheet">

	<script src="http://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.js"></script>
	<script src="http://netdna.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.js"></script>
	<script src="${path}/resources/summernote/summernote.js"></script>
	<link href="${path}/resources/summernote/summernote.css" rel="stylesheet">
	<script type="text/javascript">
	$(function(){
	     $('#reviewContent').summernote();
	});
	</script>
	<div class="container">
			<div class="contents">
				<div class="product_write">
					<h2>상품후기</h2>
					<form action="doWrite" id="doWriteForm" method="post">
					
						<table>
							<colgroup>
								<col width="100px">
								<col width="*">
							</colgroup>
							<tbody>
								<tr>
									<th>제목</th>
									<td><input type="text" id="title" name="title"></td>
								</tr>
								<tr>
									<th>작성자</th>
									<td><input type="text" id="nickname" name="nickname" value="${member.nickname }" readonly ></td>
								</tr>
								<tr>
									<th>내용</th>
									<td><textarea name="reviewContent" id="reviewContent">기본입력값</textarea></td>
								</tr>
							</tbody>
						</table>
						<div class="btn_wrap">
							<div class="btn_right">
								<input type="submit" id="doWrite" class="btn btnB" value="등록">
								<a href="#" class="btn btnW" onclick="history.go(-1); return false;">취소</a>
							</div>
						</div>
					</form>
				</div><!-- //product_write -->
			</div><!-- //contents -->
		</div><!-- //container -->
	<%@include file="../layout/footer.jsp" %>
</body>
</html>