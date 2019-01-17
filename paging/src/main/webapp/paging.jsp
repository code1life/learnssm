<%--
  Created by IntelliJ IDEA.
  User: Bioinfo
  Date: 12/18/2018
  Time: 8:07 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<base href="<%=basePath%>">
<head>
    <title>分页显示</title>
</head>
<body>
<div align="center">
    <fieldset style="width: 500px">
        <legend>花卉信息</legend>
        <table border="1">
            <tr>
                <th>编号</th>
                <th>花卉名</th>
                <th>价格</th>
                <th>原产地</th>
            </tr>
            <c:forEach items="${pageInfo.list}" var="flower">
                <tr>
                    <td>${flower.id}</td>
                    <td>${flower.name}</td>
                    <td>${flower.price}</td>
                    <td>${flower.location}</td>
                </tr>
            </c:forEach>
        </table>
        <a href="page?pageNumber=${pageInfo.pageNumber - 1}&pageSize=${pageInfo.pageSize}"
                <c:if test="${pageInfo.pageNumber <= 1}"> style="text-decoration: none;color: black" onclick="return false"</c:if>>上一页</a>&nbsp;&nbsp;
        <a href="page?pageNumber=${pageInfo.pageNumber + 1}&pageSize=${pageInfo.pageSize}"
                <c:if test="${pageInfo.pageNumber == ((pageInfo.totalEntryNumber%pageInfo.pageSize==0)?(pageInfo.totalEntryNumber/pageInfo.pageSize):((pageInfo.totalEntryNumber/pageInfo.pageSize)+1))}">
                    style="text-decoration: none;color: black"
                    onclick="javascript:return false" </c:if>>下一页</a>
    </fieldset>
</div>
</body>
</html>
