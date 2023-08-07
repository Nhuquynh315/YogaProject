package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.RegisterDao;
import model.User;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fullname = request.getParameter("fullname");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		User user = new User(fullname, username, password, email);
		
		// Validate user input
		
		List<String> errorMessages = validateUser(user); 
		if (!errorMessages.isEmpty()) {
			RequestDispatcher rd = request.getRequestDispatcher("register.jsp");
			request.setAttribute("errorMessages", errorMessages);
			rd.forward(request, response);
		}
		
		Pattern p = Pattern.compile("^[a-zA-Z0-9]*$");
		boolean isRequirementIsUserName = p.matcher(username).find();
		
		// if invalid
		// show CORRECTLY error message -> register.jsp
		
		if (!isRequirementIsUserName) {
			RequestDispatcher rd = request.getRequestDispatcher("register.jsp");
			request.setAttribute("errorMessages", "Usernames contain alphabets and numbers only");
			rd.forward(request, response);
			return;
		}
		
		RegisterDao registerDao = new RegisterDao();
		try {
			boolean isInsertSuccess = registerDao.insertUser(user);
			if (isInsertSuccess) {
				response.sendRedirect("register_success.jsp");
			} else {
				RequestDispatcher rd = request.getRequestDispatcher("register.jsp");
				request.setAttribute("errorMessage", "Please reinput your information");
				rd.forward(request, response);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private List<String> validateUser(User user) {
		Pattern p = Pattern.compile("^[a-zA-Z0-9]*$");
		List<String> errors = new ArrayList<String>();
		
		boolean isUserNameMatch = p.matcher(user.getUsername()).find();
		if (!isUserNameMatch) {
			errors.add("Usernames can contain letters (a-z or A-Z) and numbers (0-9)");
		}
		boolean isPassWordMatch = p.matcher(user.getPassword()).find();
		if (!isPassWordMatch) {
			errors.add("Passwords can contain letters (a-z or A-Z) and numbers (0-9)");
		}
		return errors;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
