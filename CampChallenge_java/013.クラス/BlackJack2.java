/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.sample;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

abstract class Human {

    protected ArrayList<Integer> mycard = new ArrayList<Integer>();

    abstract public int open();

    abstract public void setCard(ArrayList<Integer> c);

    abstract public boolean checkSum();

}

class User extends Human {

    public int open() {
        
        int total = 0;
        
        for(int i = 0;i < mycard.size(); i++){
            total = total + mycard.get(i);        
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

class Dealer extends Human {

    ArrayList<Integer> cards = new ArrayList<Integer>();

    public int open() {//現在の手札の合計値を返すメソッド。

        int total = 0;
        
        for(int i = 0;i < mycard.size(); i++){ 
            total = total + mycard.get(i);        
        } 
        
        return total;

    }
    
    public void setCard(ArrayList<Integer> c) {//引いたカードを手札に追加するメソッド。

            for(int i = 0; i < c.size(); i++){
                
                mycard.add(c.get(i));
                
            }

    }
    
    public boolean checkSum() {//もう一枚引くかどうか判断するメソッド。

        if (open() < 17) {

            return true;

        } else {

            return false;

        }

    }

    public Dealer() {//Dealerクラスがインスタンス化された際に必ず実行されるメソッド(初期値)。

        for (int count = 1; count <= 4; count++) {

            for (int j = 1; j <= 13; j++) {
                if (j > 10) {

                    cards.add(10);

                } else {

                    cards.add(j);
                }

            }
        }

    }
    
    public ArrayList<Integer> deal() {//カードをデッキからランダムに二枚引くメソッド。

        ArrayList<Integer> RandomCards = new ArrayList<Integer>();
        Random rand = new Random();

        Integer Index1 = rand.nextInt(cards.size());
        Integer Index2 = rand.nextInt(cards.size());

        RandomCards.add(cards.get(Index1));
        RandomCards.add(cards.get(Index2));

        cards.remove(Index1);

        cards.remove(Index2);

        return RandomCards;//デッキから「ランダムに取り出した二枚のカード」を戻り値として返す。

    }
    
    public ArrayList<Integer> hit() {//デッキから一枚ランダムに引くメソッド。

        ArrayList<Integer> NewCards = new ArrayList<Integer>();

        Random rand = new Random();

        Integer NewIndex = rand.nextInt(cards.size());
        cards.remove(NewIndex);

        NewCards.add(cards.get(NewIndex));

        return NewCards;
    }
}

/**
 *
 * @author GaRi0077
 */
public class BlackJack2 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
               User User = new User();
            Dealer Dealer = new Dealer();//カードを用意。
            boolean Dealerbo, Userbo;

            Dealer.setCard(Dealer.deal());//取り出した二枚のカードを「Dealer」の手札に追加。

            Dealerbo = Dealer.checkSum();//もう一枚引くか判断する。

            if (Dealerbo == true) {
                Dealer.setCard(Dealer.hit());
            }
            
            User.setCard(Dealer.deal());//取り出した二枚のカードを「User」の手札に追加。

            Userbo = User.checkSum();

            if (Userbo == true)//もう一枚引くか判断する。
            {
                
                User.setCard(Dealer.hit());

            }

            //「User」の手札の合計を表示。
            out.print("ユーザー" + User.open() + "<br>");

            //「Dealer」の手札の合計を表示。
            out.print("ディーラー" + Dealer.open() + "<br>");

            if (User.open() < Dealer.open()) {

                out.print("Dealerの勝ち");

            } else {

                out.print("Userの勝ち");
            }

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
