<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>分数页</title>

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
	<style>
		.col-center-block {
			float: none;
			display: block;
			margin-left: auto;
			margin-right: auto;
		}
		.col-sm-11{
			padding-right:0px;
			padding-left:0px;
		}
		.col-sm-3{
			padding-right:6px;
		}
		.inner{
			display: inline;
		}
	</style>
</head>
<body>
	<!-- 搭建页面 -->
	<div class="container container col-center-block">
		<!-- 标题 -->
		<br/>
		<div class="row ">
			<div class="col-md-9">
				<img src="${APP_PATH }/static/images/a.png" alt="" class="img-rounded" width="1130" height="200" >
			</div>
		</div>
		<br/>
		<div class="row">
		<form class="col-center-block  form-horizontal">
			<div class="panel panel-default col-sm-11 col-center-block">
				<div class="panel-heading">综合分值</div>
				<div class="panel-body">
					<div class="form-group">
						<label for="exampleInputName2" class="col-sm-3 control-label">综合分值</label>
						<div class="col-sm-5 inner">
							<input type="email" class="form-control " id="exampleInputName2" placeholder="综合分值" value="${score}">
						</div>
						<p class="form-control-static">（示例：0-100格式为数字取整数）</p>
					</div>
					<div class="col-sm-5 col-center-block">
						<p class="form-control-static">  注：0-33分为困难；34-66分为适中；67-100为适宜。</p>
					</div>

				</div>
			</div>
		</form>
			</div>
		<br/>
		<br/>
		<div class="col-md-8 col-md-offset-5">
			<button id="list_btn" type="button" class="btn btn-success"> 返回首页 </button>
		</div>
	</div>

	<script type="text/javascript">
		$("#list_btn").click(function () {
			window.location.href="${APP_PATH}/list";
		});
	</script>

</body>
</html>