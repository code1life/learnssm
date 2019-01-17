<%--
  Created by IntelliJ IDEA.
  User: Bioinfo
  Date: 12/20/2018
  Time: 10:52 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>complex variable</title>
</head>
<body>

<div align="center">
    <fieldset style="width: 500px">
        <legend>List</legend>
        <table border="1">
            <c:forEach items="${actionBean.bookTopics}" var="bookTopic">
                <tr>
                    <td>${bookTopic}</td>
                </tr>
                <tr>
                    <td><c:out value="${bookTopic}"></c:out></td>
                </tr>
            </c:forEach>
        </table>
    </fieldset>
    <fieldset style="width: 500px">
        <legend>Map</legend>
        <table border="1">
            <c:forEach items="${actionBean.chapters}" var="chapter">
                <tr>
                    <td>${chapter.key}</td>
                    <td>${chapter.value}</td>
                </tr>
            </c:forEach>
        </table>
    </fieldset>

</div>

</body>
</html>
