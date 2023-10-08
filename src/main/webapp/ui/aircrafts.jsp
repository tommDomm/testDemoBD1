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
    <title>aircraft</title>
</head>
<body>
<div class="container">
    <div class="login">
        <div class="row">
            <h2>aircrafts</h2>
            <div class="col-md-12">
                <table id="aircrafts">
                    <c1:forEach var="aircraft" items="${aircrafts}">
                        <tr>
                            <th><c1:out value="${aircraft.getAircraftCode()}"/></th>
                            <th><c1:out value="${aircraft.getModel()}"/></th>
                            <th><c1:out value="${aircraft.getRange()}"/></th>
                        </tr>
                    </c1:forEach>
                </table>

            </div>
        </div>
    </div>
</div>


</body>
</html>
