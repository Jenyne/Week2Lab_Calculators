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
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
        String first = request.getParameter("first");
        String last = request.getParameter("last");

        request.setAttribute("first", first);
        request.setAttribute("last", last);

        if (first == null || first.equals("") || first.matches(".*[a-z].*")
                || last == null || last.equals("") || last.matches(".*[a-z].*")) {
            request.setAttribute("error", "Invalid.");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                    .forward(request, response);
            return;

        } else {
            int intfirst = Integer.parseInt(first);
            int intlast = Integer.parseInt(last);
            String operator = request.getParameter("mathop");
            String result = "---";
            request.setAttribute("result", result);
            int intresult = 0;
            switch (operator) {
                case "+":
                    intresult = intfirst + intlast;
                    request.setAttribute("result", intresult);
                    break;
                case "-":
                    intresult = intfirst - intlast;
                    request.setAttribute("result", intresult);
                    break;
                case "*":
                    intresult = intfirst * intlast;
                    request.setAttribute("result", intresult);
                    break;
                case "%":
                    intresult = intfirst / intlast;
                    request.setAttribute("result", intresult);
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
