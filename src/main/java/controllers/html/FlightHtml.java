package controllers.html;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import services.FlightsService;

import java.io.IOException;

@WebServlet(name = "flight", urlPatterns = "/flight")
public class FlightHtml extends HttpServlet {

    FlightsService fl = new FlightsService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=utf-8");
        req.setAttribute("flights", fl.getFlights((Integer) req.getAttribute("offset")));
        req.getRequestDispatcher("/ui/flights").forward(req, resp);

    }

}
