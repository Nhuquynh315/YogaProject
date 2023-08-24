package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClazzDAO;
import model.Clazz;

/**
 * Servlet implementation class ClazzSearchServlet
 */
@WebServlet("/ClazzSearchServlet")
public class ClazzSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClazzSearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String clazzName = request.getParameter("clazzName");
			ClazzDAO clazzDAO = new ClazzDAO();
			List<Clazz> clazzList = clazzDAO.getClazzBySearch(clazzName);
			
			RequestDispatcher rd = request.getRequestDispatcher("clazzSearch.jsp");
			request.setAttribute("clazzName", clazzName);
			rd.forward(request, response);
			
		} catch (NumberFormatException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
