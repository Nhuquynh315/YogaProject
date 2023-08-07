package controller;

import java.io.IOException;
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
			String clazzName = request.getParameter("clazzName");
			
			List<Clazz> clazzList = new ArrayList<Clazz>();
			
//			if (clazzName != null) {
//				clazzList = clazzDAO.getClazzByCategory();
				
			 if (categoryId != null) {
				 clazzList = clazzDAO.getClazzByCategory(Integer.parseInt(categoryId));}
				
//			}else {
//					bookList = bookService.getBooksByPage(currentPage);
//			}
		
			RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
			request.setAttribute("categoryList", categoryList);
//			request.setAttribute("bookList", bookList);
//			request.setAttribute("bookName", bookName);
//			request.setAttribute("currentPage", currentPage);
//			request.setAttribute("totalPage", bookService.getTotalPages());
			rd.forward(request, response);
			
			
		}catch (SQLException e) {
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
