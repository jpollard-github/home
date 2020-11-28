package com.jasonpollard.home;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/about"})
public class AboutServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String goToHome = request.getParameter("home");
        if (goToHome != null && goToHome.equals("true")) {
            response.sendRedirect(request.getContextPath());
        } else {

            response.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = response.getWriter()) {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>jason-pollard.com | About</title>");
                out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/about.css\" />");
                out.println("<link rel=\"shortcut icon\" href=\"img/favicon.ico\" />");
                out.println("</head>");
                out.println("<body>");
                out.println(
                        "        <main id=\"container\">\n"
                        + "            <aside id=\"graphic\">\n"
                        + "                <img id=\"pic\" alt=\"me\" src=\"img/cat.jpg\" />\n"
                        + "            </aside>\n"
                        + "            <aside id=\"bio\">\n"
                        + "                <header id=\"header\">Jason Pollard</header>\n"
                        + "                <p>\n"
                        + "                    I am a software developer with sixteen years of professional experience.\n"
                        + "                </p>\n"
                        + "                <p>\n"
                        + "                    I currently work for <a target=\"_blank\" href=\"https://www.optum.com/\">Optum</a> as a Lead Software Engineer, building internal Java and JavaScript applications.\n"
                        + "                </p>\n"
                        + "                <p>\n"
                        + "                    Quick bio: I earned a BA in Psychology and spent a number of years working a variety of jobs, including accounts payable, assistant manager at a bookstore, and installing cable modems.\n"
                        + "                    I decided to pursue a career in technology and received certification with Microsoft Server and SQL Server 2000.\n"
                        + "                    I got my first break with development using .NET 1.1 and Visual Basic .NET, and as the years progressed added C#, web development, and many other Microsoft-related skills.\n"
                        + "                    In the early 2010's, I started learning other programming languages, including Python and Java, as well as basic DevOps practices like continuous integration.\n"
                        + "                    In the last few years, I switched from the Microsoft ecosystem to Linux, Java, and JavaScript, including Spring, Jakarta EE, and Node.js, as well as a number of different databases.\n"
                        + "                    I mainly switched because the Java world is huge and Java EE/Jakarta EE encourages backwards compatibility. I always felt I had to re-learn my frameworks every 2 years in the .NET world.\n"
                        + "                    I think that running containers in the cloud, with a pragmatic dose of DevOps, is currently the way to go for application development. \n"
                        + "                </p>\n"
                        + "                <p>\n"
                        + "                    I am currently writing a book on developing modern web applications with Java, focusing on Jakarta EE, DevOps, containers and the cloud (with a hint of JavaScript). Stay tuned!\n"
                        + "                </p>\n"
                        + "                <p>\n"
                        + "                    I live in rural Illinois, USA, with my family and pets.\n"
                        + "                </p>\n"
                        + "                <p>"
                        + "                  <a href=\"about?home=true\">Go back home</a>."
                        + "                </p>"
                        + "            </aside>\n"
                        + "        </main>"
                        + "        <section id=\"footer\">"
                        + "            &COPY;&nbsp;Jason Pollard&nbsp;" 
                        +              LocalDate.now().getYear()
                        + "        </section>");
                out.println("</body>");
                out.println("</html>");
            }
        }
    }
}
