<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>添加用户</title>
    
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
    <form action="<%=basePath %>userAdd.shtml" method="post">
    	<table>
    		<tr><td>用户名：</td><td><input type="text" name="username" ></td> </tr>
    		<tr><td>密码：</td><td><input type="text" name="password" ></td> </tr>
    		<tr><td>性别：</td><td>男<input type="radio" name="sex" value="男">女<input type="radio" name="sex" value="女"></td> </tr>
    		<tr><td>地址：</td>
	    		<td>
		    		<select name="address">
			    		<option value="bj">北京</option> 
			    		<option value="db">东北</option> 
		    		</select>   
	    		</td> 
    		</tr>
    		<tr><td>爱好：</td>
	    		<td>
		    		java<input type="checkbox" name="favorite" value="java"> 
		    		c<input type="checkbox" name="favorite" value="c">
		    		vb<input type="checkbox" name="favorite" value="vb">
		    		vf<input type="checkbox" name="favorite" value="vf">
	    		</td> 
    		</tr>
    		
    		<tr><td>   </td><td><input type="submit" value="提交"></td> </tr>
    	</table>
    	
    </form>
  </body>
</html>
