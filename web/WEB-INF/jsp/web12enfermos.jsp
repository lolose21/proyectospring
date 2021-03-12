

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form method="post">
            <label>INSCRIPCION</label>
            <input type="text" name="inscripcion" required/>
            <button type="submit">ELIMINAR</button>
        </form>
        <c:if test="${ENFERMOS != null}">
            <table border="1">
                <thead>
                    <tr>
                        <th>INSCRIPCION</th>
                        <th>APELLIDO</th>
                        <th>DIRECCION</th>
                        <th>FECHA</th>
                        <th>SEXO</th>
                        <th>NSS</th>
                        
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>
                            <c:forEach items="${ENFERMOS}" var="enfermoS"/>
                        </td>
                        <td>
                            <c:out value="${ENFERMOS.inscripcion}"/>
                        </td>
                        <td>
                            <c:out value="${ENFERMOS.apellido}"/>
                        </td>
                        <td>
                            <c:out value="${ENFERMOS.direccion}"/>
                        </td>
                        <td>
                            <c:out value="${ENFERMOS.fechanac}"/>
                        </td>
                        <td>
                            <c:out value="${ENFERMOS.sexo}"/>
                        </td>
                        <td>
                            <c:out value="${ENFERMOS.nss}"/>
                        </td>
                    </tr>
                </tbody>
            </table>
            
        
        </c:if>
    </body>
</html>
