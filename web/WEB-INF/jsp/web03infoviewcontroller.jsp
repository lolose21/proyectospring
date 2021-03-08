<%-- 
    Document   : web03infoviewcontroller
    Created on : 08-mar-2021, 17:50:51
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>SUMAR NUMEROS</h1>
        <form method="post">
            <label>Numero 1; </label>
            <input type="text" name="numero1" required/><br/>
            <label>NUMERO 2</label>
            <input type="text" name="numero2" required/><br/>
            <button type="submit">MOSTRAR SUMA</button>
        </form>
        <c:if test="${RESPUESTA != null}">
            <c:out value="${RESPUESTA}" escapeXml="false"/>
        </c:if>
    </body>
</html>
