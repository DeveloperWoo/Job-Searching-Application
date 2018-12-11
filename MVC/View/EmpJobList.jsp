<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="Model.EmployerBean"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
EmployerBean em = (EmployerBean)request.getSession().getAttribute("employer");
String eName = em.getEName();
int eId = em.getEmployerId();
%>

<h1>Welcome <%=eName%></h1>
<h2>EmployerId <%=eId%></h2>
<h2>You Already Posted These Jobs</h2>

<table border=2>
		<thead>
			<tr>
				<th>JobID</th>
				<th>JobTitle</th>
				<th>City</th>
				<th>PostingDate</th>
				<th>ClosingDate</th>
				<th>EditJobs</th>
				<th>DeleteJobs</th>
			</tr>
		</thead>
		<%
			//set attribute named jobs in previous file
			// to list all the jobs
		%>
		<tbody>
			<c:forEach items="${jobs}" var="jobs">
				<tr>
					<td><c:out value="${jobs.jobId}"></c:out></td>
					<td><c:out value="${jobs.title}"></c:out></td>
					<td><c:out value="${jobs.city}"></c:out></td>
					<td><c:out value="${jobs.postingDate}"></c:out></td>
					<td><c:out value="${jobs.closingDate}"></c:out></td>
					<td><a href="JobController?action=edit&jobId=${jobs.jobId}">Edit</a></td>
					<td><a href="JobController?action=delete&jobId=${jobs.jobId}">Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

<h1></h1>
</body>
</html>
