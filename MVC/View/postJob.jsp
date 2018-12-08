<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Please Post a Job</h2>
<form action = "JobController"  method ="Post">
<input type="hidden" name="action" value="post">
<label>Title</label><br>
<input type = "text" name = "title"/><br>
<label>City</label><br>
<select name="city">
  	<option value="Mississauga">Mississauga</option>
  	<option value="Oakville">Oakville</option>
  	<option value="Brampton">Brampton</option>
  	<option value="Toronto">Toronto</option>
</select><br>
<label>Address</label></br>
<input type = "text" name = "address"/></br>
<label>Number of Positions</label></br>
<select name="numOfPosition">
  	<option value="1">1</option>
  	<option value="2">2</option>
  	<option value="3">3</option>
  	<option value="4">4</option>
  	<option value="5">5</option>
  	<option value="6">6</option>
  	<option value="7">7</option>
  	<option value="8">8</option>
  	<option value="9">9<option>
  	<option value="10">10</option>
</select><br>
<label>Description</label><br>
<input type = "text" name = "description"/><br>
<label>Qualifications</label></br>
<input type = "text" name = "qualifications"/><br>
<label>Posting Date</label></br>
<input type = "date" name = "postingdate"/> <br>
<label>Closing Date</label><br>
<input type = "date" name = "closingdate"/> <br></br>
<input type = "submit" value = "Post Job"/>

</form>
</body>
</html>
