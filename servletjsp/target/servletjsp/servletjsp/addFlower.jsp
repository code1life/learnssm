<%--
  Created by IntelliJ IDEA.
  User: Bioinfo
  Date: 12/16/2018
  Time: 9:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增花卉信息</title>
    <script type="javascript">
        $(function () {

        });
    </script>
</head>
<body>
<div align="center">

    <fieldset style="width: 500px">
        <legend>新增花卉信息：</legend>
        <form action="/javaweb/addFlower" method="post">
            <table>
                <tr>
                    <td>花卉名称：</td>
                    <td><input type="text" name="name"></td>
                </tr>
                <tr>
                    <td>价格：</td>
                    <td><input type="text" name="price"></td>
                </tr>
                <tr>
                    <td>原产地：</td>
                    <td><input type="text" name="location"></td>
                </tr>
                <tr>
                    <td colspan="2" align="center"><input type="submit" value="提交"><input type="reset" value="重置"></td>
                </tr>

            </table>
        </form>
    </fieldset>

</div>
</body>
</html>
