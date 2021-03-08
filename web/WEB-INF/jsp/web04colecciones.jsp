<%-- 
    Document   : web04colecciones
    Created on : 08-mar-2021, 19:07:46
    Author     : Usuario
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Colecciones personas jstl</h1>
        <table border="1">
            <thead>
                <tr>
                    <th>nombre</th>
                    <th>email</th>
                    <th>edad</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${PERSONAS}" var="person">
                    <tr>
                        <td>
                            <c:out value="${person.nombre}"/>
                        </td>
                        <td>
                            <c:out value="${person.email}"/>
                        </td>
                         <td>
                            <c:out value="${person.edad}"/>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
