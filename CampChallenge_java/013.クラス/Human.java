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

    abstract class Human {

        protected ArrayList<Integer> mycard = new ArrayList<Integer>();

        abstract public int open();

        abstract public void setCard(ArrayList<Integer> c);

        abstract public boolean checkSum();

    }


