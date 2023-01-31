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
<h2 style="text-align:center; Color:red">Insert Shoes Details</h2><br>
<body class="main">
<div class="box">

<form action="insert_shoes">

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>Sho Id :</b>&nbsp;
<input type="text" name="sho_id" placeholder="Shoes Id"><br><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>Shoes Name :</b>&nbsp;
<input type="text" name="sho_name" placeholder="Sho Name"><br><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<b>Brand Name :</b>&nbsp;
<input type="text" name="sho_brand" placeholder="Brand Name"><br><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<b>Shoes Price :</b>
<input type="number" name="shoo_price" placeholder="Shoes Price"><br><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<div class="container text-center">
<a href="after_ad_login.jsp" class="btn btn-outline-danger">Back</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<button type="submit" class="btn btn-primary">Add</button>
</div>
</form>
</div>
</body>
</html>