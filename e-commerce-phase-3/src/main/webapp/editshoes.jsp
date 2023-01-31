<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="editcontroller">
<h1>Editing Shoes Details</h1>
<input type="hidden" name="id" value=<%=request.getParameter("id") %>>
Shoes name to be edited <input type="text" name="name"><br><br>

<input type="submit"  value="edit"> 
</form>
</body>
</html>