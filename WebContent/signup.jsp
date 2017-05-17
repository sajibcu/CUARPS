<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:#ab86d2;">
<form action="SignUp" method="post">
<table>
<tr><td>User Name</td><td><input type="text" name="name"></td></tr>
<tr><td>Password</td><td><input type="password" name="password"></td></tr>
<tr><td>User Type</td><td>
<input type="checkbox" name="type" value="student">Student
<input type="checkbox" name="type" value="teacher">Teacher
<input type="checkbox" name="type" value="staff">Staff</td></tr>
<tr><td><input type="submit" value="Ok"></td><td><input type="reset" value="Reset"></b></a></td></tr>

</table>
<a href="admin.jsp"><b> <font size="6">back</font>

</form>
</body>
</html>