package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/calculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        if(first != null && second != null && isValidValue(first) && isValidValue(second)){
            char operation = request.getParameter("operation").charAt(0);
            switch(operation){
                case '+':
                    request.setAttribute("result", Integer.parseInt(first) + Integer.parseInt(second));
                    break;
                case '-':
                    request.setAttribute("result", Integer.parseInt(first) - Integer.parseInt(second));
                    break;
                case '/':
                    request.setAttribute("result", Integer.parseInt(first) / Integer.parseInt(second));
                    break;
                case 'x':
                    request.setAttribute("result", Integer.parseInt(first) * Integer.parseInt(second));
                    break;
            }
        }
        getServletContext().getRequestDispatcher("/calculator.jsp").forward(request, response);
    }
    
    private boolean isValidValue(String value)
    {
        return value.trim().matches("^\\d+$");
    }
    
}
