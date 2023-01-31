<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.box {
	max-width: 750px; 
  	margin: auto;
	align-content: center;
	border : 1px solid gray;
  	border-radius: 15px;
  	background-color: white;
  	border-width: 2px;
  	overflow: hidden; 	 
  
  	padding : 60px;
  	padding-top: 35px;
  	padding-bottom : 35px;
}

.head{
	max-width: 300px;
	border: 2px solid #FFFAFA;
	position: relative;
	margin: auto;
	padding:2px;
	padding-right: 2px;
}
.sh{
	font-family: Garamond;
	font-size:20px;
	color: green;
	padding:1px;
	padding-top:1px;
	max-width:500px;
	margin: 1%;
}

</style>
</head>
<h3 class="sh">SportyShoes.com</h3>
<hr>
<br>
<h2 style="text-align:center; Color:red">Insert Bank Details</h2><br>
<body class="main">
<div class="box">

<form action="bankdetails.jsp">

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>Bank Id :</b>&nbsp;
<input type="text" name="id" placeholder="Bank Id"><br><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>Bank Balance :</b>&nbsp;
<input type="text" name="Bbalance" placeholder="Balance"><br><br>
<button type="submit" class="btn btn-primary">Add</button>
</form>
</div>


</body>
</html>