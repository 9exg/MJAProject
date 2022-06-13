<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>main</title>

<!-- 헤더추가 -->
<c:import url="common/header"></c:import>
<style type="text/css">
/* 가로 사이즈 조정용 */
.cont_wrap {
	width: 900px;
}

/* 개인 작업 영역 */
</style>
</head>
<body>
	
	<!--======= top =======-->
	<div class="top_area">
		<!-- logo area -->
		<div class="logoWarp">
			<div class="logo">lo</div>
		</div>
		
		<!-- search area -->
		<div class="srchWrap">
			<div class="srchBox">
				<div class="srchBtn">srch</div>
			</div>
		</div>
		
		<!-- navigation area -->
		<div class="naviWrap">
			<div class="homeBtn">ho</div>
			<div class="addFeedBtn">ad</div>
			<div class="myPageBtn">my</div>
		</div>
	</div>	
	
	<!--======= left =======-->
	<!-- Left blank Menu -->
	<div class="left_area">l</div>
	
	
	<!--======= center =======-->
	<!-- Center contents Area -->
	<div class="center_area">c</div>
	
	
	<!--======= right =======-->
	<!-- right blank Menu -->
	<div class="right_area">R</div>
	
</body>
</html>