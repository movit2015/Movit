<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>인사</title>
</head>
<body>
인사말: <strong>${greeting}</strong><br><br><br>

Today's Box Office<br>
Top 10<br>
<br><br>
Random Movies<br>
<c:url value="/detail.do" var="mvDetail" />
		<a href="${mvDetail}">movie1</a>


</body>
</html>
