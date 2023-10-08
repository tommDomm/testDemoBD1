package controllers.html;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import services.AirportService;

import java.io.IOException;

@WebServlet(name = "airport", urlPatterns = "/airport")
public class AirportHtml extends HttpServlet {

    AirportService airportService = new AirportService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=utf-8");
        req.setAttribute("airports", airportService.getAirports());
        getServletContext().setAttribute("airports", airportService.getAirports());
        req.getRequestDispatcher("/ui/airports.jsp").forward(req, resp);

    }

}
