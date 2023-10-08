package controllers.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import services.FlightsService;

import java.io.IOException;

@WebServlet(name = "flight_api", urlPatterns = "/api/flight")
public class FlightApi extends HttpServlet {

    FlightsService fs = new FlightsService();
    ObjectMapper om = new ObjectMapper();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=utf-8");
        int offset = Integer.parseInt(req.getParameter("next"));
        resp.getWriter().write(offset);
        resp.getWriter().write(om.writeValueAsString(fs.getFlights(offset)));
    }
}
