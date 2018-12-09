<%@page import="Model.EmployerBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<script type="text/javascript">
  function goBack(){
      window.history.back();
  }
</script> 
<style>
a{
	text-decoration: none;
}
</style>
<body>
<h2>Company Detail</h2>
Name: ${eName }<br>
Address: ${employer.address }<br>
Contact: ${employer.contact }<br>
About Us: ${employer.aboutUs }<br>
Website: ${employer.website }<br>


<h2>Job Detail</h2>
<h3><u>Title:</u> ${jobdetail.title}</h3>
<u>Job Id:</u> ${jobdetail.jobId }<br>

<p>
<u>Description:</u>
${jobdetail.description } <br>
</p>

<p>
<u>Qualifications and Skills:</u><br>
${jobdetail.qualification }<br>
</p>

<p>
Number of Position: ${jobdetail.numOfPosition }<br>
Posting Date: ${jobdetail.postingDate }<br> 
Closing Date: ${jobdetail.closingDate }<br>
</p>

<p>
<u>Location:</u><br>
${jobdetail.address } <br>
<br>
<button type="button" class="btn btn-info" ><a href="${employer.website }"> Apply Now</a></button>
<button type="button" class="btn btn-info" onclick="goBack()">Go Back</button>
</p>

</body>
</html>