package vin.servlet;

import vin.pojo.Flower;
import vin.service.FlowerService;
import vin.service.impl.FlowerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/showAllFlower")
public class ShowFlower extends HttpServlet {
    private FlowerService flowerServiceImpl = new FlowerServiceImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Flower> list = flowerServiceImpl.showAllFlower();
        req.setAttribute("list", list);
        req.getRequestDispatcher("/servletjsp/showAllFlower.jsp").forward(req, resp);
    }
}
