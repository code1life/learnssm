<%--
  Created by IntelliJ IDEA.
  User: Bioinfo
  Date: 12/16/2018
  Time: 8:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>显示所有花卉信息</title>
    <style type="text/css">
        a {
            color: black;
            text-decoration: none;
        }

        a:hover {
            color: chartreuse;
        }
    </style>
</head>
<body>
<div align="center">
    <fieldset style="width:500px">
        <legend>所有花卉信息</legend>
        <table border="1">
            <tr>
                <th>编号</th>
                <th>名称</th>
                <th>价格</th>
                <th>原产地</th>
                <th>选项</th>
            </tr>
            <c:forEach items="${list }" var="flower">
                <tr>
                    <td>${flower.id}</td>
                    <td>${flower.name}</td>
                    <td>${flower.price}</td>
                    <td>${flower.location}</td>
                    <td><input type="checkbox"></td>
                </tr>
            </c:forEach>
        </table>
    </fieldset>
    <a href="/javaweb/servletjsp/addFlower.jsp">新增花卉信息</a>&nbsp;&nbsp;
    <a href="/javaweb/deleteFlower">删除所选花卉</a>&nbsp;&nbsp;
    <a href="/javaweb/alterFlower.jsp">修改所选花卉</a>
    <br><% out.print(request.getContextPath());%><br>

    <% String path = request.getContextPath();String link=path+"/servletjsp/addFlower.jsp";%>
    <a href='<%=link%>'>绝对路径写法</a>
</div>
</body>
</html>
