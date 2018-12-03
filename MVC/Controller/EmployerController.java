package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.EmployerDAO;
import Model.EmployerBean;

@WebServlet("/EmployerController")
public class EmployerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private EmployerDAO dao;
	
       
    public EmployerController() {
        super();
        dao = new EmployerDAO();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in doGet");
		
		String action = request.getParameter("action");
		
		if(action.equals("login")) {
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			System.out.println(username + password);
			
			try {
				EmployerBean em = dao.getEmployer(username, password);
				request.setAttribute("employer", em);
				
				RequestDispatcher view = request.getRequestDispatcher("postJob.jsp");
				view.forward(request, response);
			}
			catch(NullPointerException e) {
				e.getMessage();
				System.out.println("NullPointerException");
			}
		}else if(action.equals("newAccount")) {
			RequestDispatcher view = request.getRequestDispatcher("emCreateAccount.jsp");
			view.forward(request, response);
		}else {//action.equals("createAccount")
			String eName = request.getParameter("eName");
			String address = request.getParameter("address");
			String contact = request.getParameter("contact");
			String aboutUs = request.getParameter("aboutUs");
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			
			try {
				EmployerBean em = dao.addEmployer(EmployerBean employer);
				request.setAttribute("employer", em);
				
				RequestDispatcher view = request.getRequestDispatcher("postJob.jsp");
				view.forward(request, response);
			}catch(NullPointerException e) {
				e.getMessage();
				System.out.println("NullPointerException");
			}
		}
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in doPost");
		doGet(request, response);
	}

}
