<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
    <%@ page import="com.example.demo.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% List<User> u = (List<User>)request.getAttribute("list"); %>


<table border="1">
<tr>
	<th>User ID</th>
	<th>First Name</th>
	<th>Last Name</th>
	<th>Phone Number</th>
	<th>Username</th>
	<th>Password</th>
</tr>
<% for(User uu : u ) { %> 
<tr>
	<td><%=uu.getId() %></td>
	<td><%=uu.getFname() %></td>
	<td><%=uu.getLname() %></td>
	<td><%=uu.getPhono()%></td>
	<td><%=uu.getUsername() %></td>
	<td><%=uu.getPassword()%></td>
	</tr>
<%} %>

</table>	
</body>
</html>