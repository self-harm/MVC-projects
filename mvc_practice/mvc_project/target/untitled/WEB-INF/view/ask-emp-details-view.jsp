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

<form:form acrtion="showDetails" modelAttribute="employee">

    Name <form:input path="name"/>
    <br><br>
    Surname <form:input path="surname"/>
    <br><br>
    Salary <form:input path="salary"/>

    <input type="submit" value="click">

</form:form>



</body>

</html>

