<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품후기</title>
</head>
<body>
	<%@include file="../layout/header.jsp" %>
	<div class="container">
			<div class="contents">
				<div class="product_write">
					<h2>상품후기</h2>
					<form action="reviewView" method="get">
					<input type="hidden" name="boardNo" value="${dto.boardNo}">
						<table>
							<colgroup>
								<col width="100px">
								<col width="*">
							</colgroup>
							<tbody>
								<tr>
									<th>제목</th>
									<td>${dto.title}</td>
								</tr>
								<tr>
									<th>작성자</th>
									<td>${dto.nickname}</td>
								</tr>
								<tr>
									<th>내용</th>
									<td>${dto.reviewContent}</td>
								</tr>
								
							</tbody>
						</table>
						
						<div class="btn_wrap">
							<div class="btn_right">
								<!-- 
								<input type="submit" class="btn btnB" value="수정">
								<a href="reviewList" class="btn btnW">목록</a>
								 -->
								<c:choose>
									<c:when test="${member.email != null && member.nickname == dto.nickname}"> 
								<a href="reviewModify?boardNo=${dto.boardNo}"><input type="button" class="btn btnB" value="수정"></a>
								<a href="reviewDeleteSuccess?boardNo=${dto.boardNo }"><input type="button" class="goDelete" value="삭제"></a>
								<a href="reviewList" class="btn btnW">목록</a>	
									</c:when>
									<c:otherwise>
								<a href="reviewList" class="btn btnW">목록</a>
									</c:otherwise>
								</c:choose><br>
								<!-- <input type="text" value="댓글을 입력하세요">
								<input type="submit" value="답글달기">-->
							</div>
						</div>
					</form>
					<div class="reply_wrap">
						<div class="reply_form">
							<dl>
								<form action="commentWrite" method="post">
									<fieldset>
										<dt class="name reply">${member.nickname }</dt>
										<input type="hidden" value="${dto.boardNo } " name="boardNo">
										<input type="hidden" value="${member.nickname }" name="nickname">
										<dd class="text">
											
											<c:if test="${member.email == null }">
											<div>
												<textarea name="reviewCommentContent"></textarea>
											</div>	
												<a href="#" class="doComment">댓글작성</a>
												
											</c:if>
											<c:if test="${member.email != null }">
											<div>
											<textarea name="reviewCommentContent"></textarea>
											</div>
												<input type="submit" value="댓글작성">
											</c:if>
										</dd>
									</fieldset>
								</form>
							</dl>
						</div>
	
						<div class="reply_list">
							<c:forEach items="${reviewCommentAll}" var="commentDto">
							<dl class="list">
							<dt class="name">
								<div class="left">
									${commentDto.nickname} <span>${commentDto.dateTime}</span>
								</div>
								<div class="right">
								<c:choose>
									<c:when test="${(member.email) != null && (member.nickname == commentDto.nickname)}">
										<a href="commentDeleteSuccess?boardNo=${dto.boardNo }" class="btn_reply_white goCommentDelete">삭제</a>
										<a href="#" class="btn_reply_white">수정</a>
									</c:when>
								</c:choose>
								</div>
							</dt>
							<dd class="text">
								${commentDto.reviewCommentContent}
							</dd>
						</dl>
						</c:forEach>
					</div>
				</div>
					
				</div><!-- //product_write -->
			</div><!-- //contents -->
		</div><!-- //container -->
		<script type="text/javascript">
			$(function() {
				$(".goDelete").click(function() {
				alert('정말 삭제하시겠습니까?');
					location.href="/reviewList";
				});
				
			});
			
			$(function () {
				$(".goCommentDelete").click(function() {
				alert('댓글을 정말 삭제하시겠습니까?');
					location.href="/reviewView";
				});
			});
			
			$(function () {
				$(".doComment").click(function(){
					alert('로그인 하셔야 댓글을 작성할 수 있습니다.');
						location.href="/login"
				});
				
			});
			
		</script>
	<%@include file="../layout/footer.jsp" %>
</body>
</html>