/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Clases.detalleTest;
import ConexionesBD.Test_RealizadoBD;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Ricardo Ramirez
 */
@WebServlet(name = "Guarda_Servlet", urlPatterns = {"/Guarda_Servlet"})
public class Guarda_Servlet extends HttpServlet {

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
            
            HttpSession session = request.getSession();

            Test_RealizadoBD tr = new Test_RealizadoBD();
            //instancio el objeto de la clase   
            //para asginar el nuevo codigo de test 
            int codigoT = tr.getCodigoDelTest(); // conecto a la base y llamo al metodo para mandar el codigo al detalle 
            String codigoU = (String) session.getAttribute("codigoU");//recupero el codigo de usuario que se establecio en "Logueo_Servlet"
            int codigoUser = Integer.parseInt(codigoU); //tramsformo en entero para que lo pueda recivir la base 

            //out.print(codigoT);
            Vector vDetalle = new Vector();
            detalleTest od;
            String p1 = request.getParameter("1");
            od = new detalleTest();
            od.setCodigoTest(codigoT);
            od.setCodigoPregunta(1);
            od.setRespuesta(p1);
            vDetalle.addElement(od);

            // session.setAttribute("vectorDetalle", vDetalle);
            String p2 = request.getParameter("2");
            od = new detalleTest();
            od.setCodigoTest(codigoT);
            od.setCodigoPregunta(2);
            od.setRespuesta(p2);
            vDetalle.addElement(od);
            // session.setAttribute("vectorDetalle", vDetalle);

            String p3 = request.getParameter("3");
            od = new detalleTest();
            od.setCodigoTest(codigoT);
            od.setCodigoPregunta(3);
            od.setRespuesta(p3);
            vDetalle.addElement(od);
            //session.setAttribute("vectorDetalle", vDetalle);

            String p4 = request.getParameter("4");
            od = new detalleTest();
            od.setCodigoTest(codigoT);
            od.setCodigoPregunta(4);
            od.setRespuesta(p4);
            vDetalle.addElement(od);
            //session.setAttribute("vectorDetalle", vDetalle);

            String p5 = request.getParameter("5");
            od = new detalleTest();
            od.setCodigoTest(codigoT);
            od.setCodigoPregunta(5);
            od.setRespuesta(p5);
            vDetalle.addElement(od);
            //session.setAttribute("vectorDetalle", vDetalle);

            String p6 = request.getParameter("6");
            od = new detalleTest();
            od.setCodigoTest(codigoT);
            od.setCodigoPregunta(6);
            od.setRespuesta(p6);
            vDetalle.addElement(od);
            //session.setAttribute("vectorDetalle", vDetalle);

            String p7 = request.getParameter("7");
            od = new detalleTest();
            od.setCodigoTest(codigoT);
            od.setCodigoPregunta(7);
            od.setRespuesta(p7);
            vDetalle.addElement(od);
            //session.setAttribute("vectorDetalle", vDetalle);
            String p8 = request.getParameter("8");
            od = new detalleTest();
            od.setCodigoTest(codigoT);
            od.setCodigoPregunta(8);
            od.setRespuesta(p8);
            vDetalle.addElement(od);
            //session.setAttribute("vectorDetalle", vDetalle);

            String p9 = request.getParameter("9");
            od = new detalleTest();
            od.setCodigoTest(codigoT);
            od.setCodigoPregunta(9);
            od.setRespuesta(p9);
            vDetalle.addElement(od);
            //session.setAttribute("vectorDetalle", vDetalle);
            String p10 = request.getParameter("10");
            od = new detalleTest();
            od.setCodigoTest(codigoT);
            od.setCodigoPregunta(10);
            od.setRespuesta(p10);
            vDetalle.addElement(od);
            //session.setAttribute("vectorDetalle", vDetalle);
            String p11 = request.getParameter("11");
            od = new detalleTest();
            od.setCodigoTest(codigoT);
            od.setCodigoPregunta(11);
            od.setRespuesta(p11);
            vDetalle.addElement(od);
            //session.setAttribute("vectorDetalle", vDetalle);
            String p12 = request.getParameter("12");
            od = new detalleTest();
            od.setCodigoTest(codigoT);
            od.setCodigoPregunta(12);
            od.setRespuesta(p12);
            vDetalle.addElement(od);
            //session.setAttribute("vectorDetalle", vDetalle);
            String p13 = request.getParameter("13");
            od = new detalleTest();
            od.setCodigoTest(codigoT);
            od.setCodigoPregunta(13);
            od.setRespuesta(p13);
            vDetalle.addElement(od);
            //session.setAttribute("vectorDetalle", vDetalle);
            String p14 = request.getParameter("14");
            od = new detalleTest();
            od.setCodigoTest(codigoT);
            od.setCodigoPregunta(14);
            od.setRespuesta(p14);
            vDetalle.addElement(od);
            //session.setAttribute("vectorDetalle", vDetalle);
            String p15 = request.getParameter("15");
            od = new detalleTest();
            od.setCodigoTest(codigoT);
            od.setCodigoPregunta(15);
            od.setRespuesta(p15);
            vDetalle.addElement(od);
            //session.setAttribute("vectorDetalle", vDetalle);
            String p16 = request.getParameter("16");
            od = new detalleTest();
            od.setCodigoTest(codigoT);
            od.setCodigoPregunta(16);
            od.setRespuesta(p16);
            vDetalle.addElement(od);
            //session.setAttribute("vectorDetalle", vDetalle);
            String p17 = request.getParameter("17");
            od = new detalleTest();
            od.setCodigoTest(codigoT);
            od.setCodigoPregunta(17);
            od.setRespuesta(p17);
            vDetalle.addElement(od);
            //session.setAttribute("vectorDetalle", vDetalle);
            String p18 = request.getParameter("18");
            od = new detalleTest();
            od.setCodigoTest(codigoT);
            od.setCodigoPregunta(18);
            od.setRespuesta(p18);
            vDetalle.addElement(od);
            //session.setAttribute("vectorDetalle", vDetalle);
            String p19 = request.getParameter("19");
            od = new detalleTest();
            od.setCodigoTest(codigoT);
            od.setCodigoPregunta(19);
            od.setRespuesta(p19);
            vDetalle.addElement(od);
            //session.setAttribute("vectorDetalle", vDetalle);
            String p20 = request.getParameter("20");
            od = new detalleTest();
            od.setCodigoTest(codigoT);
            od.setCodigoPregunta(20);
            od.setRespuesta(p20);
            vDetalle.addElement(od);
            //session.setAttribute("vectorDetalle", vDetalle);


            // Vector vd=(Vector)session.getAttribute("vectorDetalle");
            tr.registrarTestRealizados(codigoT, codigoUser);
           
            for (int i = 0; i < vDetalle.size(); i++) {
                detalleTest dp = (detalleTest) vDetalle.elementAt(i);
                tr.registrarDetalleTest(dp.codigoTest, dp.codigoPregunta, dp.respuesta);
                //out.print(dp.codigoTest+"      "+dp.codigoPregunta+"      "+dp.respuesta);
            }                               
            vDetalle.removeAllElements();
            
             tr.actualizaEstadoEncuesta("REALIZADO",codigoUser);// se actualiza el estado de la escuesta 
            response.sendRedirect("preguntas2.jsp?msj=hecho");
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
