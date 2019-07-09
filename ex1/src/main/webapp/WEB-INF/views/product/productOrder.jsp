<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@include file="../layout/header.jsp" %>
	<div class="container">
			<div class="contents">
				<div class="product_order">
					<h2>주문서 작성</h2>
					<div class="order_info">
						<table>
							<colgroup>
								<col width="150px">
								<col width="*">
								<col width="150px">
								<col width="150px">
							</colgroup>
							<thead>
								<tr>
									<th>상품정보</th>
									<th>상품명</th>
									<th>수량</th>
									<th>가격</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td class="img"><img src="${path2 }/sample01.png"></td>
									<td class="tit">COMPUTER DESK 1800*700</td>
									<td class="count">1개</td>
									<td class="price">79,000 won</td>
								</tr>
							</tbody>
						</table>
					</div>
					<div class="order_wrap">
						<div>
							<form>
								<table>
									<colgroup>
										<col width="150px">
										<col width="*">
									</colgroup>
									<tbody>
										<tr>
											<th colspan="2" class="tit">1.주문자 정보</th>
										</tr>
										<tr>
											<th>주문하시는 분</th>
											<td><input type="text" id="nickName" name="nickName" value=${productOrderInfodtos.nickName}></td>
										</tr>
										<tr>
											<th>이메일</th>
											<td><input type="text" id="email" name="email" value=${productOrderInfodtos.email}></td>
										</tr>
										<tr>
											<th>휴대전화</th>
											<td>
												<input type="text" id="tel" name="tel" value=${productOrderInfodtos.tel}>
											</td>
										</tr>
										<tr> 
											<th colspan="2" class="tit">2.배송지 정보<!-- <span class="address_chk"><input type="checkbox" id="chk1" name="chk1"><label for="chk1">주문자 정보와 동일</label></span> --></th>
										</tr>
										<tr>
											<th>받으시는 분</th>
											<td><input type="text" id="" name=""></td>
										</tr>
										<!-- <tr>
											<th>주소</th>
											<td class="address">
												<p><input type="text" id="" name="" class="100w" readonly><a href="#" class="btn btnB">우편번호 찾기</a></p>
												<p><input type="text" id="" name="" class="250w" readonly><input type="text" id="" name="" class="250w"></p>
											</td>
										</tr> -->
										<tr>
											<th>이메일</th>
											<td><input type="text" id="" name=""></td>
										</tr>
										<tr>
											<th>휴대전화</th>
											<td>
												<input type="text" id="" name="">
											</td>
										</tr>
										<tr>
											<th>배송요청사항</th>
											<td><textarea></textarea></td>
										</tr>
									</tbody>
								</table>
								<div class="btn_wrap">
									<div class="btn_right">
										<a href="productList" class="btn btnW">취소</a>
										<input type="submit" value="결제하기" class="btn btnB">
									</div>
								</div>
							</form>
						</div>
					</div>
				</div><!-- //product_order -->
			</div><!-- //contents -->
		</div><!-- //container -->
	<%@include file="../layout/footer.jsp" %>
</body>
</html>