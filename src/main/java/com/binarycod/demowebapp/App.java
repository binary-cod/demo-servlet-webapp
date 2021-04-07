package com.binarycod.demowebapp;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class App extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response){
        try  {
            PrintWriter writer = response.getWriter();
            writer.println("<html>");
            writer.println("<head>");
            writer.println("<title>");
            writer.println("<p>dep app</p>");
            writer.println("</title>");
            writer.println("<style> h1 {color: lightblue;}</style>");
            writer.println("</head>");
            writer.println("<body>");
            writer.println("<h1> Hello World</h1>");
            writer.println("<p> some text</p>");
            writer.println("</body>");
            writer.println("</html>");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
