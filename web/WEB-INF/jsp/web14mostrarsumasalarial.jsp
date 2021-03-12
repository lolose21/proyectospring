<%-- 
    Document   : web14mostrarsumasalarial
    Created on : 12-mar-2021, 17:22:08
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
        <h1>Suma salarial session</h1>
        <a href="web14almacenarsalario.htm">
            MOSTRAR SUMA SALARIAL
        </a>
        <c:choose>
            <c:when test="${sessionScope.SUMASALARIAL != null}">
                <h1 style="color: chocolate">
                    la suma salarial es <c:out value="${sessionScope.SUMASALARIAL}"/>
                </h1>
            </c:when>
            <c:otherwise>
                <h1 style="color: red">no existe salarios almacenados
                    
                </h1>
            </c:otherwise>
        </c:choose>
    </body>
</html>
