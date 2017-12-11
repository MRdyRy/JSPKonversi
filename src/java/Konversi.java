/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
public class Konversi extends HttpServlet {
    DecimalFormat df = (DecimalFormat) DecimalFormat.getInstance();
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
        Double nilaiawal = Double.valueOf(request.getParameter("nilaiawal"));
        Double nilai = nilaiawal;
        String mataUang = request.getParameter("toCurency");
        if(mataUang.equalsIgnoreCase("ringgit"))
            nilaiawal = nilaiawal/3315.9;
        else if(mataUang.equalsIgnoreCase("euro"))
            nilaiawal = nilaiawal/15945.7;
        else if(mataUang.equalsIgnoreCase("dolar"))
            nilaiawal = nilaiawal/13543.7;
        
        request.setAttribute("konversike",mataUang);
        request.setAttribute("nilaiawal", df.format(nilai));
        request.setAttribute("nilaikonversi",df.format(nilaiawal));
        request.getRequestDispatcher("mataUangjsp.jsp").forward(request, response);
        
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
