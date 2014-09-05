<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Basic Struts 2 Application - Welcome</title>
</head>
<body>
<h1>Welcome To Struts 2!</h1>

<!-- B1 -->
<p><a href="<s:url action='hello'/>">Hello World</a></p>

<!-- B2 -->
<s:url action="hello" var="helloLink">
  <s:param name="userName">Bruce Phillips</s:param>
</s:url>
<p><a href="${helloLink}">Hello Bruce Phillips</a></p>

<!-- B3 -->
<p>Get your own personal hello by filling out and submitting this form.</p>
<s:form action="hello">
  <s:textfield name="userName" label="Your name" />
  <s:submit value="Submit" />
</s:form>

<!-- 
<p><a href="jsp/register.jsp">Please register</a> for our prize drawing.</p>
-->
<s:url action="registerInput" var="registerInputLink" />
<p><a href="${registerInputLink}">Please register</a> for our prize drawing.</p>

<h3>Registro español</h3>
<s:url action="registerInput" var="registerInputLinkES">
    <s:param name="request_locale">es</s:param>
</s:url>
<p><a href="${registerInputLinkES}">Por favor, regístrese</a> para nuestro sorteo</p>

<p><a href="<s:url action='Person'/>">People Management</a> &lt;Wildcard Method Selection&gt;</p>

<p><a href="<s:url action='hello-convention'/>">Hello Struts2 Convention</a> &lt;Conventions And Annotations&gt;</p>

<p><a href="<s:url action='helloHTTPSession'/>">Hello HTTP Session</a> &lt;Obtain/Retrieve HTTP Session Object&gt;</p>

<!-- Debugging Struts - Configuration Plugin -->
<!-- To use the plugin your application needs to have the struts2-config-browser-plugin-x.x.x.x.jar in your application's class path. -->
<a href="<s:url action="index" namespace="config-browser" />">Launch the configuration browser</a>

<!-- If you have set devMode to true (in the example application see struts.xml) then one of the interceptors that is activated when Struts 2 processes an action is the DebuggingInterceptor. 
	The DebuggingInterceptor looks for a query string appended to the action URL with a name of debug and a value of xml, console, command, or browser. -->
<s:url action="index" var="indexDebuggingInterceptor">
    <s:param name="debug">browser</s:param>
</s:url>
<!-- Note that to enable the correct display and interaction of the expand/collapse links on the debugging information web page you need to include the s:head tag in your JSP's head section (see index.jsp in the example application) 
	and also include the Struts 2 dojo plugin in your application's class path. The Struts 2 dojo plugin is available as part of the Struts 2 download and from the Maven repository. -->
<p><a href="${indexDebuggingInterceptor}">Click here to use the Debugging Interceptor</a></p>
<!-- use global properties -->
<hr />
<s:text name="contact" />

</body>
</html>