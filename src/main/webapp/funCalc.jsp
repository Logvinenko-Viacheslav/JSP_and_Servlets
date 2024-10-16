<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Function Calc</title>
</head>
<body>
    <jsp:useBean id="funcCalcModel" type="com.lab02.lab02.model.FuncCalcModel" scope="request"/>
    <h2>x= <fmt:formatNumber value="${funcCalcModel.x}" minFractionDigits="1" maxFractionDigits="5"/> </h2>
    <h2>n= <fmt:formatNumber value="${funcCalcModel.n}" minFractionDigits="1" maxFractionDigits="5"/> </h2>
    <h2>e= <fmt:formatNumber value="${funcCalcModel.e}" minFractionDigits="1" maxFractionDigits="5"/> </h2>
    <h2>ch(x)= <fmt:formatNumber value="${funcCalcModel.chXC}" minFractionDigits="1" maxFractionDigits="9"/> (by n)</h2>
    <h2>ch(x)= <fmt:formatNumber value="${funcCalcModel.chXDandN[0]}" minFractionDigits="1" maxFractionDigits="9"/> (by e)</h2>
    <h2>n= <fmt:formatNumber value="${funcCalcModel.chXDandN[1]}" minFractionDigits="1" maxFractionDigits="5"/> (by e)</h2>
    <h2>ch(x)= <fmt:formatNumber value="${funcCalcModel.accurateChX}" minFractionDigits="1" maxFractionDigits="9"/> ("accurate")</h2>
</body>
</html>
