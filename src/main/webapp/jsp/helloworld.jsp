<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello World!</title>
</head>
<body>
<!-- use package level properties -->
<h1><s:text name="greeting" /></h1>

<!-- The s:property tag displays the value returned by calling the method getMessageStore of the HelloWorldAction controller class. 
	That method returns a MessageStore object. By adding the .message onto the messageStore part of the value attribute we are telling 
	the Struts 2 framework to call the getMessage method of that MessageStore object. The getMessage method of class MessageStore returns 
	a String. It is that String that will be displayed by the s:property tag. -->
<h2><s:property value="messageStore.message" /></h2>

<p>I've said hello <s:property value="helloCount" /> times!</p>
<p><s:property value="messageStore" /></p>

<!-- use global properties -->
<hr />
<s:text name="contact" />
</body>
</html>