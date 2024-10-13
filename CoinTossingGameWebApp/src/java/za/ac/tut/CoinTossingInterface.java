/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Desmond
 */
public interface CoinTossingInterface {
    public String tossCoin();
    public String compareToToss(String userGuess,String computerToss);
    public void updateSession(HttpServletRequest request,String outcome);
}
