<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.head{
	font-family: Garamond;
	font-size:30px;
	color: green;
	padding:1px;
	max-width:500px;
	padding-top: 100px;
}
.active{
	display :block;
	text-decoration: none;
	float: right;
	padding: 1%;
	margin: auto;
	margin-right : 1%;
	margin-left : 1%;
	font-size: 22px;
	font-family: Garamond;
	color: green;
}
.active a:hover {
	background: gray;
}
</style>
</head>
<body>
<form action="adminlogin.jsp">

<br><br>
<a class="active" href="userlogin.jsp"><b>USER</b></a>
<a class="active" href="adminlogin.jsp"><b>ADMIN</b></a>
<a class="active" href="HOME_SCREEN.jsp"><b>HOME</b></a>
<h1>Register Done</h1>
</form>
</body>
</html>