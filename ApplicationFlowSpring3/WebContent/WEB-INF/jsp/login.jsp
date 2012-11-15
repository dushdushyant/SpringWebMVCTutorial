<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
 
<h2>Please authenticate yourself.</h2>

<form:form method="post" action="home.html" modelAttribute="userForm">
    <table>        
        <tr>
            <td>User Name</td>
            <td><input name=userName value="${userForm.userName}"/></td>
        </tr>  
        <tr>
            <td>Password</td>
            <td><input name="passWord" type="password" value="${userForm.passWord}"/></td>
        </tr>     
</table>  
<br/>
 
<input type="submit" value="Save" />
     
</form:form>
</body>
</html>