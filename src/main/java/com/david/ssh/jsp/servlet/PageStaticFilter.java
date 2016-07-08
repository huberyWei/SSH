package com.david.ssh.jsp.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class PageStaticFilter
 */
@WebFilter("/PageStaticFilter")
public class PageStaticFilter implements Filter {

	/**
	 * Default constructor.
	 */
	public PageStaticFilter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		HttpSession session = req.getSession();

		long timeNum = new Date().getTime();
		String strNum = String.valueOf(session.getAttribute("updateTime"));

		if (null == strNum && strNum.equals("")) {
			long Num = timeNum - Long.valueOf(strNum);
			if (Num >= 7200000) {
				session.setAttribute("updateTime", String.valueOf(timeNum));
				//res.sendRedirect(req.getContextPath() + url);
				chain.doFilter(request, response);
			}
		} else {
			session.setAttribute("updateTime", String.valueOf(timeNum));
			//res.sendRedirect(req.getContextPath() + url);
			chain.doFilter(request, response);
		}
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
