/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut;

import java.util.Random;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Desmond
 */
public class CoinTossManager implements CoinTossingInterface{

    @Override
    public String tossCoin() {
        Random rand=new Random();
      String opts[]={"head","tail"};
      int num=rand.nextInt(2);
        
        return opts[num];
        }

    @Override
    public String compareToToss(String userGuess, String computerToss) {
        if (userGuess.equalsIgnoreCase(computerToss)) {
            return "won";
        }else{
            return "lost";
        }
}

    @Override
    public void updateSession(HttpServletRequest request, String outcome) {
        HttpSession session=request.getSession();
        if (outcome.equalsIgnoreCase("won")) {
            int numCorrectGuesses=(int) session.getAttribute("numCorrectGuesses");
            numCorrectGuesses++;
            session.setAttribute("numCorrectGuesses",numCorrectGuesses);
            
        }
            int count=(int) session.getAttribute("count");
            count++;
            session.setAttribute("count", count);
        
        
        }
    }


    

