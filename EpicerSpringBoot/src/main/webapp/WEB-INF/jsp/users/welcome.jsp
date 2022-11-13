<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org"
	  xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity5">
<head>
<link rel="stylesheet" href="https://unpkg.com/purecss@2.0.6/build/pure-min.css">
<meta charset="UTF-8">
<title>Welcome page</title>
</head>
<body style="padding: 20px">
	<h1>Welcome page</h1>
	<ul>
		<li>登入帳號（name）: <span>${name}</span></li>
		<li>登入帳號（principal.username）: <span sec:authentication="principal.username"></span></li>
		<li>憑證（credentials）: <span sec:authentication="credentials"></span></li>
		<li>權限與角色（authorities）: <span sec:authentication="authorities"></span></li>
		<li>客戶端地址（details.remoteAddress）: <span sec:authentication="details.remoteAddress"></span></li>
		<li>Session Id（details.sessionId）: <span sec:authentication="details.sessionId"></span></li>
	</ul>
	<div sec:authorize="hasRole('manager')">Hello manager 您好!</div>
    <div sec:authorize="hasRole('employee')">Hello employee 您好!</div>
	<button sec:authorize="hasAuthority('admin')">管理按鈕</button>
	<button sec:authorize="hasAnyAuthority('normal', 'admin')"
			onclick="location.href='/logout';" >離開按鈕</button>
</body>
</html>