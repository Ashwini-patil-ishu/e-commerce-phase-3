<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="delete_shoe">
<h1>Delete Shoes Details</h1>
<input type="hidden" name="id" value=<%=request.getParameter("id")%>>
Shoes id to be deleted <input type="text" name="name">
<input type="submit"  value="delete"> 
</form>
</body>
</html>