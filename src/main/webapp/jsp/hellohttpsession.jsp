<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello HTTP Session!</title>
</head>
<body>
<!-- The s:property tag's value attribute has a value of #session.helloCount. 
	The "#" before the word session tells the Struts framework to look in the session scope for a key of "helloCount" 
	(which is the value of the String constant HELLO_COUNT referenced in method increaseHelloCount). 
	Struts will get the object mapped to helloCount key and then call that object's toString method to determine what to display in the view page. -->
<p>I've said hello to you <s:property value="#session.helloCount" /> times!</p>
<p><a href="<s:url action='index' />" >Return to home page</a>.</p>
</body>
</html>