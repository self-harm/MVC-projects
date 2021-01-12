<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<br>

<h2>Dear Employee, you are welcome!</h2>

<br>
<br>
<br>
<br>

<%--Your name: ${param.employeeName}--%>

Your name: ${employee.name}
<br>
Your last name: ${employee.surname}
<br>
Your salary: ${employee.salary} :(
<br>
Select your department: ${employee.department}
<br>
Your car: ${employee.carBrand}
<br>
Your language(s):
<%--перечисление languages:--%>
<ul>
    <c:forEach var="lang" items="${employee.languages}">
        <li>
            ${lang}
        </li>
    </c:forEach>
</ul>

Your phone number: ${employee.phoneNumber}

<br>

Your email: ${employee.email}

</body>

</html>

