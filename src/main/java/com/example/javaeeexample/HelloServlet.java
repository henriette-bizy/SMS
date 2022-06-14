package com.example.javaeeexample;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.*;

import java.io.*;
import java.util.Objects;

import static java.lang.System.out;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.getContentType();
        response.setContentType("text/html");
        String parameter = request.getParameter("q");
        String requestPath= request.getServletPath();

        if(Objects.equals(requestPath,"/hello-servlet/list")){
            request.setAttribute("list",parameter);
            request.getServletContext().getRequestDispatcher("/ListStudents.jsp").forward(request,response);
        }
        else if(Objects.equals(requestPath,"/hello-servlet/studentForm")){
            request.setAttribute("studentForm",parameter);
            request.getServletContext().getRequestDispatcher("/StudentForm.jsp").forward(request,response);

        } else if (Objects.equals(requestPath,"/hello-servlet")) {
            request.setAttribute("hello",parameter);
            request.getServletContext().getRequestDispatcher("/hello-servlet").forward(request,response);
        }

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<a href='/javaEEExample_war_exploded'>" + "Go back" + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}