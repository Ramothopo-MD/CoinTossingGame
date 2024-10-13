<%-- 
    Document   : guess_toss
    Created on : 25 Mar 2024, 9:13:12 PM
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
         <form action="GuessServlet.do" method="POST">
            <table>
                <tr>
                    <td>
                        <select name="guess">
                            <option value="head">Head</option>
                            <option value="tail">Tail</option>
                        </select>
                    </td>
                </tr>
            </table>
            <input type="Submit" >
        </form>
    </body>
</html>
