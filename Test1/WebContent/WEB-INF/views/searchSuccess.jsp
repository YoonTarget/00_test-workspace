<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    
    	int userNo = (int)request.getAttribute("userNo");
    	String userId = (String)request.getAttribute("userId");
    	String userName = (String)request.getAttribute("userName");
    	int userAge = (int)request.getAttribute("userAge");
    
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h1>회원정보</h1>
    <table border="1">
        <tr>
            <th>회원번호</th>
            <th>회원아이디</th>
            <th>회원이름</th>
            <th>회원나이</th>
        </tr>
        <tr>
            <th><%= userNo %></th>
            <th><%= userId %></th>
            <th><%= userName %></th>
            <th><%= userAge %></th>
        </tr>
    </table>
    <a href="/WebContent/index.jsp">메인페이지로 돌아가기</a>
</body>
</html>