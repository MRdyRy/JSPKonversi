<%-- 
    Document   : newjspLearn
    Created on : 11-Dec-2017, 14:01:53
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page with Java   </title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%= new java.util.Date()%>

        <table border=2>
            <tr><th>Name</th>
                <th>Address</th>
                <th>Salary</th>
                <th>Department</th>
            </tr>
            <tr>
                <td>${emp.name}</td>
                <td>${emp.address}</td>
                <td>${emp.salary}</td>
                <td>${emp.department}</td>
        </tr>
    </table>
        <br/>
    <form>
        <input type="text" required="true"/>
        <button type="submit">Save</button>
    </form>


</body>
</html>
