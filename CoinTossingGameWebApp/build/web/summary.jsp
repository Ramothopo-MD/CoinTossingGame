<%-- 
    Document   : summary
    Created on : 25 Mar 2024, 10:10:44 PM
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
        <h1>Hello World!</h1>
         <%
            String compname=(String) session.getAttribute("compname");
            int count=(Integer) session.getAttribute("count");
            int numCorrectGuesses=(Integer) session.getAttribute("numCorrectGuesses");
            String usrname=(String) session.getAttribute("usrname");
            
            %>
            <table border="1">
               
                <tbody>
                    <tr>
                        <td>number of tosses made by <%=compname%></td>
                        <td> <%=count%></td>
                    </tr>
                    <tr>
                        <td>Number of correct guesses</td>
                        <td><%=numCorrectGuesses%></td>
                    </tr>
                    <tr>
                        <td>These guesses where made by</td>
                        <td><%=usrname%></td>
                    </tr>
                   
                </tbody>
            </table>
                    <p> please click <a href="EndSessionServlet.do">here</a> to end the session</p>
    </body>
</html>
