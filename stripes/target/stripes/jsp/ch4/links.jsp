<%--
  Created by IntelliJ IDEA.
  User: Bioinfo
  Date: 12/19/2018
  Time: 4:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Chapter 4</h2>
<ul>
    <li>
        <stripes:link beanclass="vin.ch4.URLMappingActionBean">
            URLMappingActionBean#index
        </stripes:link>
    </li>
    <li>
        <stripes:link beanclass="vin.ch4.URLMappingActionBean" event="eventOne">
            URLMappingActionBean@eventOne
        </stripes:link>
    </li>
    <li>
        <stripes:link href="${pageContext.request.contextPath}/action/UrlMapping/eventtwo">
            URLMappingActionBean#differentMethodName()
        </stripes:link>
    </li>
</ul>
</body>
</html>
