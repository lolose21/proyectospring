<%-- 
    Document   : web05tablamultiplicar
    Created on : 08-mar-2021, 19:50:51
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
        <h1>Tabla Multiplicar</h1>
        <form method="post">
            <label>NUMERO</label>
            <input type="text" name="numero" required/>
            <button type="submit">
                MULTIPLICAR
            </button>
        </form>
        
        <c:if test="${TABLA != null}">
            <table border="1">
            <thead>
                <tr>
                    <th>numero</th>
                    <th> multiplicado</th>
                    <th>total</th>
                </tr>
            </thead>
            <tbody>
                <%--
            <c:out value="${TABLA}" escapeXml="false"/>
                --%>
                <c:forEach items="${TABLA}" var="fila">
                    
                    <tr>
                        <td>
                            <c:out value="${fila.operacion}"/>
                        </td>
                       
                        <td>
                            <c:out value="${fila.resultado}"/>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
        </table>
         </c:if>
    </body>
</html>
