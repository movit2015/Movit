<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<title>인사</title>
</head>
<body>
<form:form CommandName="StorageMv" method="post">
Movie 상세페이지<br><br>
<table>
<form:input path="memberIdx" value="1"/>
<tr><td>title</td><td><form:input path="s_title" value="avengers"/></td></tr>
<tr><td>image</td><td><form:input path="s_img" value="abc"/></td></tr>
<tr><td>director</td><td><form:input path="s_director" value="a"/></td></tr>
<tr><td>actor</td><td><form:input path="s_actor" value="b"/><td></tr>
<tr><td>genre</td><td><form:input path="s_genre" value="action"/></td></tr>
<tr><td>nation</td><td><form:input path="s_nation" value="America"/></td></tr>
<tr><td>published year</td><td><form:input path="s_pubYear" value="2015"/></td></tr>
<tr><td>running time</td><td><form:input path="s_time" value="2"/></td></tr>
</table>
<br><br>
별점 : ${rating} <br><br>
다시 평가하기 

<form:input path="s_rating" value="${StorageMv.rating}"/>
<input type="submit" value="submit">
</form:form>

</body>
</html>
