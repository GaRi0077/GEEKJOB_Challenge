/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.sample;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author GaRi0077
 */
public class Blackjack extends HttpServlet {

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

            User User = new User();
            Dealer Dealer = new Dealer();//カードを用意。
            boolean Dealerbo, Userbo;

            Dealer.setCard(Dealer.deal());//取り出した二枚のカードを「Dealer」の手札に追加。

            Dealerbo = Dealer.checkSum();//もう一枚引くか判断する。

            if (Dealerbo == true) {
                Dealer.setCard(Dealer.hit());//取り出した一枚のカードを手札に追加。
            }

            Dealerbo = Dealer.checkSum();

            if (Dealerbo == true) {
                Dealer.setCard(Dealer.hit());
            }

            Dealerbo = Dealer.checkSum();

            if (Dealerbo == true) {
                Dealer.setCard(Dealer.hit());
            }

            User.setCard(Dealer.deal());//取り出した二枚のカードを「User」の手札に追加。

            Userbo = User.checkSum();

            if (Userbo == true) {//もう一枚引くか判断する。
                User.setCard(Dealer.hit());

            }

            Userbo = User.checkSum();

            if (Userbo == true) {//もう一枚引くか判断する。
                User.setCard(Dealer.hit());

            }

            Userbo = User.checkSum();

            if (Userbo == true) {//もう一枚引くか判断する。
                User.setCard(Dealer.hit());

            }

            //「Dealer」の手札の合計を表示。
            out.print("Dealer" + Dealer.open() + "<br>");

            //「User」の手札の合計を表示。
            out.print("User" + User.open() + "<br>");
            
            

            if (Dealer.open() >= 17 && Dealer.open() <= 21) {

                if (User.open() < Dealer.open() || User.open() > 21) {
                    out.print("Dealerの勝ち");
                }

            } else if (User.open() <= 21) {

                if (Dealer.open() < User.open()) {

                    out.print("Userの勝ち");
                }

            } else {

                out.print("引き分け");
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
