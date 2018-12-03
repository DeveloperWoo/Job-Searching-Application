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
<form action = "emCreateAccountServlet"  method ="Post">
<label>JobID</label></br>
<input type = "number" value ="jobID" min = "1" max = "11"/></br>
<label>EmployerID</label> </br>
<input type ="number" value = "employeeID" min = "1" max = "11"/><br>
<label>Title</label></br>
<input type = "text" name = "title"/></br>
<label>City</label></br>
<input type = "text" name = "city"/></br>
<label>Address</label></br>
<input type = "text" name = "address"/></br>
<label>Number of Positions</label></br>
<input type = "number" name = "numofpositions" min = "1" max = "10"/></br>
<label>Description</label></br>
<input type = "text" name = "description"/></br>
<label>Qualifications</label></br>
<input type = "text" name = "qualifications"/></br>
<label>PostingDate</label></br>
<input type = "date" name = "postingdate"/></br>
<label>ClosingDate</label></br>
<input type = "date" name = "closingdate"/><br></br>
<input type = "submit" value = "PostJob"/>

</form>
</body>
</html>
