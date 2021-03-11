<%-- 
  
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
        <h1>Tenista</h1>
        <h2 style="color:blue">
            NOMBRE  : <c:out value="${TENIS.nombre}"/>
            <hr/>
            PALMARÉS  :  <c:out value="${TENIS.palmares}"/>
            <hr/>
            IMAGEN  : <img src="${TENIS.imagen}" style="width: 350px; height: 350px"/>
        </h2>
    </body>
</html>
