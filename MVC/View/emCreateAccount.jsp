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
	<input type="hidden" name="action" value="createAccount">
	User Name: <input type="text" name="username"><br>
	Password: <input type="password" name="password"><br>
	Company Name: <input type="text" name="eName"><br>
	Address: <input type="text" name="address"><br> 
	Contact: <input type="text" name="contact"><br>
	About us: <input type="text" name="aboutUs"><br>
	Website: <input type="text" name="website"><br>
	<input type="submit" value="Sign Up">
</form>


</body>
</html>