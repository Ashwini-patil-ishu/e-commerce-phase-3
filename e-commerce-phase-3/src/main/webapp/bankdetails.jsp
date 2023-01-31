<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.example.demo.*" %>
    <%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="insert_bank">
<% List<Bank> b=(List<Bank>) request.getAttribute("Bbalance");%>
<table border="1">
<tr>
<th>Bank Id</th>
<th> Bank Balance</th>
</tr>
<%for (Bank bb:b){ %>
<tr>
<td><%=bb.getId() %></td>
<td><%=bb.getBbalance() %></td>
</tr>
<%} %>
</table>
</form>
</body>
</html>