<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<br>

<h2>Dear Employee, Please enter your details</h2>

<br>

<%--
   for MyController

   <form action="showDetails" method="get">

        <input type="text" name="employeeName"
        placeholder="Write your name"/>
        <input type="submit"/>

    </form>--%>

<%--using forms from springframeword(check Controller2)--%>

<form:form action="showDetails" modelAttribute="employee">

    Name <form:input path="name"/>
    <br><br>
    Surname <form:input path="surname"/>
    <br><br>
    Salary <form:input path="salary"/>
    <br><br>
    Department <form:select path="department">
  
   <%--1.hard-coded вариант--%>
   <%-- <form:option value="Information Technology" label="IT"/>
    <form:option value="Human Resources" label="HR"/>
    <form:option value="Sales" label="Sales"/>--%>
   
   <%--2. вариант через HashMap'у--%>
    <form:options items="${employee.departments}"/>
    <br><br>
</form:select>

    <input type="submit" value="click me">

</form:form>



</body>

</html>

