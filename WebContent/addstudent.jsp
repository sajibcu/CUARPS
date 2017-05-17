<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:#ab86d2;"><center>
<fieldset>
Add Student
<form action="AdSt" method="post">
<table>
<tr><td>Student Name</td><td><input type="text" name="name"></td></tr>
<tr><td>Id </td><td><input type="text" name="id"></td></tr>
<tr><td>DEPARTMENT</td><td><input type="text" name="dp">
<tr><td>Select Semister</td><td>
<input type="checkbox" name="semister" value="1st">1st
<input type="checkbox" name="semister" value="2nd">2nd
<input type="checkbox" name="semister" value="3rd">3rd
<input type="checkbox" name="semister" value="4th">4th
<input type="checkbox" name="semister" value="5th">5th
<input type="checkbox" name="semister" value="6th">6th
<input type="checkbox" name="semister" value="7th">7th
<input type="checkbox" name="semister" value="8th">8th</td></tr>
<tr><td>Session</td><td><input type="text" name="session">
<tr><td>Phone Number</td><td><input type="text" name="pnum">
<tr><td>Address</td><td><input type="text" name="address">
<tr><td><input type="submit" value="Save"></td><td><input type="button" value="Cancle">  <input type="reset"></td><td></tr>

</table>
</form>
</fieldset>
</center>
</body>
</html>