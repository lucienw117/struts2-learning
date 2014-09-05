<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Registration Successful</title>
</head>
<body>
<!-- 
<h3>Thank you for registering for a prize.</h3>
-->
<h3><s:text name="thankyou" /></h3>
<p>Your registration information: <s:property value="personBean" /> </p>

<!-- struts 2 if tag -->
<s:if test="personBean.over21">
	<p>You are old enough to vote!</p>
</s:if>
<s:else>
	<p>You are NOT old enough to vote.</p>
</s:else> 
<s:if test="personBean.carModels.size > 1">
  <p>Car models</p>
</s:if>
<s:else>
  <p>Car model</p>
</s:else>

<!-- struts iterator tag -->
<table style="margin-left:15px">
	<s:iterator value="personBean.carModels">
		<!-- Since the collection is an Array of String objects, the s:property tag doesn't need to specify a value attribute. -->
		<tr><td><s:property /></td></tr>
	</s:iterator>
</table>
<table style="margin-left:15px">
	<s:iterator value="states" >
		<tr><td><s:property value="stateAbbr" /></td><td><s:property value="stateName" /></td></tr>
	</s:iterator>
</table> 

<p><a href="<s:url action='index' />" >Return to home page</a>.</p>

<!-- use global properties -->
<hr />
<s:text name="contact" />
</body>
</html>