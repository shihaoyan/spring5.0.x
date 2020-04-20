<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%--
  Created by IntelliJ IDEA.
  User: shy
  Date: 2020/3/1
  Time: 21:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
${sessionScope.user}
${sessionScope.hhh}
<form action="${pageContext.request.contextPath}/user/upload" enctype="multipart/form-data" method="post">
    <input type="date" name="date"><br>
    <input type="file" name="files"><br>
    <input type="file" name="files"><br>
    <input type="file" name="files"><br>
    <input type="file" name="files"><br>
    <input type="submit" value="提交">
</form>
<br>
<c:if test="${paths!=null}">
    <c:forEach items="${paths}" var="str">
        <img src="${pageContext.request.contextPath}/static/images/${str}"><br>
    </c:forEach>
</c:if>
</body>
</html>
