<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <c:set var="path" value="${pageContext.request.contextPath }"></c:set>
    <c:set var="path1" value="${pageContext.request.contextPath }/resources/css"></c:set>
    <c:set var="path2" value="${pageContext.request.contextPath }/resources/images"></c:set>
    <c:set var="path3" value="${pageContext.request.contextPath }/resources/js"></c:set>
    <c:set var="path4" value="${pageContext.request.contextPath }/resources/profileImage"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${path1 }/reset.css" />
<link rel="stylesheet" type="text/css" href="${path1 }/common.css" />
<link rel="stylesheet" type="text/css" href="${path1 }/sub.css" />
<link rel="stylesheet" type="text/css" href="${path1 }/jquery.bxslider.css">
<script src="https://code.jquery.com/jquery-latest.js"></script>
<script src="${path3 }/jquery.bxslider.js"></script>
<script src="${path3 }/run.js"></script>
<script type="text/javascript" src="${path}/resources/ckeditor/ckeditor.js"></script>
</head>
<body>
	<div class="wrap">
		<div class="header">
			<div class="header_top">
				<a href="/"><h1 class="logo">CHAEWON</h1></a>
				<ul class="top_menu">
					<c:choose>
						<c:when test="${member.email == null }">
							<li><a href="/login">로그인</a></li>
							<li><a href="/signUp">회원가입</a></li>
						</c:when>
						<c:otherwise>
							<li class="memberInfo"><a href="#">${member.nickname}</a>님 환영합니다.</li>
							<li><a href="/logout">로그아웃</a></li>
						</c:otherwise>
					</c:choose>
				</ul>
			</div>
			<div class="gnb_wrap">
				<ul class="gnb">
					<li class="dep1_li"><a href="/productList">PRODUCT</a></li>
					<li class="dep1_li"><a href="/reviewList">REVIEW</a></li>
				</ul>
			</div>
		</div><!-- //header -->
