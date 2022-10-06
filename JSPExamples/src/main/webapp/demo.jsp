<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Welcome to html web page</h2>
<%-- JSP COMMENTS --%>
<%! int a,b,sum; %>
<%
sum=a+b;
out.println("welcome to jsp <br>");
out.println("sum of two number is "+sum);
a=100;
b=200;
sum=a+b;
out.println("</br> <font color=red> sum of two numbers is "+sum+"</font>");
%>
<br/>
<p>sum of two numbers is <%=10+20 %></p>
<p>sum of two numbers is<%=sum %></p>
<font color="red">sum of<%=a %> and <%=b %> is <%=sum %></font>



</body>
</html>