<%-- 
    Document   : outcome
    Created on : 25 Mar 2024, 9:39:37 PM
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
        <%
            String name=(String) session.getAttribute("name");
            String toss=(String) session.getAttribute("toss");
            String guess=(String) session.getAttribute("guess");
            String outcome=(String) session.getAttribute("outcome");
            
            %>
            <table border="1">
                <p>Hi <%=name%> find the outcome below</p>
                <tbody>
                    <tr>
                        <td>tossed by computer</td>
                        <td><%=toss%></td>
                    </tr>
                    <tr>
                        <td>tossed by <%=name%></td>
                        <td><%=guess%></td>
                    </tr>
                    <tr>
                        <td>Outcome is </td>
                        <td><%=outcome%></td>
                    </tr>
                   
                </tbody>
            </table>
                    <p>click <a href="coinTossingServlet">here</a> to continue with the game.
                        and click <a href="summary.jsp">here</a> to get a summary</p>
    </body>
</html>
