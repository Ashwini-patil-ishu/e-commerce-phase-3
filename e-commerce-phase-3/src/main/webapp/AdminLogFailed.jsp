<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Login Failed</h1>
<form action="registerdone.jsp">
<input type="hidden" name="password" value=<%=request.getParameter("password") %>>
<h2 style="text-align:center; Color:blue"> "Registerd here.."</h2>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>Email :</b>&nbsp;
<input type="text" name="email" placeholder="Email"><br><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>Username: </b>
<input type="text" name="username " placeholder="Username "><br><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>Password:  </b>
<input type="text" name="password" placeholder="Password"><br><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<button type="submit" class="btn btn-primary">ADD</button><br><br><br><br>
</form>
</body>
</html>