package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import Model.JobBean;
import DAO.JobDAO;

@WebServlet("/JobController")
public class JobController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private JobDAO dao;
	
    public JobController() {
        super();
        dao = new JobDAO();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		JobBean job = new JobBean();
		
		if(action.equals("post")) {
			String title = request.getParameter("title");
			String city = request.getParameter("city");
			String address = request.getParameter("address");
			int numOfPosition = Integer.parseInt(request.getParameter("numOfPosition"));
			String description = request.getParameter("description");
			String qualification = request.getParameter("qualification");
			
			Date postingDate;
			try {
				postingDate = new SimpleDateFormat("dd/MM/yyyy").parse(request.getParameter("postingDate"));
				job.setPostingDate(postingDate);
				
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
			Date closingDate;
			try {
				closingDate = new SimpleDateFormat("dd/MM/yyyy").parse(request.getParameter("closingDate"));
				job.setClosingDate(closingDate);
			} catch (ParseException e) {
				e.printStackTrace();
			}

			job.setTitle(title);
			job.setCity(city);
			job.setAddress(address);
			job.setNumOfPosition(numOfPosition);
			job.setDescription(description);
			job.setDescription(qualification);
			
			dao.addJob(job); // update the table
			request.setAttribute("job", dao.getJobById(job.getJobId())); //send the job object we just created
			
			RequestDispatcher view = request.getRequestDispatcher("jobDetail.jsp");
			view.forward(request, response);

			
		}
		else if(action.equals("search")) 
		{
			//Get job title and city
			String title = request.getParameter("title");
			String city = request.getParameter("city");
			
			//Search jobs based on user's input(job title, city)
			request.setAttribute("jobs", dao.searchJobs(title, city));
			
			RequestDispatcher view = request.getRequestDispatcher("JobList.jsp");
			view.forward(request, response);
		}else // more actions should be added later: delete, detail, edit
		{ 
			
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
