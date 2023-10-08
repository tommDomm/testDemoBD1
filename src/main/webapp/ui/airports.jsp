<%--
  Created by IntelliJ IDEA.
  User: serggg41
  Date: 08.10.2023
  Time: 18:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java"
         contentType="text/html;charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c1" uri="jakarta.tags.core" %>
<%@ taglib prefix="f" uri="jakarta.tags.fmt" %>
<%@ taglib prefix="c2" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>airports</title>
</head>
<body>
<div class="container">
    <div class="login">
        <div class="row">
            <h2>airports</h2>
            <div class="col-md-12">
                <table id="airports">
                    <c1:forEach var="airport" items="${airports}">
                        <tr>
                            <th><c1:out value="${airport.getAirportCode()}"/></th>
                            <th><c1:out value="${airport.getAirportName()}"/></th>
                            <th><c1:out value="${airport.getCity()}"/></th>
                            <th><c1:out value="${airport.getCoordinate()}"/></th>
                            <th><c1:out value="${airport.getTimeZone()}"/></th>
                        </tr>
                    </c1:forEach>
                </table>
            </div>
        </div>
    </div>
</div>
</body>
</html>
