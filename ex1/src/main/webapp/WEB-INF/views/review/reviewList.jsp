<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>리뷰리스트</title>
<!--
<script>	
	document.getElementById('reviewWrite').onclick = function() {
		document.reviewWriteForm.action = "reviewWrite";
		document.reviewWriteForm.method = "post";
		document.reviewWriteForm.submit();
	}
</script>
-->
<script>
	function reviewWrite() {
		document.reviewWriteForm.action = "reviewWrite";
		document.reviewWriteForm.method = "post";
		document.reviewWriteForm.submit();
	}
</script>
</head>
<body>
	<%@include file="../layout/header.jsp"%>
	<div class="container">
		<div class="contents">
			<div class="review_list">
				<h2>상품후기</h2>
				<table>
					<colgroup>
						<col width="50px">
						<col width="*">
						<col width="100px">
						<col width="100px">
					</colgroup>
					<thead>
						<tr>
							<th>번호</th>
							<th>제목</th>
							<th>작성자</th>
							<th>날짜</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${reviewBoardAll}" var="dto">
							<tr>
								<td>${dto.boardNo}</td>
								<td class="tit">
									<div>
										<img alt="" src=""><a href="reviewView?boardNo=${dto.boardNo}" >${dto.title }</a>
									</div>
								</td>
								<td>${dto.nickname}</td>
								<td>${dto.dateTime}</td>
							<tr>
						</c:forEach>
					</tbody>
				</table>
				<form name="reviewWriteForm">
					<div class="btn_wrap">
						<div class="btn_right">
						<c:if test="${member.email == null }">
							<a href="#" class="btn btnB goLogin">글쓰기</a>
						</c:if>
						<c:if test="${member.email != null }">
							<a href="#" class="btn btnB " onclick="reviewWrite();">글쓰기</a>
						</c:if>
						</div>
					</div>
				</form>
			</div>
			<!-- //review_list -->
		</div>
		<!-- //contents -->
	</div>
	<!-- //container -->
	<script type="text/javascript">
		$(function() {
			$(".goLogin").click(function() {
			alert('로그인하셔야합니다.');
				location.href="/login";
			});
			
		});
	</script>
	<%@include file="../layout/footer.jsp"%>
</body>
</html>