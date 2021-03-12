<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 style="color:blue">Almacenar Empleados SEssion</h1>
        <a href="web15mostrarempleados.htm">
            MOSTRAR
        </a><br/><hr/>
        <c:if test="${ALMACENADOS != NULL}">
            
            empleados almacenados <c:out value="${ALMACENADOS}"/>
        </c:if>
            <c:forEach items="${EMPLEADOS}" var="empleado">
                <li>
                    <c:out value="${empleado.apellido}"/>
                    <a href="web15almacenarempleados.htm?id=${empleado.idempleado}">
                     ALMACENAR EMPLEADO
                    </a>
                </li>
            </c:forEach>
        </ul>
    </body>
</html>
