<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'user_list.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    这是用户列表页面
    <a href="<%=basePath %>userToAdd.shtml">添加用户</a>
    
    <table border="2">
    		<tr>
    			<td>用户ID</td>
    			<td>用户名</td>
    			<td>密码</td>
    			<td>性别</td>
    			<td>地址</td>
    			<td>爱好</td>
    		</tr>
    	<c:forEach items="${result}" var="item">
    		<tr>
    			<td>${item.id }</td>
    			<td>${item.username }</td>
    			<td>${item.password }</td>
    			<td>${item.sex }</td>
    			<td>${item.address }</td>
    			<td>${item.favorite }</td>
    		</tr>
    	</c:forEach>
    </table>
  </body>
</html>
