<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>title</title>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
	<script type="text/javascript"	src="${APP_PATH }/static/js/jquery-1.12.4.min.js"></script>
	<link
			href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
			rel="stylesheet">
	<script
			src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js">
	</script>

</head>
<body>
	<!-- 搭建页面 -->
	<div class="container">
		<!-- 标题 -->
		<br/>
		<br/>
		<br/>
		<div class="row">
			<div class="col-md-8">
				<img src="${APP_PATH }/static/images/a.png" alt="" class="img-rounded" >
			</div>
		</div>
		<br/>
		<br/>
		<div class="col-md-8 col-md-offset-5">
			<button id="login" type="button" class="btn btn-success"> 进 入 </button>
		</div>
	</div>

	<script type="text/javascript">
		$("#login").click(function () {
			window.location.href="${APP_PATH}/list";
		});
	</script>

</body>
</html>