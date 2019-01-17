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

@WebServlet("/addFlower")
public class AddFlower extends HttpServlet {
    private FlowerService flowerServiceImpl = new FlowerServiceImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        String name=req.getParameter("name");
        Float price = Float.parseFloat(req.getParameter("price"));
        String location = req.getParameter("location");
        Flower flower = new Flower(name,price,location);
        int index = flowerServiceImpl.addFlower(flower);
        //int index = flowerServiceImpl.addFlower(new Flower(req.getParameter("name"), Float.parseFloat(req.getParameter("price")), req.getParameter("location")));
        if (index > 0) {
            resp.sendRedirect("showAllFlower");
        } else {
            resp.sendRedirect("/servletjsp/addFlower.jsp");
        }
    }
}
