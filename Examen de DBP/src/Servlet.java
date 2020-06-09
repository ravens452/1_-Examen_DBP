import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//Esto es una forma de llamar al servlet
//@WebServlet(name = "Servlet")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String CUI = request.getParameter("CUI");
        String pass = request.getParameter("pass");

        if(CUI.equals("20181409") && pass.equals("admin")){
            response.sendRedirect("home.jsp");
        }else{
            response.sendRedirect("index.jsp");
        }
    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("index.jsp").forward(request, response);
    }


}
