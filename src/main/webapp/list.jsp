<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>列表页</title>
	<style>
		.col-center-block {
			float: none;
			display: block;
			margin-left: auto;
			margin-right: auto;
		}
		table tr{border: 2px solid #EDEDED}
		.blue{color: #63B8FF; }
		.green{color: #32CD32; }
		.red{color: #FF3030; }
		.myevalList{
			text-align: center;
		}
		.col-md-4{
			margin-left:96.67%;
		}
		#add_btn{
			margin-bottom:-19px;
		}
		body{
			overflow:hidden;
		}
		.row{
			margin-left:10px;
		}

	</style>
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
<!-- 搭建显示页面 -->
<div class="container col-center-block">
	<!-- 标题 -->
	<br/>
	<div class="row">
		<div class="col-md-12">
			<img src="${APP_PATH }/static/images/a.png" alt="" class="img-rounded" width="100%" height="200" >
		</div>
	</div>
	<br/>
	<!-- 按钮 -->
	<div class="row">
		<div class="col-md-4 col-md-offset-11">
			<button class="btn btn-primary" id="add_btn">新增</button>
		</div>
	</div>
	<br/>
	<!-- 显示表格数据 -->
	<div class="row">
		<div class="col-md-12 col-center-block">
			<table class="table table-hover" id="eval_table">
				<thead class="myevalList">
				<tr>
					<th>&nbsp;&nbsp;城市</th>
					<th>众创空<br>间数量</th>
					<th>年GDP</th>
					<th>风险投资<br>公司数量</th>
					<th>融资1000万<br>以上企业数量</th>
					<th>高校数量</th>
					<th>科技活动<br>人员数量</th>
					<th>或省政府政<br>策支持度</th>
					<th>文化环境、<br>创业热度</th>
					<th>公共基础<br>设施情况</th>
					<th>人均公共<br>绿地面积</th>
					<th>综合分值</th>
					<th>&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;
						操作</th>
				</tr>
				</thead>
				<tbody class="myevalList">
					<c:forEach items="${pageInfo.list}" var="eval">
						<tr>
							<td>${eval.city}</td>
							<td>${eval.spaceNum}</td>
							<td>${eval.gdp}</td>
							<td>${eval.companyNum}</td>
							<td>${eval.superCompanyNum}</td>
							<td>${eval.schoolNum}</td>
							<td>${eval.peopleNum}</td>
							<td>${eval.support}</td>
							<td>${eval.fever}</td>
							<td>${eval.facilities}</td>
							<td>${eval.area}</td>
							<td>${eval.score}</td>
							<td>
								<button id="edit_btn" class="blue" onclick="edit('${eval.id}')"><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span></button>
								<button id="view_btn"  class="green" onclick="viewScore('${eval.id}')"><span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span></button>
								<button id="del_btn" class="red" onclick="del('${eval.id}','${eval.city}')"><span class="glyphicon glyphicon-trash" aria-hidden="true"></span></button>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<!-- 分页条  -->
			<nav aria-label="Page navigation" class="col-md-offset-10">
				<ul class="pagination">
					<li><a href="${APP_PATH}/list?pn=1" >首页</a></li>
					<c:if test="${pageInfo.hasPreviousPage}">
						<li>
							<a href="${APP_PATH}/list?pn=${pageInfo.pageNum-1}" aria-label="Previous">
								<span aria-hidden="true">&laquo;</span>
							</a>
						</li>
					</c:if>

					<c:forEach items="${pageInfo.navigatepageNums}" var="page_Num">
						<c:if test="${page_Num == pageInfo.pageNum}">
							<li class="active"><a href="#">${page_Num}</a></li>
						</c:if>
						<c:if test="${page_Num != pageInfo.pageNum}">
							<li><a href="${APP_PATH}/list?pn=${page_Num}">${page_Num}</a></li>
						</c:if>
					</c:forEach>

					<c:if test="${pageInfo.hasNextPage}">
						<li>
							<a href="${APP_PATH}/list?pn=${pageInfo.pageNum+1}" aria-label="Next">
								<span aria-hidden="true">&raquo;</span>
							</a>
						</li>
					</c:if>

					<li><a href="${APP_PATH}/list?pn=${pageInfo.pages}">末页</a></li>
				</ul>
			</nav>
		</div>
	</div>
</div>
<%-----------------------------------------------------------------------------------%>

	<script type="text/javascript">
		// 点击新增按钮，进入新增页面
		$("#add_btn").click(function () {
			window.location.href="${APP_PATH}/add";
		});
		// 点击编辑按钮，进入新增页面
		function edit(id){
			window.location.href="${APP_PATH}/edit?id="+id;
		}

		function viewScore(id){
			window.location.href="${APP_PATH}/view?score="+id;
		}

		function del(id,name){
			if(confirm("确认删除【"+name+"】吗？")){
				$.ajax({
					url:"${APP_PATH}/delete?id="+id,
					type:'GET',
					success:function () {
						window.location.reload();
					}
				});
			}
		}
	</script>
</body>
</html>