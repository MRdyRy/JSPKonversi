<%-- 
    Document   : employee
    Created on : 11-Dec-2017, 16:29:24
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="1">
            <tr><td>Name</td><td>Address</td><td>Salary</td><td>Department</td></tr>
            <tr><td>${emp.name}</td><td>${emp.address}</td><td>${emp.salary}</td><td>${emp.department}</td></tr>
        </table>
    </body>
</html>
