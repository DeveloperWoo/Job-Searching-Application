<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="EmployerController" method="post">
	<input type="hidden" name="action" value="login">
		User name: <input type="text" name="username"><br>
		Password: <input type="password" name="password"><br> 
		<input type="submit" value="Sign In">
	</form>
	<br>
	<form action="EmployerController" method="post">
	<input type="hidden" name="action" value="newAccount">
		You don't have an account yet? 
		<input type="submit" value="Create an account">
	</form>
</body>
</html>