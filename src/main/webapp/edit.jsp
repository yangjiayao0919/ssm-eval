<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新增页</title>

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
		td{
			text-align: center;
		}
	</style>
</head>
<body style="width:100%">
	<!-- 搭建页面 -->
	<div class="container col-center-block">
		<!-- 标题 -->
		<br/>
		<div class="row ">
			<div class="col-md-9">
				<img src="${APP_PATH }/static/images/a.png" alt="" class="img-rounded" width="1130" height="200" >
			</div>
		</div>
		<br/>
		<div class="row">
			<form id="add_form" class="form-horizontal" action="#" method="post">
				<div class="panel panel-default col-sm-11 col-center-block">
					<div class="panel-heading">城市</div>
					<div class="panel-body">
						<div class="form-group">
							<label for="city" class="col-sm-3 control-label">城市</label>
							<div class="col-sm-5 inner">
								<input type="hidden" class="form-control" name="id" id="id"  value="${eval.id}">
								<input type="text" class="form-control" name="city" id="city" placeholder="城市" value="${eval.city}" readonly="readonly">
								<span class="help-block"></span>
							</div>
							<p class="form-control-static">（示例：北京，此表单填写汉字或英文）</p>
						</div>
					</div>
				</div>
				<div class="panel panel-default col-sm-11 col-center-block">
					<div class="panel-heading">经济与市场因素</div>
					<div class="panel-body">
						<div class="form-group">
							<label for="spaceNum"  class="col-sm-3 control-label">城市众创空间数量</label>
							<div class="col-sm-5 inner">
								<input type="text" class="form-control" name="spaceNum" id="spaceNum" placeholder="城市众创空间数量" value="${eval.spaceNum}">
								<span class="help-block"></span>
							</div>
							<p class="form-control-static">（示例：0-100家，格式为数字取整数）</p>
						</div>
						<div class="form-group">
							<label for="gdp" class="col-sm-3 control-label">城市年GDP</label>
							<div class="col-sm-5 inner">
								<input type="text" class="form-control" name="gdp" id="gdp" placeholder="城市年GDP" value="${eval.gdp}">
								<span class="help-block"></span>
							</div>
							<p class="form-control-static">（示例：0-40000亿，格式为数字取整数）</p>
						</div>
						<div class="form-group">
							<label for="companyNum" class="col-sm-3 control-label">城市风险投资公司数量</label>
							<div class="col-sm-5 inner">
								<input type="text" class="form-control" name="companyNum" id="companyNum"  placeholder="城市风险投资公司数量" value="${eval.companyNum}">
								<span class="help-block"></span>
							</div>
							<p class="form-control-static">（示例：0-200家，格式为数字取整数）</p>
						</div>
						<div class="form-group">
							<label for="superCompanyNum" class="col-sm-3 control-label">城市融资1000万以上企业数量</label>
							<div class="col-sm-5 inner">
								<input type="text" class="form-control" name="superCompanyNum" id="superCompanyNum"  placeholder="城市融资1000万以上企业数量" value="${eval.superCompanyNum}">
								<span class="help-block"></span>
							</div>
							<p class="form-control-static">（示例：0-100家，格式为数字取整数）</p>
						</div>
					</div>
				</div>

				<div class="panel panel-default col-sm-11 col-center-block">
					<div class="panel-heading">科技因素</div>
					<div class="panel-body">
						<div class="form-group">
							<label for="schoolNum" class="col-sm-3 control-label">城市高校数量</label>
							<div class="col-sm-5 inner">
								<input type="text" class="form-control" name="schoolNum" id="schoolNum" placeholder="城市高校数量" value="${eval.schoolNum}">
								<span class="help-block"></span>
							</div>
							<p class="form-control-static">（示例：0-100所，格式为数字取整数）</p>
						</div>
						<div class="form-group">
							<label for="peopleNum" class="col-sm-3 control-label">城市科技活动人员数量</label>
							<div class="col-sm-5 inner">
								<input type="text" class="form-control" name="peopleNum" id="peopleNum" placeholder="城市科技活动人员数量" value="${eval.peopleNum}">
								<span class="help-block"></span>
							</div>
							<p class="form-control-static">（示例：0-50万人，格式为数字取整数）</p>
						</div>

					</div>
				</div>

				<div class="panel panel-default col-sm-11 col-center-block">
					<div class="panel-heading">政策与城市环境因素</div>
					<div class="panel-body">
						<div class="form-group">
							<label for="support" class="col-sm-3 control-label">城市/省政府政策支持度</label>
							<div class="col-sm-5 inner">
								<input type="text" class="form-control" name="support" id="support" placeholder="城市或省政府政策支持度" value="${eval.support}">
								<span class="help-block"></span>
							</div>
							<p class="form-control-static">（示例：0-10，格式为数字取整数）</p>
						</div>
						<div class="form-group">
							<label for="fever" class="col-sm-3 control-label">城市的文化环境/创业热度</label>
							<div class="col-sm-5 inner">
								<input type="text" class="form-control" name="fever" id="fever" placeholder="城市的文化环境、创业热度" value="${eval.fever}">
								<span class="help-block"></span>
							</div>
							<p class="form-control-static">（示例：0-10，格式为数字取整数）</p>
						</div>
						<div class="form-group">
							<label for="facilities" class="col-sm-3 control-label">城市公共基础设施情况</label>
							<div class="col-sm-5 inner">
								<input type="text" class="form-control" name="facilities" id="facilities" placeholder="城市公共基础设施情况" value="${eval.facilities}">
								<span class="help-block"></span>
							</div>
							<p class="form-control-static">（示例：1-600家，格式为数字取整数）</p>
						</div>
						<div class="form-group">
							<label for="area" class="col-sm-3 control-label">城市人均公共绿地面积</label>
							<div class="col-sm-5 inner">
								<input type="text" class="form-control" name="area" id="area" placeholder="城市人均公共绿地面积" value="${eval.area}">
								<span class="help-block"></span>
							</div>
							<p class="form-control-static">（示例：0-200平方米/人，格式为数字取整数）</p>
						</div>
					</div>
				</div>
				<div class="col-md-8 col-md-offset-5">
					<button id="submit_btn" type="button" class="btn btn-success "> 提交 </button>
				</div>
			</form>
			<br/>

		</div>
	</div>

	<script type="text/javascript">

		$("#submit_btn").click(function(){
			if(validate_edit_form()){
				debugger
				$.ajax({
					type:'GET',
					url: '${APP_PATH}/saveEditEval',
					data: $('#add_form').serialize(),
					success: function(data){
						window.location.href="${APP_PATH}/view?score="+$("#id").val();
					}
				});
			}

		});

		//校验表单数据
		function validate_edit_form(){
			//1、城市,使用正则表达式
			var reg = /^[\u2E80-\u9FFF]+$/;
			var reg1 = /^[a-zA-Z]+$/;
			var city = $("#city").val();
			if(city.length>0) {
				for (var i = 0; i < city.length; i++) {
					console.log(city.charAt(i));
					console.log(!reg.test(city.charAt(i)));
					console.log(!reg1.test(city.charAt(i)));
					if (!reg.test(city.charAt(i)) && !reg1.test(city.charAt(i))) {
						show_validate_msg("#city", "error", "请输入汉字或英文");
						return false;
					}
				}
			}else{
				show_validate_msg("#city", "error", "城市不能为空");
				return false;
			}
			//城市众创空间数量

			var spaceNum = $("#spaceNum").val();
			if(isInteger(spaceNum)){
				if(spaceNum >= 0 && spaceNum <= 100){
					show_validate_msg("#spaceNum", "success", "");
				}else{
					show_validate_msg("#spaceNum", "error", "请输入0-100的整数");
					return false;
				};
			}else{
				show_validate_msg("#spaceNum", "error", "请输入0-100的整数");
				return false;
			}

			//城市年GDP
			var gdp = $("#gdp").val();
			if(isInteger(gdp)) {
				if (gdp >= 0 && gdp <= 40000) {
					show_validate_msg("#gdp", "success", "");
				} else {
					show_validate_msg("#gdp", "error", "请输入0-40000的整数");
					return false;
				}
			}else{
				show_validate_msg("#gdp", "error", "请输入0-40000的整数");
				return false;
			}
			//城市风险投资公司数量
			var companyNum = $("#companyNum").val();
			if(isInteger(companyNum)) {
				if (companyNum >= 0 && companyNum <= 200) {
					show_validate_msg("#companyNum", "success", "");
				} else {
					show_validate_msg("#companyNum", "error", "请输入0-200的整数");
					return false;
				}
			}else{
				show_validate_msg("#companyNum", "error", "请输入0-200的整数");
				return false;
			}
			//城市融资1000万以上企业数量
			var superCompanyNum = $("#superCompanyNum").val();
			if(isInteger(superCompanyNum)) {
				if (superCompanyNum >= 0 && superCompanyNum <= 100) {
					show_validate_msg("#superCompanyNum", "success", "");

				} else {
					show_validate_msg("#superCompanyNum", "error", "请输入0-100的整数");
					return false;
				}
			}else{
				show_validate_msg("#superCompanyNum", "error", "请输入0-100的整数");
				return false;
			}
			//城市高校数量
			var schoolNum = $("#schoolNum").val();
			if(isInteger(schoolNum)) {
				if (schoolNum >= 0 && schoolNum <= 100) {
					show_validate_msg("#schoolNum", "success", "");
				} else {
					show_validate_msg("#schoolNum", "error", "请输入0-100的整数");
					return false;
				}
			}else{
				show_validate_msg("#schoolNum", "error", "请输入0-100的整数");
				return false;
			}
			//城市科技活动人员数量
			var peopleNum = $("#peopleNum").val();
			if(isInteger(peopleNum)) {
				if (peopleNum >= 0 && peopleNum <= 50) {
					show_validate_msg("#peopleNum", "success", "");
				} else {
					show_validate_msg("#peopleNum", "error", "请输入0-50的整数");
					return false;
				}
			}else{
				show_validate_msg("#peopleNum", "error", "请输入0-50的整数");
				return false;
			}
			//城市或省政府政策支持度
			var support = $("#support").val();
			if(isInteger(support)) {
				if(support>=0 && support<=10){
					show_validate_msg("#support", "success", "");
				}else{
					show_validate_msg("#support", "error", "请输入0-10的整数");
					return false;
				}
			}else{
				show_validate_msg("#support", "error", "请输入0-10的整数");
				return false;
			}
			//城市的文化环境、创业热度
			var fever = $("#fever").val();
			if(isInteger(fever)) {
				if (fever >= 0 && fever <= 10) {
					show_validate_msg("#fever", "success", "");
				} else {
					show_validate_msg("#fever", "error", "请输入0-10的整数");
					return false;
				}
			}else{
				show_validate_msg("#fever", "error", "请输入0-10的整数");
				return false;
			}
			//城市公共基础设施情况
			var facilities = $("#facilities").val();
			if(isInteger(facilities)) {
				if (facilities >= 0 && facilities <= 600) {
					show_validate_msg("#facilities", "success", "");
				} else {
					show_validate_msg("#facilities", "error", "请输入0-10的整数");
					return false;
				}
			}else{
				show_validate_msg("#facilities", "error", "请输入0-10的整数");
				return false;
			}
			//城市人均公共绿地面积
			var area = $("#area").val();
			if(isInteger(facilities)) {
				if (area >= 0 && area <= 200) {
					show_validate_msg("#area", "success", "");
				} else {
					show_validate_msg("#area", "error", "请输入0-200的整数");
					return false;
				}
			}else{
				show_validate_msg("#area", "error", "请输入0-200的整数");
				return false;
			}
			return true;
		}

		/**
		 * 判断是否是正整数 是 返回true
		 * @param str
		 * @returns {boolean}
		 */
		function isInteger(str){
			if(str==null || str==''){
				return false;
			}else{
				var check = /^\d+$/;
				if (check.test(str)) {
					return true;
				}else{
					return false;
				}
			}

		}

		/**
		 * 显示校验结果的提示信息
		 * @param ele
		 * @param status
		 * @param msg
		 */
		function show_validate_msg(ele,status,msg){
			$("input").parent().removeClass("has-success has-error");
			$("input").next("span").text("");
			//清除当前元素的校验状态
			$(ele).parent().removeClass("has-success has-error");
			$(ele).next("span").text("");
			if("success"==status){
				$(ele).parent().addClass("has-success");
				$(ele).next("span").text(msg);
			}else if("error" == status){
				$(ele).parent().addClass("has-error");
				$(ele).next("span").text(msg);
			}
			$(ele).focus();
		}

	</script>

</body>
</html>