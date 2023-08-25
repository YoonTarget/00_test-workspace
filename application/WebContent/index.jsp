<%@page import="org.kh.member.model.vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String contextPath = request.getContextPath();

	MemberVO m = (MemberVO)session.getAttribute("m");
	
	String alertMsg = (String)session.getAttribute("alertMsg");
	
	int result = (int)session.getAttribute("result");
	
	String failMsg = (String)session.getAttribute("failMsg");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<% if(m != null) { %>
	
		<% if(result > 0) { %>
		
			<script>
				alert("alertMsg");
			</script>
			
			<h2><%= m.getUserName() %> 님의 가입정보입니다.</h2>
		
			<table border="1">
				<tr>
					<th>아이디</th>
					<th>비밀번호</th>
					<th>주소</th>
				</tr>
				<tr>
					<td><%= m.getUserId() %></td>
					<td><%= m.getUserPw() %></td>
					<td><%= m.getUserAddr() %></td>
				</tr>
			</table>
			
		<% } else { %>
		
			<h2><%= failMsg %></h2>
			
		<% } %>
	
	<% } else { %>

		<form action="<%= contextPath %>/insert.me" method="post">
		
			아이디 : <input type="text" name="userId" required> <br>
			비밀번호 : <input type="password" name="userPw" required> <br>
			이름: <input type="text" name="userName" required> <br>
			주소 : <input type="text" name="userAddr" required> <br><br>
			
			<input type="submit" value="전송">
		
		</form>
	
	<% } %>
	
</body>
</html>