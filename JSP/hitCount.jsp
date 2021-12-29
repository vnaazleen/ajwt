<%@ page import = "java.io.*,java.util.*" %>

<html>
	<head>
		<title>App Obj in JSP</title>
	</head>
	
	<body>
		<% 
			Integer hitCount = (Integer)application.getAttribute("hitCounter");
			
			if(hitCount == null || hitCount == 0) {
				out.println("Welcome to my website :)");
				hitCount = 1;
			} else {
				out.println("Welcome back to my website ;)");
				hitCount += 1;
			}
			
			application.setAttribute("hitCounter", hitCount);
		%>
		
		<center>
			<p>Total no of visits: <%= hitCount %></p>
		</center>
	</body>
</html>