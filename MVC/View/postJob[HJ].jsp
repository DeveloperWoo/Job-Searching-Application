<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action="JobController" method="post">
	<input type="hidden" name="action" value="post">
	Job Title: <input type="text" name="title"><br>
	City:
	<select name="city">
  		<option value="Mississauga">Mississauga</option>
  		<option value="Oakville">Oakville</option>
  		<option value="Brampton">Brampton</option>
  		<option value="Toronto">Toronto</option>
	</select><br>
	Address: <input type="text" name="address"><br><br>
	Number of Postition: 
	<select name="numOfPosition">
  		<option value="1">1</option>
  		<option value="2">2</option>
  		<option value="3">3</option>
  		<option value="4">4</option>
  		<option value="5">5</option>
  		<option value="6">6</option>
  		<option value="7">7</option>
  		<option value="8">8</option>
	</select><br>
	Job Description: <input type="text" name="description"><br>
	Job Qualification: <input type="text" name="qualification"><br>
	Posting Date: <input type="text" name="postingDate"> (DD/MM/YYYY)<br>
	Closing Date: <input type="text" name="closingDate"> (DD/MM/YYYY)<br>
	Note: <input type="text" name="note"><br>
	<input type="submit" value="Submit">
</form>
</body>
</html>
