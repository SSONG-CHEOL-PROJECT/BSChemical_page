<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<c:forEach items="${css}" var="item">
	<link rel="stylesheet" type="text/css" href="/resources/css/${item}.css?cggg=13">
</c:forEach>
<link href="https://fonts.googleapis.com/css2?family=Play:wght@400;700&display=swap" rel="stylesheet">

<title>${title}</title>
</head>
<body>
	<jsp:include page="/WEB-INF/views/${header_temp}.jsp"></jsp:include>
	<jsp:include page="/WEB-INF/views/${view}.jsp"></jsp:include>
	<jsp:include page="/WEB-INF/views/${footer_temp}.jsp"></jsp:include>
</body>


<script src="/resources/js/wow.js"></script>
<script>
    new WOW().init();
</script>


</html>