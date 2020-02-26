<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/index3.css"
	rel="stylesheet" type="text/css">
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/jquery-1.8.3.min.js"></script>
</head>
<body>
	<form action="list.do" method="get">
		<input type="hidden" name="pageNum"> 影片名称:<input type="text"
			name="name" value="${con.name }"> 上映时间:<input type="text"
			name="u1" value="${con.u1 }">---<input type="text" name="u2"
			value="${con.u2 }"> <br /> <br /> 导演:<input type="text"
			name="actor" value="${con.actor }"> 价格:<input type="text"
			name="p1" value="${con.p1 }">---<input type="text" name="p2"
			value="${con.p2 }"> <br /> <br /> 电影年代:<input type="text"
			name="years" value="${con.years }"> 电影时长:<input type="text"
			name="l1" value="${con.l1 }">---<input type="text" name="l2"
			value="${con.l2 }"> <br /> <br />
		<button>查询影片</button>
		<input type="reset" value="重置">
		<input type="button" value="批量删除" onclick="pl()">
	</form>
	<table>
		<tr>

			<td><input type="checkbox" onclick="choose(this.checked)" name="c"></td>
			<td>序号</td>
			<td>电影名称</td>
			<td>导演</td>
			<td><a href="javascript:morder('uptime')">上映日期</a></td>
			<td><a href="javascript:morder('longtime')">电影时长</a></td>
			<td><a href="javascript:morder('years')">年代</a></td>
			<td>类型</td>
			<td>区域</td>
			<td>状态</td>

		</tr>
		<c:forEach items="${page.list }" var="list" varStatus="i">

			<tr>
				<td><input type="checkbox" class="d" value=${list.id}></td>
				<td>${i.count }</td>
				<td>${list.name }</td>
				<td>${list.actor }</td>
				<td>${list.uptime }</td>
				<td>${list.longtime }</td>
				<td>${list.years }</td>
				<td>${list.area }</td>
				<td>${list.type }</td>
				<td><c:if test="${list.status==1 }">即将上映</c:if> <c:if
						test="${list.status==2 }">正在热映</c:if> <c:if
						test="${list.status==3 }">已经下架</c:if></td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="100">
				<button onclick="fenye(1)">首页</button>
				<button onclick="fenye(${page.prePage==0?'1':page.prePage})">上一页</button>
				<button
					onclick="fenye(${page.nextPage==0?page.pages:page.nextPage})">
					下一页</button>
				<button onclick="fenye(${page.pages})">尾页</button>
				第${page.pageNum}页/共${page.pages }页
			</td>
		</tr>

	</table>

</body>
<script type="text/javascript">
function  fenye(pageNum){
	 $("[name='pageNum']").val(pageNum);
	 $("form").submit();
}
 

function morder(conn){
	var jz = '${con.jz}';
	jz= jz=='desc'?'asc':'desc';
	location="list.do?conn="+conn+"&jz="+jz;
}
function choose(obj) {
	 $(".d").attr("checked",obj)
}
function pl() {
	var ids=$(".d:checked").map(function(){
		return this.value
	}).get().join()
	if(ids<1){
		alert("至少选择一个")
	}else{
	    $.ajax({
	    	url:"delete.do",
	    	data:{ids:ids},
	    	dataType:"json",
	    	type:"post",
	    	success:function(obj){
	    		if(obj){
	    			alert("删除成功")
	    			location="list.do"
	    		}else{
	    			alert("删除失败")
	    		}
	    	}
	    	
	    })
	}
	
}
</script>
</html>