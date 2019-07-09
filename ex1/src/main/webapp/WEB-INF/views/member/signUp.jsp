<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%@include file="../layout/header.jsp" %>
	<script type="text/javascript">
		function formChk(){
			var re = /^[a-zA-Z0-9]{4,12}$/; // 아이디와 패스워드가 적합한지 검사할 정규식
			
	        var password = document.getElementById("password");
	        var passwordCheck = document.getElementById("passwordCheck");
	        var nickname = document.getElementById("nickname");
	        var tel = document.getElementById("tel");
	        
	        
	        
	        if(!check(re,password,"패스워드는 4~12자의 영문 대소문자와 숫자로만 입력")) {
	            return false;
	        }
	        
	        if(signup.password.value != signup.passwordCheck.value) {
	            alert("비밀번호가 다릅니다. 다시 확인해 주세요.");
	            signup.passwordCheck.value = "";
	            signup.passwordCheck.focus();
	            return false;
	        }
	        
	        if(signup.nickname.value=="") {
	            alert("닉네임을 입력해 주세요");
	            signup.nickname.focus();
	            return false;
	        }
	        
	        if(signup.tel.value=="") {
	            alert("전화번호를 입력해 주세요");
	            signup.tel.focus();
	            return false;
	        }
	        
	        alert("회원가입이 완료되었습니다.");
	       
		}
		
		function check(re, what, message) {
		       if(re.test(what.value)) {
		           return true;
		       }
		       alert(message);
		       what.value = "";
		       what.focus();
		       //return false;
		   }
		
		$(function(){
			$("#emailChk").click(function(){
				var email1 = $("#email").val();
				
				var re2 = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;
			       // 이메일이 적합한지 검사할 정규식
			       
				var email2 = document.getElementById("email");
				
				if(email2.value=="") {
		            alert("이메일을 입력해 주세요");
		            email2.focus();
		            return false;
		        }

		        if(!check(re2, email2, "적합하지 않은 이메일 형식입니다.")) {
		            return false;
		        }
				
				$.ajax({
					type : 'POST',
					url : "emailCheck.do",
					data : "email="+email1,
					success : function(result){
						//alert(result);
						if(result == "true"){
							alert("이메일이 존재합니다. 다른 이메일을 입력해주세요.");
							$("#email").focus();
						}else{
							 alert("사용가능한 이메일입니다.");
						}
				}
				});
			});
		});
		
	</script>
	<div class="container">
			<div class="contents">
				<div class="signup">
					<h2>회원가입</h2>
					<form onsubmit="return formChk();" action="doSignUp" method="post" name="signup"> <!-- //action="doSignUp" -->
						<table>
							<colgroup>
								<col width="100px">
								<col width="*">
							</colgroup>
							<tbody>
								<tr>
									<th>이메일</th>
									<td>
										<input type="text" id="email" name="email" />
										<a href="#" id="emailChk" class="btn btnB">중복확인</a>
									</td>
								</tr>
								<tr>
									<th>비밀번호</th>
									<td>
										<input type="password" id="password" name="password"/>
									</td>
								</tr>
								<tr>
									<th>비밀번호 확인</th>
									<td>
										<input type="password" id="passwordCheck" name="passwordCheck"/>
									</td>
								</tr>
								<tr>
									<th>닉네임</th>
									<td>
										<input type="text" id="nickname" name="nickname"/>
									</td>
								</tr>
								<tr>
									<th>휴대전화</th>
									<td>
											<input type="text" id="tel" name="tel"/>
									</td>
								</tr>
							</tbody>
						</table>
						<div class="btn_wrap">
							<div class="btn_right">
								<input type="submit" class="btn btnB" value="가입하기">
								<a href="#" class="btn btnW">취소</a>
							</div>
						</div>
					</form>
				</div><!-- //signup -->
			</div><!-- //contents -->
		</div><!-- //container -->
	<%@include file="../layout/footer.jsp" %>