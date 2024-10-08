<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Tabulate</title>
</head>
<body>

    <jsp:useBean id="tabModel" type="com.lab02.lab02.model.TabModel" scope="request"/>
    <table>
        <c:forEach var="p" items="${tabModel.points}">
            <tr>
                <td>
                    <fmt:formatNumber value="${p.x()}" minFractionDigits="1" maxFractionDigits="5"/>
                </td>
            </tr>
            <tr>
                <td>
                    <fmt:formatNumber value="${p.y()}" minFractionDigits="1" maxFractionDigits="5"/>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
