package com.webapp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.webapp.DAO.UsersDao;
import com.webapp.DAO.UsersDaoImpl;
import com.webapp.entities.Users;

/**
 * Servlet implementation class Login
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		UsersDao userDao = new UsersDaoImpl();
		Users u = new Users();
		try{
			u.setEmail(request.getParameter("username"));
			u.setPassword(request.getParameter("password"));
			if(userDao.loginUser(u.getEmail(), u.getPassword())){
				response.sendRedirect("homepage.jsp");
			}
			else{
				String msg="Login Unsuccessful";
				request.setAttribute("msg", msg);
				RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
//					response.sendRedirect("index.jsp");
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
