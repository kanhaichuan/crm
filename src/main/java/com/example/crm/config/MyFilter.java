package com.example.crm.config;

import com.example.crm.model.User;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @date:2019/5/23
 * @author:felix
 */
public class MyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;

        //如果请求时登录页，或者是登录操作，不需要验证是否登录过，应该自动放行
        String path = request.getServletPath();
        if ("/login.html".equals(path) || "/user/login".equals(path)) {
            chain.doFilter(req, resp);
            //除了登录之外的其他请求，需要正常验证有没有登录过
        } else {
            User user = (User) request.getSession().getAttribute("user");
            //登录过
            if (user != null) {
                //将请求放行到目标资源
                chain.doFilter(req, resp);
                //没登录过
            } else {
                //重定向到登录页
                response.sendRedirect(request.getContextPath() + "/login.html");
            }
        }
    }
}
