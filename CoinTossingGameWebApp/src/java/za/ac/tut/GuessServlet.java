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
public class GuessServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            HttpSession session=request.getSession();
            String toss=(String) session.getAttribute("toss");
            String guess=(String) request.getParameter("guess");
            CoinTossingInterface cti=new CoinTossManager();
            String outcome=cti.compareToToss(guess,toss);
            session.setAttribute("outcome",outcome);
            cti.updateSession(request, outcome);
            
            RequestDispatcher disp=request.getRequestDispatcher("outcome.jsp");
            disp.forward(request, response);
    }

}
