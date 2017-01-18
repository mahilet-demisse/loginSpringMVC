<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login page</title>

  <link href='<c:url value="/resources/css/test.css" />' rel="stylesheet" type="text/css"> 
</head>
<body>

<form action="login" method="POST" id="loginform">

			user_name:<input type="text" name="un"/><br><br>		
		
			password: <input type="password" name="pw"/><br><br>	
			
			<input type="submit" value="login"/>			
		
		${error}
		</form>


</body>
</html>