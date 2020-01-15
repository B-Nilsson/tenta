<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>

<head>

<meta charset="ISO-8859-1">

<title>list.jsp</title>

</head>

<body>

/* I have no idea where the jsp of this went,
but it didn't work anyway */

<p>Please select the list you'd like to view</p>

<form action = "listservlet" method ="GET">
<br/>
<input type="radio" name="fruits" value="fruits">fruits
<br/>
<input type="radio" name="fauna">fauna
<br/>
<input type="radio" name="flora">flora
<br/>
<input type="submit" value="submit">
</form>

</body>

</html>