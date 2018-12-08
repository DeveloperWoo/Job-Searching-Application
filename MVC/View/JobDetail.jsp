<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<header>
<h1>Job Description</h1>
</header>

<p>
<h2><u>Job Title:</u> ${jobdetail.title}</h2>
<h3><u>Job Id:</u> ${jobdetail.jobId }</h3><br>
</p>

<p>
<u>Description:</u>
${jobdetail.description } <br>
</p>

<p>
<u>Qualification for the Job:</u><br>
${jobdetail.qualification }<br>
</p>

<p>
<h3><u>Job Inforamtion:</u></h3><br>
Positions Available: ${jobdetail.numOfPosition }
Starting Date:${jobdetail.postingDate }<br> 
Closing Date: ${jobdetail.closingDate }<br>
</p>

<p>
<u>Location:</u><br>
${jobdetail.address } <br>
To apply for the job go through link Below:<br>
<a href="${jobdetail.note }"> ApplyNow</a>
</p>

</body>
</html>
