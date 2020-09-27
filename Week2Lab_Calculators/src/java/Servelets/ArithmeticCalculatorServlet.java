/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servelets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Nykke
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
        String result = "---";
        request.setAttribute("result", result);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        request.setAttribute("first", first);
        request.setAttribute("second", second);

        if (first == null || first.equals("") || first.matches(".*[a-z].*")
                || second == null || second.equals("") || second.matches(".*[a-z].*")) {
            request.setAttribute("result", "Invalid.");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                    .forward(request, response);

            return;

        } else {
            int intfirst = Integer.parseInt(first);
            int intsecond = Integer.parseInt(second);
            String operator = request.getParameter("mathop");

            int intresult;
            switch (operator) {
                case "+":
                    intresult = intfirst + intsecond;
                    request.setAttribute("result", intresult);
                    break;
                case "-":
                    intresult = intfirst - intsecond;
                    request.setAttribute("result", intresult);
                    break;
                case "*":
                    intresult = intfirst * intsecond;
                    request.setAttribute("result", intresult);
                    break;
                case "%":
                    double dfirst = intfirst;
                    double dsecond = intsecond;
                    double doubleresult = (dfirst / dsecond);
                    double dresult = Double.parseDouble(String.format("%.2f", doubleresult));
                    request.setAttribute("result", dresult);

                    break;
            }

        }

        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }
//
//    @Override
//    public String getServletInfo() {
//        return "Short description";
//    }// </editor-fold>

}
