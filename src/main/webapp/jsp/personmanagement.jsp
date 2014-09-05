<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Register</title>
</head>
<body>
<h1>People</h1>
<ol>
  <li>Steve Smith <a href="<s:url action='editPerson'/>">Edit</a> <a href="<s:url action='deletePerson'/>">Delete</a></li>
  <li>Sue Jones <a href="<s:url action='editPerson'/>">Edit</a> <a href="<s:url action='deletePerson'/>">Delete</a></li>
</ol>
<p><a href="<s:url action='createPerson'/>">Create new person</a></p>
</body>
</html>