<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 30.01.2021
  Time: 17:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h2>Information for all employees</h2>

<security:authorize access="hasRole('HR')">
<input type="button" value="Salary"
    onclick="window.location.href = 'hr_info'">
<br>
<i>Only for HR staff</i>
</security:authorize>


<br><br>


<security:authorize access="hasRole('MANAGER')">
<input type="button" value="Performance"
       onclick="window.location.href = 'managers_info'">
<br>
<i>Only for Managers</i>
</security:authorize>

</body>
</html>
