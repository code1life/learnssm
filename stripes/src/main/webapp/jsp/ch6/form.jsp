<%--
  Created by IntelliJ IDEA.
  User: Bioinfo
  Date: 12/20/2018
  Time: 2:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes-dynattr.tld" %>
<html>
<head>
    <title>dvd</title>
</head>
<body>
<div align="center">
    <fieldset style="width: 500px">
        <legend>DVD Infomation</legend>
        <stripes:form beanclass="${actionBean.getClass()}">
            <table border="1">
                <tr>
                    <td>Title:</td>
                    <td><stripes:text name="dvdTitle"></stripes:text></td>
                </tr>
                <tr>
                    <td>Genre:</td>
                    <td>
                        <stripes:select name="dvdGenre">
                            <stripes:option value="Comedy">Comedy</stripes:option>
                            <stripes:option value="Romance" selected="">Romance</stripes:option>
                            <stripes:option value="Action">Action</stripes:option>
                            <stripes:option value="Horror">Horror</stripes:option>
                            <stripes:option value="Other">Other</stripes:option>
                        </stripes:select>
                    </td>
                </tr>
                <tr>
                    <td>Cost:</td>
                    <td><stripes:text name="dvdCost"></stripes:text></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <stripes:submit name="save" value="Submit"></stripes:submit>
                    </td>
                </tr>
            </table>
        </stripes:form>
    </fieldset>
</div>
</body>
</html>
