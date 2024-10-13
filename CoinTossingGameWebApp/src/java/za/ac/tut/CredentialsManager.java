/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut;

/**
 *
 * @author Desmond
 */
public class CredentialsManager implements CredentialsCheckerInterface{

    @Override
    public boolean verify(String password, String passwd, String username,String usrname) {
        if ( password.equalsIgnoreCase(passwd)) {
            return true;
        }else if (username.equalsIgnoreCase(usrname)) {
            return false;
        }
        return false;
    }
    
}
