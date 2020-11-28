package com.jasonpollard.home;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/book", "/blog", "/youtube"})
public class UnderConstructionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>jason-pollard.com | Under Construction</title>");
            out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/generic.css\" />");
            out.println("<link rel=\"shortcut icon\" href=\"img/favicon.ico\" />");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Under construction!</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
}
