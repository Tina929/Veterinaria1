/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.Gato;
import modelo.Mascotas;
import modelo.Perro;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
/**
 *
 * @author oscar
 */
@WebServlet(name = "Servlet", urlPatterns = {"/Servlet"})
public class Servlet extends HttpServlet {

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
            
            String tipo=request.getParameter("tipomasc");
            int edad=Integer.parseInt(request.getParameter("edad"));
            String raza=request.getParameter("raza");
            String nombre=request.getParameter("nombre");
            Perro mike = new Perro(3, "Mike", 5, "Gran danés", "Café");
            Gato morris = new Gato(true, "Morris", 3, "Angora", "Blanco");
            Perro firulais = new Perro(1, "Firulais", 10, "Chihuahua", "Negro");
            Gato bills = new Gato(false, "Bills", 9, "Esfinge", "Gris");
            int i=0;
            ArrayList <Perro> lista = new ArrayList();  
            ArrayList <Gato> lista2 = new ArrayList();
            lista.add(mike);
            lista2.add(morris);
            lista.add(firulais);
            lista2.add(bills);
            
            if(tipo.equals("Gato")) {   
                boolean conf=Boolean.parseBoolean(request.getParameter("toxo"));
                Gato gato=new Gato(conf, nombre, edad, raza, nombre);
                lista2.add(gato);
            }
            if(tipo.equals("Perro")) {        
                int nivel=Integer.parseInt(request.getParameter("nivel"));
                Perro perro=new Perro(nivel, nombre, edad, raza, nombre);
                lista.add(perro);
            }
            
            Iterator it = lista.iterator();
            Iterator it2 = lista2.iterator();
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Datos</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Animales adentro: " + (lista.size()+lista2.size()) + "</h1>");   
            out.println("<br><p>Perros: </p>");
            while (it.hasNext()) {
                i++;
                Object objeto = it.next();
                Perro cani = (Perro) objeto;
                out.println("<p>"+i+" "+cani.datos());
            }
            i=0;
            out.println("<p>Gatos: </p>");
            while (it2.hasNext()) {
                i++;
                Object objeto2 = it2.next();
                Gato feli = (Gato) objeto2;
                out.println("<p>"+i+" "+feli.datos());
            }
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

}
