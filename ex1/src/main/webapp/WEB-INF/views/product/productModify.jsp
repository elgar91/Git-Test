<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<title>상품등록 페이지</title>
</head>
<body>
	<%@include file="../layout/header.jsp"%>
	<c:set var="path" value="${pageContext.request.contextPath}" />
	<script type="text/javascript"
		src="${path}/resources/ckeditor/ckeditor.js"></script>
	<div class="container">
		<div class="contents">
			<div class="product_write">
				<h2>상품수정</h2>
				<form action="productModifySuccess" method="post">
					<input type="hidden" name="productBoardNo" value="${dto.productBoardNo}">
					<table>
						<colgroup>
							<col width="100px">
							<col width="*">
						</colgroup>
						<tbody>
							<tr>
								<th>상품분류</th>
								<c:choose>
								<c:when test="${dto.productCode==1000}">
								<td><select>
										<option>분류</option>
										<option selected="selected" value="1000">DESKS</option>
										<option value="2000">SHELVES</option>
										<option value="3000">SCREENS</option>
										<option value="4000">STORAGES</option>
								</select></td>
								</c:when>
								
								<c:when test="${dto.productCode==2000}">
								<td><select>
										<option>분류</option>
										<option value="1000">DESKS</option>
										<option selected="selected" value="2000">SHELVES</option>
										<option value="3000">SCREENS</option>
										<option value="4000">STORAGES</option>
								</select></td>
								</c:when>
								
								<c:when test="${dto.productCode==3000}">
								<td><select>
										<option>분류</option>
										<option value="1000">DESKS</option>
										<option value="2000">SHELVES</option>
										<option selected="selected" value="3000">SCREENS</option>
										<option value="4000">STORAGES</option>
								</select></td>
								</c:when>
								
								<c:when test="${dto.productCode==4000}">
								<td><select>
										<option>분류</option>
										<option value="1000">DESKS</option>
										<option value="2000">SHELVES</option>
										<option value="3000">SCREENS</option>
										<option selected="selected" value="4000">STORAGES</option>
								</select></td>
								</c:when>
								</c:choose>
							</tr>
							<tr>							
								<th>제목</th>
								<td><input type="text" id="title" name="title" value="${dto.title}"></td>
							</tr>
							<tr>
								<th>상품명</th>
								<td><input type="text" id="productName" name="productName" value="${dto.productName}"></td>
							</tr>
							<tr>
								<th>가격</th>
								<td><input type="text" id="productPrice" name="productPrice" value="${dto.productPrice}" ></td>
							</tr>
							<tr>
								<th>상품이미지</th>
								<td class="file_wrap">
									<p>
										<label for="file01">업로드</label><input type="file" id="file01"
											name="">
									</p>
									<p>
										<label for="file02">업로드</label><input type="file" id="file02"
											name="">
									</p>
									<p>
										<label for="file03">업로드</label><input type="file" id="file03"
											name="">
									</p>
								</td>
							</tr>
							<tr>
								<th>내용</th>
								<td><textarea name="productContent" id="productContent">${dto.productContent}</textarea>
									<script>
										CKEDITOR.replace("productContent")
									</script></td>
							</tr>
						</tbody>
					</table>
					<div class="btn_wrap">
						<div class="btn_right">
							<input type="submit" id="productModifySuccess" class="btn btnB" value="상품수정">
							<a href="productView?productBoardNo=${dto.productBoardNo}" class="btn btnW">취소</a>
						</div>
					</div>
				</form>
			</div>
			<!-- //product_write -->
		</div>
		<!-- //contents -->
	</div>
	<!-- //container -->
	<%@include file="../layout/footer.jsp"%>
</body>
</html>