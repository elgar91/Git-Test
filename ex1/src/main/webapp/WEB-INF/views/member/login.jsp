<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript">
	function goSignUp(){
		location.href="signUp"
	}
</script>
</head>
<body>
	<%@include file="../layout/header.jsp" %>
	<div class="container">
			<div class="contents">
				<div class="login">
					<form action="doLogin" method="post">
						<h2>로그인</h2>
						<table>
							<colgroup>
								<col width="100px">
								<col width="*">
							</colgroup>
							<tbody>
								<tr>
									<th>이메일</th>
									<td><input type="text" id="email" name="email"></td>
								</tr>
								<tr>
									<th>비밀번호</th>
									<td><input type="password" id="password" name="password"></td>
								</tr>
							</tbody>
						</table>
						<div class="btn_wrap">
							<div class="btn_right">
								<input type="submit" class="btn btnB" value="로그인">
								<a href="javascript:goSignUp()" class="btn btnW">회원가입</a>
							</div>
						</div>
					</form>
				</div><!-- //login -->
			</div><!-- //contents -->
		</div><!-- //container -->
	<%@include file="../layout/footer.jsp" %>
</body>
</html>