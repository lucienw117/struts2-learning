<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello JQuery</title>
	<style>
		a.test {
		    font-weight: bold;
		}
		
		.button {
			margin: 0px 5px;
		}
	</style>
</head>
<body>
	<script src="js/jquery-1.11.1.js"></script>
	<script>
		function myCallBack1() {
			alert("Falling into callback method 01 .........");
		}
		
		function myCallBack2(p1, p2) {
			alert("Invoke with parameters p1:" + p1 + " p2:" + p2 + "!!!!");
		}		
		// -- It is usually better to place your code in a separate JS file and load it on the page -- //
		// To run code as soon as the document is ready to be manipulated
		$( document ).ready(function() {
		   $( "a#jquery_link" ).click(function( event ) {
		        alert( "Welcome to JQuery World!!!" );
		        // Prevent the default behavior (navigating to http://jquery.com)
		        event.preventDefault();
		        $( this ).hide( "slow" );
		   });
		   
		   // The first line
		   $( "button#link_bold" ).click(function() {
			   $( "a#jquery_link" ).addClass( "test" );
		   });
		   $( "button#link_normal" ).click(function() {
			   $( "a#jquery_link" ).removeClass( "test" );
		   });
		   $( "button#link_hide" ).click(function() {
			   $( "a#jquery_link" ).hide( "slow", function() {
				    alert( "Animation complete." );
			   });
		   });
		   $( "button#link_show" ).click(function() {
			   $( "a#jquery_link" ).show( "slow" );
		   });
		   
		   // The second line
		   $( "button#callback_c1" ).click(function() {
			   $.get( "hello.action", myCallBack1 );
		   });
		   $( "button#callback_c2" ).click(function() {
			   $.get( "hello.action", function() {
				   myCallBack2("Hello", "World");
			   });
		   });
		   
		   // The third line
		   $( "button#htmlChange" ).click(function() {
			   if ($( "button#htmlChange" ).html() == "Continue") {
				   $( "button#htmlChange" ).html( "Next Step..." );
			   } else if ($( "button#htmlChange" ).html() == "Next Step...") {
				   $( "button#htmlChange" ).html( "Get back!" );
			   } else {
				   $( "button#htmlChange" ).html( "Continue" );
			   }
		   });
		   
		   // The fourth line
		   $( "button#weatherBtn" ).click(function() {
			   $.ajax({
				   url: "getWeather.action",
				   data: {
				     zipCode: "97201A"
				   },
				   success: function( data ) {
				     $( "#weatherDisplay" ).html( "<strong>" + data + "</strong> degrees." );
				   }
				 })
		   });
		});
	</script>
	<div><a id="jquery_link" href="http://jquery.com/">JQuery web site link</a><button id="link_bold" class="button">Link Bold</button><button id="link_normal" class="button">Link Normal</button><button id="link_hide" class="button">Link Hide</button><button id="link_show" class="button">Link Show</button></div>
	<div><button id="callback_c1" class="button">Callback Method 01</button><button id="callback_c2" class="button">Callback Method 02</button></div>
	<div><button id="htmlChange" class="button">Continue</button></div>
	<div><button id="weatherBtn" class="button">Tomorrow's Weather?</button><div id="weatherDisplay" style="inline-block;"></div></div>
</body>
</html>