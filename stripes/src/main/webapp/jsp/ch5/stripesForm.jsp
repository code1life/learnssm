<%--
  Created by IntelliJ IDEA.
  User: Bioinfo
  Date: 12/20/2018
  Time: 12:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld" %>
<html>
<head>
    <title>stripes form</title>
</head>
<body>
<p>Form fields using stripes:form tags:...</p>
<stripes:form beanclass="${actionBean.class}">
    <stripes:text name="" value=""></stripes:text>
    <stripes:checkbox name="" value=""></stripes:checkbox>
    <stripes:radio value="" name=""></stripes:radio>
    <stripes:hidden name="" value=""></stripes:hidden>
    <stripes:select name="">
        <stripes:option value="1">Option1</stripes:option>
        <stripes:option value="2">Option2</stripes:option>
    </stripes:select>
    <stripes:button name="" value="Button"></stripes:button>
    <stripes:button name="" value="Submit"></stripes:button>
</stripes:form>
</body>
</html>
