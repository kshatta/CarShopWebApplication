package com.sample;

import com.sample.model.CarMake;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet(
        name = "selectCarServlet",
        urlPatterns = "/SelectCar"
)
public class SelectCarServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String carType = req.getParameter("Type");
        CarService carService = new CarService();
        CarMake c = CarMake.valueOf(carMake);
        List carBrands = carService.getAvailableBrands(c);
        req.setAttribute("brands", carBrands);
        RequestDispatcher view = req.getRequestDispatcher("result.jsp");
        view.forward(req, resp);
    }
}
