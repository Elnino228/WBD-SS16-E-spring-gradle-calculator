<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>Calculator</h1>
<form:form method="post" action="calculate" modelAttribute="calculator">
    <form:input path="firstOperand"></form:input>
    <form:input path="secondOperand"></form:input>
    <br>
    <br>
    <button type="submit" name="operator" value="+">Addition(+)</button>
    <button type="submit" name="operator" value="-">Subtraction(-)</button>
    <button type="submit" name="operator" value="x">Multiplication(x)</button>
    <button type="submit" name="operator" value="/">Division(/)</button>
    <br>
    <br>
    <p>Result: ${calculator.result}</p>

</form:form>
<%--<form method="post" action="/calculate">--%>
<%--    <input type="text" name="firstOperand">--%>
<%--    <input type="text" name="secondOperand">--%>
<%--    <br>--%>
<%--    <br>--%>
<%--    <input type="submit" name="operator" value="Addition(+)">--%>
<%--    <input type="submit" name="operator" value="Subtraction(-)">--%>
<%--    <input type="submit" name="operator" value="Multiplication(x)">--%>
<%--    <input type="submit" name="operator" value="Division(/)">--%>
<%--    <br>--%>
<%--    <br>--%>
<%--    <p>Result: ${result}</p>--%>

<%--</form>--%>
</body>
</html>