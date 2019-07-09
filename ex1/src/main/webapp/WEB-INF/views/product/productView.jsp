<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function removeCheck(){
	return confirm("삭제하시겠습니까?");
}
</script>
</head>
<body>
	<%@include file="../layout/header.jsp" %>
	
	<div class="container">
			<div class="contents">
				<div class="product_view">
					<div class="p_info">
						<div class="img">
							<ul>
								<li><img src="resources/profileImage/${dto.picUrl1}"></li>
								<li><img src="${path2}/sample01.png"></li>
								<li><img src="${path2}/sample01.png"></li>
							</ul>
						</div>
						<div class="txt">
							<p name="productBoardNo" hidden="true">${dto.productBoardNo}</p>
							<p name="nickName" hidden="true">${dto.nickName}</p>						
							<p name="title" class="tit">${dto.productName}</p>
							<p name="productPrice" class="price"><span>${dto.productPrice}</span></p>
							<p name="num" class="num"><span>수량</span>1</p>
							<span class="msg">* 한 계정당 1개의 상품만 구매 가능합니다.</span>
						</div>
						<div class="btn_wrap">
							<c:choose>
								<c:when test="${member.nickname != dto.nickName}">
									<a href="/sendOrder?productBoardNo=${dto.productBoardNo }&nickName=${dto.nickName}" class="btn btnBb">구매하기</a>
								</c:when>
								<c:otherwise>
									<a href="productModify?productBoardNo=${dto.productBoardNo}" class="btn btnBb fl">수정</a>
									<a href="productDelete?productBoardNo=${dto.productBoardNo}" class="btn btnBb fr" onclick="return removeCheck()">삭제</a>
									<a href="productList" class="btn btnBb fr">목록</a>
								</c:otherwise>
							</c:choose>
						</div>
					</div>
					<div class="dotted"><p>DETAIL</p></div>
					<div class="p_detail">
						${dto.productContent}
						<%-- <img src="${path2}/detail01.jpg">
						<img src="${path2}/detail02.jpg">
						<img src="${path2}/detail03.png"> --%>
					</div>
				</div><!-- //product_view -->
			</div><!-- //contents -->
		</div><!-- //container -->
	<%@include file="../layout/footer.jsp" %>
</body>
</html>