<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    
    	String message = (String)request.getAttribute("failMsg");
    
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h1><%= message %></h1>
    <a href="/WebContent/index.jsp">메인페이지로 돌아가기</a>
</body>
</html>