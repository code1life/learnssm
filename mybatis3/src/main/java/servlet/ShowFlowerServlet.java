package servlet;

import pojo.Flower;
import service.FlowerService;
import service.impl.FlowerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/show")
public class ShowFlowerServlet extends HttpServlet {
    private FlowerService flowerServiceImpl = new FlowerServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Flower> list = flowerServiceImpl.showAllFlower();
        req.setAttribute("list", list);
        req.getRequestDispatcher("/jsp/showAllFlower.jsp").forward(req,resp);
    }
}
