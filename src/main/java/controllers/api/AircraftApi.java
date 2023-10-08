package controllers.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import repository.AircraftRepo;
import repository.api.IAircraftRepo;
import repository.factory.AircraftFactory;
import services.AircraftService;

import java.io.IOException;

@WebServlet(name = "aircraft_api", urlPatterns = "/api/aircraft")
public class AircraftApi extends HttpServlet {
    private final AircraftService aircraftService = new AircraftService();
    ObjectMapper om = new ObjectMapper();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=utf-8");

        resp.getWriter().write(om.writeValueAsString(aircraftService.getAircraftLists()));
        //req.setAttribute("aircrafts", om.writeValueAsString(aircraftService.getAircraftLists()));
    }
}
