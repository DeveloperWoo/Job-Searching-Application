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
	<table border=2>
		<thead>
			<tr>
				<th>JobID</th>
				<th>JobTitle</th>
				<th>City</th>
				<th>PostingDate</th>
				<th>ClosingDate</th>
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
					<td><fmt:formatDate value="${jobs.postingDate }" pattern="yyyy-MM-dd" /></td>
					<td><fmt:formatDate value="${jobs.closingDate }" pattern="yyyy-MM-dd" /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>