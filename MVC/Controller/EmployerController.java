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
import DAO.JobDAO;
import Model.EmployerBean;
import Model.JobBean;

@WebServlet("/EmployerController")
public class EmployerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private EmployerDAO emDao = new EmployerDAO();
	private JobDAO jobDao = new JobDAO();
       
    public EmployerController() {
        super();
        emDao = new EmployerDAO();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in doGet");
		
		String action = request.getParameter("action");
		
		if(action.equalsIgnoreCase("login")) {
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			System.out.println(username + password);
			
			try {
				EmployerBean em = emDao.getEmployer(username, password); //em contains every info about the employer
				request.setAttribute("employer", em);
				
				RequestDispatcher view = request.getRequestDispatcher("postJob.jsp");
				view.forward(request, response);
			}
			catch(NullPointerException e) {
				e.getMessage();
				System.out.println("NullPointerException");
			}
		}else if(action.equalsIgnoreCase("newAccount")) {
			RequestDispatcher view = request.getRequestDispatcher("emCreateAccount.jsp");
			view.forward(request, response);
		}else if(action.equalsIgnoreCase("createAccount")) {
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			String eName = request.getParameter("eName");
			String address = request.getParameter("address");
			String contact = request.getParameter("contact");
			String aboutUs = request.getParameter("aboutUs");
			String website = request.getParameter("website");
			
			EmployerBean em = new EmployerBean(username, password, eName, address, contact, aboutUs, website);
			emDao.addEmployer(em);				
			
			RequestDispatcher view = request.getRequestDispatcher("postJob.jsp");
			view.forward(request, response);
		}else { 
		
			
			
		}
			
//			try {
//				EmployerBean em = new EmployerBean(username, password, eName, address, contact, aboutUs, website);
//				dao.addEmployer(em);				
//				
//				RequestDispatcher view = request.getRequestDispatcher("postJob.jsp");
//				view.forward(request, response);
//			}catch(NullPointerException e) {
//				e.getMessage();
//				System.out.println("NullPointerException");
//			}
		}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in doPost");
		doGet(request, response);
	}

}
