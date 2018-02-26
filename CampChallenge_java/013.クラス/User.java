/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.sample;

import java.util.ArrayList;
import java.io.PrintWriter;

/**
 *
 * @author GaRi0077
 */
public class User extends Human{
    
        public int open() {
        
        int total = 0;
        
        for(int i = 0; i < mycard.size(); i++){
            total += mycard.get(i);        
        } 
        
        return total;

        
    }
    
    public void setCard(ArrayList<Integer> c) {
        
        for(int i = 0; i < c.size(); i++){
                
                mycard.add(c.get(i));
               
            }
        
    }
    
    public boolean checkSum() {

         if (open() < 21) {

            return true;

        } else {

            return false;

        }

    }
}
    

