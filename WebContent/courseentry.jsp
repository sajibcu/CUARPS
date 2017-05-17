<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>course entry</title>
</head>
<body style="background-color:#ab86d2;">
<center>
<fieldset>
<legend>
Course Entry
</legend>
<form action="CourseServlet" method="post">
<table>
<tr><td>Course Code</td><td><input type="text" name="cid"></td></tr>
<tr><td>Course Title</td><td><input type="text" name="ctl"></td></tr>
<tr><td>Course Credit</td><td><input type="text" name="ccd"></td></tr>
<tr><td><input type="submit" value="Save"></td><td><a href="admin.jsp">Cancle</a>  <input type="reset"></td><td></tr>
</table>

</form>

</fieldset>
</center>
</body>
</html>