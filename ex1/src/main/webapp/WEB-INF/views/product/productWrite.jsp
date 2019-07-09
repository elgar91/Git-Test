<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script  src="https://code.jquery.com/jquery-latest.js"  ></script>
<script type="text/javascript" src="./resources/editor/js/HuskyEZCreator.js"></script>

<script type="text/javascript">

	$(
	 function(){
		var obj=[];
		//스마트에디터 프레임
		nhn.husky.EZCreator.createInIFrame({
			oAppRef :obj,
			elPlaceHolder:"productContent",
			sSkinURI:"./resources/editor/SmartEditor2Skin.html",
			htParams:{
				// 툴바 사용 여부 (true:사용/ false:사용하지 않음)
				bUseToolbar : true,
				// 모드 탭(Editor | HTML | TEXT) 사용 여부 (true:사용/ false:사용하지 않음)
				bUseModeChanger:true,
				// 입력창 크기 조절바 사용 여부 (true:사용/ false:사용하지 않음)
				bUseVerticalResizer:true,
			}
		});
		
		//$("어디서클릭이 일어나는데").click(클릭이 됬을때 기능구현(){   기능 구현 내용을 나열한다   });
		$("#insertTest").click(function(){ 
			obj.getById["editor"].exec("UPDATE_CONTENTS_FIELD",[]);
			$("#insertTestFrm").submit();
		});
		
	 }
	);
</script>
</head>
<body>
	<%@include file="../layout/header.jsp" %>
	<div class="container">
			<div class="contents">
				<div class="product_write">
					<h2>상품등록</h2>
					<form action="/doProductWrite" method="post" enctype="multipart/form-data">
						<table>
							<colgroup>
								<col width="100px">
								<col width="*">
							</colgroup>
							<tbody>
								<tr>
									<th>상품분류</th>
									<td>
										<select name="productCode">
											<option>분류</option>
											<option value="1000">DESKS</option>
											<option value="2000">SHELVES</option>
											<option value="3000">SCREENS</option>
											<option value="4000">STORAGES</option>
										</select>
									</td>
								</tr>
								<tr>
									<th>닉네임</th>
									<td><input type="text" id="" name="nickName" value="${member.nickname}" readonly="readonly"></td>
								</tr>
								<tr>
									<th>상품명</th>
									<td><input type="text" id="" name="productName"></td>
								</tr>
								<tr>
									<th>가격</th>
									<td><input type="text" id="" name="productPrice"></td>
								</tr>
								<tr>
									<th>상품이미지</th>
									<td class="file_wrap">
										<p><label for="file01">업로드</label><input type="file" id="file01" name="file01"></p>
										<p><label for="file02">업로드</label><input type="file" id="file02" name=""></p>
										<p><label for="file03">업로드</label><input type="file" id="file03" name=""></p>
									</td>
								</tr>
								<tr>
									<th>내용</th>
									<td><textarea name="productContent" id="productContent"></textarea></td>
								</tr>
							</tbody>
						</table>
						<div class="btn_wrap">
							<div class="btn_right">
								<input type="submit" class="btn btnB" value="등록">
								<a href="/productList" class="btn btnW">취소</a>
							</div>
						</div>
					</form>
				</div><!-- //product_write -->
			</div><!-- //contents -->
		</div><!-- //container -->
	<%@include file="../layout/footer.jsp" %>
</body>
</html>