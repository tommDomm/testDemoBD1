package controllers.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import services.AircraftService;
import services.AirportService;

import java.io.IOException;

@WebServlet(name = "airport_api", urlPatterns = "/api/airport")
public class AirportApi extends HttpServlet {
    AirportService airportService = new AirportService();
    ObjectMapper om = new ObjectMapper();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=utf-8");

        resp.getWriter().write(om.writeValueAsString(airportService.getAirports()));
    }
}
