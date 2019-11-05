<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>短信数据</title>
</head>
<body>
<center>
        <h2>用户数据</h2>
        <c:forEach items="${list}" var="account">
            ${account.name}
            ${account.message}</br>
        </c:forEach>
</center>
</body>
</html>
