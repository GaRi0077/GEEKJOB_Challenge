/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.sample;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author GaRi0077
 */
@WebServlet(name = "mesod72", urlPatterns = {"/mesod72"})
public class mesod7 extends HttpServlet {
    
    String[][] data(PrintWriter out){
        
        String data[][] = new String [3][4];
        
        data[0][0] = "ID:1";
        data[0][1] = "名前:a太郎<br>";
        data[0][2] = "生年月日:X年A月A日<br>";
        data[0][3] = "住所:東京<br>";
        
        data[1][0] = "ID:2";
        data[1][1] = "名前:b太郎<br>";
        data[1][2] = "生年月日:X年B月B日<br>";
        data[1][3] = "住所:null<br>";
        
        data[2][0] = "ID:3";
        data[2][1] = "名前:c太郎<br>";
        data[2][2] = "生年月日:X年C月C日<br>";
        data[2][3] = "住所:茨城<br>";
        
          for(int i = 0; i <= 3; i++){
            for(int j = 1; j <= 3; j++){
                if(data[i][3] == "住所:null<br>"){
                    continue;
                }
                out.print(data[i][j]);
            }
        }
        
        return data;
        
    }
    
    

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
            
            data(out);
            
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
