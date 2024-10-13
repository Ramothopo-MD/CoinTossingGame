/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Desmond
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String username=request.getParameter("username");
            String password=request.getParameter("password");
            
            String usrname=getServletContext().getInitParameter("usrname");
            String passwd=getServletContext().getInitParameter("passwd");
            CredentialsCheckerInterface cci=new CredentialsManager();
            boolean validity=cci.verify(password, passwd, username, usrname);
             if (validity) {
            RequestDispatcher disp=request.getRequestDispatcher("name_entry.html");
            disp.forward(request, response);
        }else {response.sendRedirect("Login.html");}
    }

  

}
