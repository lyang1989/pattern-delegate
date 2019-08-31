package com.princeli.pattern.delegate.mvc;

import com.princeli.pattern.delegate.mvc.controller.MemberController;
import com.princeli.pattern.delegate.mvc.controller.OrderController;
import com.princeli.pattern.delegate.mvc.controller.SystemController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author : princeli
 * @version 1.0
 * @className DispatcherServlet
 * @date 2019-08-31 20:18
 * @description: TODO
 */
public class DispatcherServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);

        doDispatch(req,resp);
    }

    private void doDispatch(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String uri = req.getRequestURI();
        String mid = req.getParameter("mid");


        if ("getMemberById".equals(uri)){
            new MemberController().getMemberById(mid);
        } else if ("getOrderById".equals(uri)){
            new OrderController().getOrderById(mid);
        } else if ("logout".equals(uri)){
            new SystemController().logout(mid);
        }else {
            resp.getWriter().write("404 Not Found !");
        }

    }
}
