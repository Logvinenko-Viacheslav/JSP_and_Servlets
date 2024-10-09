<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<h1>Practice02</h1>
<br/>
<h2>Task 1:</h2>
<br/>
  <form method="post" action="calculate-function">
    <label for="t1-x">x:</label>
    <input type="number" step="0.00001" id="t1-x" name="task1-x">
    <label for="t1-n">n:</label>
    <input type="number" id="t1-n" name="task1-n">
    <label for="t1-e">e:</label>
    <input type="number" step="0.00001" id="t1-e" name="task1-e">
    <input type="hidden" name="task-number" value="1">
    <button type="submit">Calculate</button>
  </form>
<br/><br/><br/>
<h2>Task2:</h2>
<form method="post" action="calculate-tab">
  <label for="t2-a">a:</label>
  <input type="number" step="0.00001" id="t2-a" name="task2-a">
  <label for="t2-b">b:</label>
  <input type="number" step="0.00001" id="t2-b" name="task2-b">
  <label for="t2-h">h:</label>
  <input type="number" step="0.00001" id="t2-h" name="task2-h">
  <input type="hidden" name="task-number" value="2">
  <button type="submit">Calculate</button>
</form>
</body>
</html>