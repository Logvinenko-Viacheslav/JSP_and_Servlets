<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Tabulate</title>
</head>
<body>
    <jsp:useBean id="funcCalcModel" type="com.lab02.lab02.model.FuncCalcModel" scope="request"/>
    <h2>x=</h2> <fmt:formatNumber value="${funcCalcModel.x()}" minFractionDigits="1" maxFractionDigits="5"/> <br/>
    <h2>n=</h2> <fmt:formatNumber value="${funcCalcModel.n()}" minFractionDigits="1" maxFractionDigits="5"/> <br/>
    <h2>e=</h2> <fmt:formatNumber value="${funcCalcModel.e()}" minFractionDigits="1" maxFractionDigits="5"/> <br/>
    <h2>ch(x)=</h2> <fmt:formatNumber value="${funcCalcModel.chXC()}" minFractionDigits="1" maxFractionDigits="5"/> <br/>
</body>
</html>
