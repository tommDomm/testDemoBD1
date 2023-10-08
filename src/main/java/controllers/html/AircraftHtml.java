package controllers.html;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import services.AircraftService;

import java.io.IOException;

@WebServlet(name = "aircraft", urlPatterns = "/aircraft")
public class AircraftHtml extends HttpServlet {

    private final AircraftService aircraftService = new AircraftService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=utf-8");
        req.setAttribute("aircrafts", aircraftService.getAircraftLists());
        getServletContext().setAttribute("aircrafts", aircraftService.getAircraftLists());
        req.getRequestDispatcher("/ui/aircrafts.jsp").forward(req, resp);
    }
}
