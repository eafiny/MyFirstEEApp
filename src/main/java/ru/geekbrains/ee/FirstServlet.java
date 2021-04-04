package ru.geekbrains.ee;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FirstServlet extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(FirstServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Log: First servlet starting");
        resp.getWriter().printf("<html><body>");
        for (int i = 1; i < 11; i++) {
            resp.getWriter().printf("<h1>" + new Product(i, "Product" + i, (int)(Math.random() * i * 1000)).toString() + "</h1>");
        }
        resp.getWriter().printf("</html></body>");

    }
}
