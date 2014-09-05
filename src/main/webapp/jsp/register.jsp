<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Register</title>
<s:head />
<!-- override struts2 build-in css style -->
<!-- location: struts2-core.jar/template.xhtml/style.css -->
<!-- http://localhost:8080/struts2-examples/struts/xhtml/styles.css -->
<style type="text/css">
  .label {color:blue; font-style:normal; font-weight:bold}
</style>
</head>
<body>
<h3>Register for a prize by completing this form.</h3>
 
<!-- 
  To override an entire form's theme, change the "theme" attribute of the form.
  theme="xhtml"  default value
  theme="simple"  You should see that there are no table tags controlling the layout and also there are no label tags for the text fields.
  theme="css_xhtml"   The layout of the form tags is now controlled by div tags and the label tags are back.
-->
<s:form action="register" theme="xhtml">
	  <!--
      	<s:textfield id="abc" name="personBean.firstName" label="First name" />
      -->
      <s:textfield id="abc" key="personBean.firstName"  />
      <s:textfield name="personBean.lastName" label="Last name" />
      <s:textfield name="personBean.email"  label ="Email" /> 
      <s:textfield key="personBean.phoneNumber" /> 
      <!-- 
      	list="sports" results in the framework calling the getSports method of Action Class. 
      -->
      <s:select key="personBean.sport" list="sports" />
      <s:radio key="personBean.gender" list="genders" />
      <!-- 
      	Select Tag - Object Backed (Object as option)
      	The list value tells the framework to call the getStates method of the EditAction class. 
      	That method returns an ArrayList of State objects. Each State object has getStateAbbr and getStateName methods.
      -->
      <s:select key="personBean.residency" list="states" listKey="stateAbbr" listValue="stateName" />
      <s:checkbox key="personBean.over21" />
      <!-- customized theme, see "template" folder in webapp -->
      <s:checkboxlist key="personBean.carModels" list="carModelsAvailable" theme="KUTheme" />
      <s:textfield name="personBean.age"  label="Age"  />
      <s:submit/>
</s:form> 

<!-- use global properties -->
<hr />
<s:text name="contact" />
</body>
</html>