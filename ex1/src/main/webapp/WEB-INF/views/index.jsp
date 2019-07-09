<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%@include file="layout/header.jsp" %>
	 <script>
    $(document).ready(function(){
      $('.main_slider').bxSlider();
    });
  </script>
	<div class="container">
	
			<div class="slider_wrap">
				<ul class="main_slider">
					<li><img src="${path2 }/slider01.png"></li>
					<li><img src="${path2 }/slider02.png"></li>
					<li><img src="${path2 }/slider03.png"></li>
				</ul>
			</div>
			<div class="contents">
				
				<div class="mainProduct">
					<h2>NEW ARRIVAL</h2>
					<ul>
						<c:forEach items="${newProduct}" var="dto">
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
				</div>
			
			</div>
			<!-- //contents -->
		</div>
		<!-- //container -->
		<%@include file="layout/footer.jsp" %>