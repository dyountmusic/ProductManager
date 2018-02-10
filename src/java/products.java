/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author danielyount
 */
public class products extends HttpServlet {

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"globalstyle.css\">");
            out.println("<title>Servlet products</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet products at " + request.getContextPath() + "</h1>");
            out.println(content);
            out.println("</body>");
            out.println("</html>");
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

    String content = new String("<div>\n" +
"        <table class=\"tg\">\n" +
"            <tr>\n" +
"                <th class=\"tg-e3zv\">Code</th>\n" +
"                <th class=\"tg-9hbo\">Description</th>\n" +
"                <th class=\"tg-9hbo\">Price</th>\n" +
"                <th class=\"tg-yw4l\"></th>\n" +
"                <th class=\"tg-yw4l\"></th>\n" +
"            </tr>\n" +
"            <tr>\n" +
"                <td class=\"tg-yw4l\">8601</td>\n" +
"                <td class=\"tg-yw4l\">86 (the band) - True Life Songs and Pictures</td>\n" +
"                <td class=\"tg-yw4l\">$15.96</td>\n" +
"                <td class=\"tg-yw4l\">Edit</td>\n" +
"                <td class=\"tg-yw4l\">Delete</td>\n" +
"            </tr>\n" +
"            <tr>\n" +
"                <td class=\"tg-yw4l\">pf01</td>\n" +
"                <td class=\"tg-yw4l\">Paddlefoot - The first CD</td>\n" +
"                <td class=\"tg-yw4l\">$12.95</td>\n" +
"                <td class=\"tg-yw4l\">Edit</td>\n" +
"                <td class=\"tg-yw4l\">Delete</td>\n" +
"            </tr>\n" +
"            <tr>\n" +
"                <td class=\"tg-yw4l\">pf02</td>\n" +
"                <td class=\"tg-yw4l\">Paddlefood - The second CD</td>\n" +
"                <td class=\"tg-yw4l\">$14.95</td>\n" +
"                <td class=\"tg-yw4l\">Edit</td>\n" +
"                <td class=\"tg-yw4l\">Delete</td>\n" +
"            </tr>\n" +
"            <tr>\n" +
"                <td class=\"tg-yw4l\">jr01</td>\n" +
"                <td class=\"tg-yw4l\">Joe Rut - Genuine Wood Grained Finish</td>\n" +
"                <td class=\"tg-yw4l\">$14.95</td>\n" +
"                <td class=\"tg-yw4l\">Edit</td>\n" +
"                <td class=\"tg-yw4l\">Delete</td>\n" +
"            </tr>\n" +
"        </table>\n" +
"    </div>");
    
}
