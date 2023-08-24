package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDAO;
import model.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

			// TODO Auto-generated method stub
			doPost(request, response);
		}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
				UserDAO userDAO = new UserDAO();

		try {
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			
			User user = userDAO.getUserByUsernameAndPassword(username, password);
			if (user == null) {
				request.setAttribute("errorMessages", "Wrong user or password, please try again");
				RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
				rd.forward(request, response);
			}else {
				HttpSession session = request.getSession();
				session.setAttribute("username", user.getUsername());
				session.setAttribute("id", user.getId());
				session.setMaxInactiveInterval(60 * 60); // user sẽ bị log out ra nếu ko hoạt động trong 60
				response.sendRedirect("home.jsp");
			}
			}catch (SQLException e) {
			e.printStackTrace();
	}

}
}
