<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新增用户</title>
</head>
<body>
	<center>
		<form action="<c:url value="/checkUser.html"/>" method="post">
			<table>
				<tr>
					<td>用户名</td>
					<td><input type="text" name="username"/></td>
				</tr>
				<tr>
					<td>密码</td>
					<td><input type="password" name="password"/></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" name="提交"/></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>