<%-- 
    Document   : index
    Created on : 21/05/2013, 07:53:27
    Author     : Denis Lemes Liess
--%>

<%@page import="pi.projeto.modelo.Cargo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Cargo c = (Cargo)request.getAttribute("cargo");

    if(c==null)
        c = new Cargo();
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="serv">
            <input type="text" name="descricao" value="<%=c.getDescricao()%>" class=""/>
            <input type="submit" value="Enviar" />
        </form>
    </body>
</html>
