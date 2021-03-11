<%-- 
    Document   : web06departamentos
    Created on : 09-mar-2021, 16:48:50
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>DEPARTAMENTOS SPRING!</h1>
        <table border="1">
            <thead>
                <tr>
                    <th>id</th>
                    <th>nombre</th>
                    <th>localidad</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${DEPARTAMENTOS}" var="dept">
                    <tr>
                        <td>
                            <c:out value="${dept.idDepartamento}"/>
                        </td>
                        <td>
                            <c:out value="${dept.nombre}"/>
                        </td>
                        <td>
                            <c:out value="${dept.localidad}"/>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
