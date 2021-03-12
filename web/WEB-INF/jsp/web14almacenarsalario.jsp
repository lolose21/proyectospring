<%-- 
    Document   : web14almacenarsalario
    Created on : 12-mar-2021, 16:45:01
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Almacenar salarios SEssion</h1>
         <a href="web14mostrarsumasalarial.htm">
            MOSTRAR SUMA SALARIAL
        </a>
        <c:if test="${SALARIO != null}">
            <h1 style="color: blue">
                Salario Amacenado <c:out value="${SALARIO}"/>.
            </h1>
        </c:if>
        <ul>
            <c:forEach items="${EMPLEADOS}" var="empleado">
                <li>
                    <c:out value="${empleado.apellido}"/>
                    <a href="web14almacenarsalario.htm?salario=${empleado.salario}">
                    Almacenar Salario
                    </a>
                </li>
            </c:forEach>
        </ul>
    </body>
</html>
