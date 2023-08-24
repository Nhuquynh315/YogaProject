package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CategoryDAO;
import dao.ClazzDAO;
import model.Category;
import model.Clazz;

/**
 * Servlet implementation class ClazzServlet
 */
@WebServlet("/ClazzServlet")
public class ClazzServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClazzServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			CategoryDAO categoryDAO = new CategoryDAO();
			List<Category> categoryList = categoryDAO.getAllCategories();
		
			ClazzDAO clazzDAO = new ClazzDAO();
			String categoryId = request.getParameter("categoryId");
			 
			List<Clazz> clazzList = clazzDAO.getAllClazz();
			
			if (categoryId == null) {
				clazzList = clazzDAO.getAllClazz();
			}else {
				clazzList = clazzDAO.getClazzByCategory(Integer.parseInt(categoryId));
			}
			RequestDispatcher rd = request.getRequestDispatcher("clazz.jsp");
			request.setAttribute("categoryList", categoryList);
			request.setAttribute("clazzList", clazzList);
			rd.forward(request, response);

		} catch (SQLException e) {
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
