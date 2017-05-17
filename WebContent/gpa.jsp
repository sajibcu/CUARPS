<%@page import="rps.model.UserAddSt"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>result</title>
</head>
<body style="background-color:#ab86d2;">
<fieldset>Student result<br>
<%
UserAddSt user=(UserAddSt)session.getAttribute("user");
 %>
 Name :
 <%=user.getName()%>
 <br>
  ID :
 <%=user.getId()%>
  <br>
  Department:
  <%=user.getDp() %>
 <br>
 Semister:
 <%=user.getSemister()%>
  <br>
 Session :
 <%=user.getSession()%>
 <br>
 GPA:
 <%=user.getGpa() %>
 </fieldset>
 <a href="index.jsp">logout</a>
</body>
</html>