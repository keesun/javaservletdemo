package me.whiteship;

import javax.servlet.*;
import java.io.IOException;

public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter Init");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("Filter");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        System.out.println("Filter Destroy");
    }
}
