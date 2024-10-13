<%-- 
    Document   : session_started
    Created on : 25 Mar 2024, 6:53:39 PM
    Author     : Desmond
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Session stared</h1>
        <%
         String usrname=(String) session.getAttribute("usrname");
         String compname=(String) session.getAttribute("compname");
        %>
        
        <p>Hi<%=usrname%> , I am <%=compname%> your session has started.Click <a href="coinTossingServlet.do">here</a> to start the game.</p>
    </body>
</html>
