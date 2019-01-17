package servlet;

import pojo.PageInfo;
import service.FlowerService;
import service.impl.FlowerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/page")
public class PagingFlowerServlet extends HttpServlet {
    private FlowerService flowerServiceImpl = new FlowerServiceImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //当前页码
        int pageNumber = 1;
        String pageNumberStr = req.getParameter("pageNumber");
        if (pageNumberStr != null || "".equals(pageNumberStr)) {
            pageNumber = Integer.parseInt(req.getParameter("pageNumber"));
        }
        //每页行数
        int pageSize = 2;
        String pageSizeStr = req.getParameter("pageSize");
        if (pageNumberStr != null || "".equals(pageNumberStr)) {
            pageSize = Integer.parseInt(req.getParameter("pageSize"));
        }
        PageInfo pageInfo = flowerServiceImpl.showPage(pageNumber, pageSize);
        req.setAttribute("pageInfo", pageInfo);
        req.getRequestDispatcher("paging.jsp").forward(req, resp);
    }
}
