<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
 
<title>登录</title>
 
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
 
<script type="text/javascript" src="<%=basePath%>js/jquery-1.7.1.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/login.js"></script>
<script type="text/javascript" src="<%=basePath%>js/md5.js"></script>
</head>
 
<body>
	<div>
		UserName:<input type="text" name="username" /> <br/>
		PassWord:<input type="password" name="password" /><br/> 
		<input type="submit" id="loginBtn" value="Login" />
	</div>
	<script type="text/javascript">
	  	var basePath = "${ctx_path}";
	  	alert(basePath);
  	</script>
</body>
</html>