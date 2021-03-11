<%-- 
    Document   : web08containerdepartamentos
    Created on : 09-mar-2021, 19:44:20
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
        <h1>Container Departamentos</h1>
        <form method="post">
            <label>ID departamento</label>
            <input type="text" name="id" required/>
            <button type="submit"> buscar departamento </button>
        </form>
        <c:if test="${DEPARTAMENTO != null}">
            <hr/>
            <h1 style="color:green">
                <c:out value="${DEPARTAMENTO.nombre}"/>
                <c:out value="${DEPARTAMENTO.localidad}"/>
            </h1>
        
        </c:if>
    </body>
</html>
