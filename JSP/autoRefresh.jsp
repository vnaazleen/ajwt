<%@ page import="java.io.*, java.util.*" %>

<!doctype html>
<html>
<head>
	<title>Auto refresh</title>
</head>
<body>
	<center><h1>AUTO REFERSH</h1>
	<%
		//response.setIntHeader("refresh", 5);
		GregorianCalendar cal = new GregorianCalendar();
		
		String am_pm;
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		if(cal.get(Calendar.AM_PM) == 0) {
			am_pm = "AM";
		} else {
			am_pm = "PM";
		}
		
		String curTime = hour + ":" + min + ":" + sec + " " + am_pm;
		out.println("Current time: " + curTime);
	%>
	</center>
</body>
</html>