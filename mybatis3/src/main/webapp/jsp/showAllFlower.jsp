<%--
  Created by IntelliJ IDEA.
  User: Bioinfo
  Date: 12/17/2018
  Time: 7:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>显示所有花卉信息</title>
</head>
<body>
<div align="center">
    <fieldset style="width: 500px">
        <legend>所有花卉信息</legend>
        <table border="1">
            <tr>
                <th>编号</th>
                <th>名称</th>
                <th>价格</th>
                <th>原产地</th>
            </tr>
            <c:forEach items="${list}" var="flower">
                <tr>
                    <td>${flower.id}</td>
                    <td>${flower.name}</td>
                    <td>${flower.price}</td>
                    <td>${flower.location}</td>
                </tr>
            </c:forEach>
        </table>

    </fieldset>

</div>
请求时的路径：<% out.print(request.getContextPath()); %><br>
请求的类型：<% out.print(request.getContentType());%>
</body>
</html>
