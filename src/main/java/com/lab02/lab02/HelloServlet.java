package com.lab02.lab02;

import java.io.*;
import java.util.List;

import com.lab02.lab02.model.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = {"/hello-servlet", "/calculate-function", "/calculate-tab"})
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
            double x=0, e=0;
            int n=0;
            try{
                x=Double.parseDouble(xStr);
                n=Integer.parseInt(nStr);
                e=Double.parseDouble(eStr);
            } catch (NumberFormatException exception){
                request.getRequestDispatcher("/index.jsp").forward(request, response);
            }
            CalculatorTask1 calculatorTask1 = new CalculatorTask1(x, n, e);
            double chXC=calculatorTask1.calculateChByCount(x, n);
            double[] chXDandN=calculatorTask1.calculateChByDelta(x, e);
            double accurateChX = Math.cosh(x);

            request.setAttribute("funcCalcModel", new FuncCalcModel(x, n, e, chXC, chXDandN, accurateChX));
            request.getRequestDispatcher("/funCalc.jsp").forward(request, response);

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

            request.setAttribute("tabModel", new TabModel((points)));
            request.getRequestDispatcher("/tab.jsp").forward(request, response);

        } else {
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        }
    }

    public void destroy() {
    }
}