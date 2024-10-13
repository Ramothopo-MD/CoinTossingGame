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
import javax.servlet.http.HttpSession;

/**
 *
 * @author Desmond
 */
public class StartSession extends HttpServlet {

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            HttpSession  session=request.getSession(true);
            String name=request.getParameter("name");
            
            initialiseSession(session,name);
            
            RequestDispatcher disp=request.getRequestDispatcher("session_started.jsp");
            disp.forward(request, response);
    }

    private void initialiseSession(HttpSession session, String name) {
     int count=0,numCorrectGuesses=0;
     session.setAttribute("name", name);
     session.setAttribute("count", count);
     session.setAttribute("numCorrectGuesses",numCorrectGuesses);
    }

}
