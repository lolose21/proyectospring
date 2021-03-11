<%-- 
    Document   : web11hospitales
    Created on : 10-mar-2021, 20:52:06
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
        <h1>BUSCAR HOSPITALES</h1>
        <form method="post">
            <label>ID HOSPITAL</label>
            <input type="text" name="id" required/>
            <button type="submit">
                BUSCAR
            </button>
        </form>
        <c:if test="${HOSPITAL != null}">
            <table border="1">
                <thead>
                    <tr>
                        <th>ID HOSPITAL</th>
                        <th>NOMBRE</th>
                        <th>DIRECCION</th>
                        <th>TELEFONO</th>
                        <th>NUMERO DE CAMAS</th>
                        
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>
                            <c:out value="${HOSPITAL.hospitlcod}"/>
                        </td>
                        <td>
                            <c:out value="${HOSPITAL.nombre}"/>
                        </td>
                        <td>
                            <c:out value="${HOSPITAL.direccion}"/>
                        </td>
                        <td>
                            <c:out value="${HOSPITAL.telefono}"/>
                        </td>
                        <td>
                            <c:out value="${HOSPITAL.numcama}"/>
                        </td>
                    </tr>
                </tbody>
            </table>
            
        </c:if>
    </body>
</html>
