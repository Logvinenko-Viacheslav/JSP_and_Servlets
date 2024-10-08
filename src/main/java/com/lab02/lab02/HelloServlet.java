package com.lab02.lab02;

import java.io.*;
import java.text.ParseException;
import java.util.List;

import com.lab02.lab02.model.CalculatorTask2;
import com.lab02.lab02.model.Point;
import com.lab02.lab02.model.TabModel;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = {"/hello-servlet", "/calculate"})
public class HelloServlet extends HttpServlet {

    public void init() {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String tNumber = request.getParameter("task-number");
        if(Integer.parseInt(tNumber) == 1){
            String xStr = request.getParameter("task1-x");
            String nStr = request.getParameter("task1-n");
            String eStr = request.getParameter("task1-e");
            double x, n, e;
            try{
                x=Double.parseDouble(xStr);
                n=Double.parseDouble(nStr);
                e=Double.parseDouble(eStr);
            } catch (NumberFormatException exception){
                request.getRequestDispatcher("/tab.jsp").forward(request, response);
            }

        } else if (Integer.parseInt(tNumber) == 2) {
            String aStr = request.getParameter("task2-a");
            String bStr = request.getParameter("task2-b");
            String hStr = request.getParameter("task2-h");
            double a=0, b=0, h=0;
            try{
                a=Double.parseDouble(aStr);
                b=Double.parseDouble(bStr);
                h=Double.parseDouble(hStr);
            } catch (NumberFormatException exception){
                request.getRequestDispatcher("/index.jsp").forward(request, response);
            }

            CalculatorTask2 calculatorTask2 = new CalculatorTask2(a, b, h);
            List<Point> points = calculatorTask2.getPoints();

            request.setAttribute("tabModule", new TabModel((points)));
            request.getRequestDispatcher("/tab.jsp").forward(request, response);

        } else {

        }
    }

    public void destroy() {
    }
}