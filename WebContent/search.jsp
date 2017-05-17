<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>result</title>
</head>
<body style="background-color:#ab86d2;">
<center>
<fieldset>
Serch Result
<form action="SrcResultS" method="post">
<table>
<tr><td>Id </td><td><input type="text" name="id"></td></tr>
<tr><td>Select Semister</td><td>
<input type="checkbox" name="yr" value="1st">1st
<input type="checkbox" name="yr" value="2nd">2nd
<input type="checkbox" name="yr" value="3rd">3rd
<input type="checkbox" name="yr" value="4th">4th
<input type="checkbox" name="yr" value="5th">5th
<input type="checkbox" name="yr" value="6th">6th
<input type="checkbox" name="yr" value="7th">7th
<input type="checkbox" name="yr" value="8th">8th</td></tr>

<tr><td><input type="submit" value="Save"></td><td><input type="button" value="Cancle">  <input type="reset"></td><td></tr>

</table>
</form>
</fieldset>
</center>
</body>
</html>