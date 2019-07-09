<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="kr">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<title>상품리스트 페이지</title>
<script type="text/javascript">
	function contentView() {
		document.location.href = "/sendView";
	}
	
</script>
</head>
<body>
	<%@include file="../layout/header.jsp"%>
	<div class="container">
		<div class="contents">
			<div class="side_menu">
			<c:choose>
				<c:when test="${number==1000}">
				<ul>
					<li><a href="productList">ALL</a></li>
					<li class="on"><a href="desks">DESKS</a></li>
					<li><a href="shelves">SHELVES</a></li>
					<li><a href="screens">SCREENS</a></li>
					<li><a href="storages">STORAGES</a></li>
					</ul>
				</c:when>
				<c:when test="${number==2000}">
				<ul>
					<li><a href="productList">ALL</a></li>
					<li><a href="desks">DESKS</a></li>
					<li class="on"><a href="shelves">SHELVES</a></li>
					<li><a href="screens">SCREENS</a></li>
					<li><a href="storages">STORAGES</a></li>
					</ul>
				</c:when>
				<c:when test="${number==3000}">
				<ul>
					<li><a href="productList">ALL</a></li>
					<li><a href="desks">DESKS</a></li>
					<li><a href="shelves">SHELVES</a></li>
					<li class="on"><a href="screens">SCREENS</a></li>
					<li><a href="storages">STORAGES</a></li>
					</ul>
				</c:when>
				<c:when test="${number==4000}">
				<ul>
					<li><a href="productList">ALL</a></li>
					<li><a href="desks">DESKS</a></li>
					<li><a href="shelves">SHELVES</a></li>
					<li><a href="screens">SCREENS</a></li>
					<li class="on"><a href="storages">STORAGES</a></li>
					</ul>
				</c:when>
				<c:otherwise>
				<ul>
					<li class="on"><a href="productList">ALL</a></li>
					<li><a href="desks">DESKS</a></li>
					<li><a href="shelves">SHELVES</a></li>
					<li><a href="screens">SCREENS</a></li>
					<li><a href="storages">STORAGES</a></li>
					</ul>
				</c:otherwise>
			</c:choose>
			<!-- 	<ul>
					<li class="on"><a href="productList">ALL</a></li>
					<li><a href="desks">DESKS</a></li>
					<li><a href="shelves">SHELVES</a></li>
					<li><a href="screens">SCREENS</a></li>
					<li><a href="storages">STORAGES</a></li>
				</ul> -->
			</div>
			<!-- //side_menu -->

			<div class="product_list">
				<c:choose>
					<c:when test="${number==1000}">
						<h2>DESKS</h2>
					</c:when>
					<c:when test="${number==2000}">
						<h2>SHELVES</h2>
					</c:when>
					<c:when test="${number==3000}">
						<h2>SCREENS</h2>
					</c:when>
					<c:when test="${number==4000}">
						<h2>STORAGES</h2>
					</c:when>
					<c:otherwise>
						<h2>ALL</h2>
					</c:otherwise>
				</c:choose>
				<ul>
					<c:forEach items="${productBoardAll}" var="dto">
						<li>
						<a href="productView?productBoardNo=${dto.productBoardNo}"><img src="resources/profileImage/${dto.picUrl1}" ></a>
							<p class="tit">
								<a href="productView?productBoardNo=${dto.productBoardNo}"> ${dto.productName} </a>
							</p>
							<p class="price">
								<a href="productView?productBoardNo=${dto.productBoardNo}"> ${dto.productPrice} </a>
							</p></li>
					</c:forEach>
				</ul>
				<c:if test="${member.email != null }">
					<div class="btn_wrap">
						<div class="btn_right">
							<a href="/sendWrite" class="btn btnB">상품등록</a>
						</div>
					</div>
				</c:if>
			</div>
			<!-- //product_list -->
		</div>
		<!-- //contents -->
	</div>
	<!-- //container -->
	<%@include file="../layout/footer.jsp"%>
</body>
</html>