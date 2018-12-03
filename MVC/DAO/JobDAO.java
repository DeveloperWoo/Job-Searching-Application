package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Model.JobBean;
import Util.DBUtil;

public class JobDAO {
	
	

	public JobDAO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public void addJob(JobBean job) {
		Connection conn = null;
		try {
			conn = DBUtil.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(
					"INSERT INTO jobs"
					+ "(employerID, title, city, address, numOfPosition, "
					+ "description, qualification, postingDate, closingDate, note)"
					+ "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");  //10, jobID will be automatically set with next value
			pstmt.setInt(1, job.getEmployerId());
			pstmt.setString(2, job.getTitle());
			pstmt.setString(3, job.getCity());
			pstmt.setString(4, job.getAddress());
			pstmt.setInt(5, job.getNumOfPosition());
			pstmt.setString(6, job.getDescription());
			pstmt.setString(7, job.getQualification());
			pstmt.setDate(8, new java.sql.Date(job.getPostingDate().getTime())); //Check later!!
			pstmt.setDate(9, new java.sql.Date(job.getClosingDate().getTime())); //
			pstmt.setString(10, job.getNote());	
			
			pstmt.executeUpdate();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		finally {
			DBUtil.closeConnection(conn);
		}
	}
	
	
	public void deleteJob(int jobID) {
		Connection conn = null;
		
		try {
			conn = DBUtil.getConnection();
			
			PreparedStatement pstmt = conn.prepareStatement(
					"DELETE FROM jobs WHERE jobID = ?"); 
			
			pstmt.setInt(1, jobID);
			
			pstmt.executeUpdate();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		finally {
			DBUtil.closeConnection(conn);
		}
	}
	
	
	public void updateUser(JobBean job) {
		Connection conn = null;
		
		try {
			conn = DBUtil.getConnection();
			
			PreparedStatement pstmt = conn.prepareStatement(
					"UPDATE jobs SET"
					+ "title = ?, city = ?, address = ?, numOfPosition = ?, "
					+ "description = ?, qualification = ?, postingDate = ?, "
					+ "closingDate = ?, note = ?");

			pstmt.setString(1, job.getTitle());
			pstmt.setString(2, job.getCity());
			pstmt.setString(3, job.getAddress());
			pstmt.setInt(4, job.getNumOfPosition());
			pstmt.setString(5, job.getDescription());
			pstmt.setString(6, job.getQualification());
			pstmt.setDate(7, new java.sql.Date(job.getPostingDate().getTime())); //Check later!!
			pstmt.setDate(8, new java.sql.Date(job.getClosingDate().getTime())); //
			pstmt.setString(9, job.getNote());
			
			pstmt.executeUpdate();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		finally {
			DBUtil.closeConnection(conn);
		}
	}
	
	public List<JobBean> getAllJobs(){
		Connection conn = null;
		List<JobBean> jobs = new ArrayList<JobBean>();
		
		try {
			conn = DBUtil.getConnection();
			System.out.println(conn.toString());
			Statement stmt = conn.createStatement();
			ResultSet rSet = stmt.executeQuery("SELECT * FROM jobs");
			
			while(rSet.next()) { // Move the cursor to the next row, return false if no more row
				JobBean job = new JobBean();				
				job.setJobId(rSet.getInt("jobID"));
				job.setEmployerId(rSet.getInt("employerID"));
				job.setTitle(rSet.getString("title"));
				job.setCity(rSet.getString("city"));
				job.setAddress(rSet.getString("address"));
				job.setNumOfPosition(rSet.getInt("numOfPosition"));
				job.setDescription(rSet.getString("description"));
				job.setQualification(rSet.getString("qualification"));
				job.setPostingDate(rSet.getDate("postingDate"));
				job.setClosingDate(rSet.getDate("closingDate"));
				job.setNote(rSet.getString("note"));
				
				jobs.add(job);
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		finally {
			DBUtil.closeConnection(conn);
		}
		return jobs;
	}
	
	public JobBean getJobById(int jobId){
		Connection conn = null;
		JobBean job = new JobBean();	
		
		try {
			conn = DBUtil.getConnection();
			PreparedStatement pStmt = conn.prepareStatement("SELECT * FROM jobs WHERE jobID = ?");
			pStmt.setInt(1, jobId);
			ResultSet rSet = pStmt.executeQuery();	
			System.out.println("inside dao.getJobById.try");
			
			while(rSet.next()) {//if rSet has something in it
				System.out.println("inside dao.getJobById.while");
						
				job.setJobId(rSet.getInt("jobID"));
				job.setEmployerId(rSet.getInt("employerID"));
				job.setTitle(rSet.getString("title"));
				job.setCity(rSet.getString("city"));
				job.setAddress(rSet.getString("address"));
				job.setNumOfPosition(rSet.getInt("numOfPosition"));
				job.setDescription(rSet.getString("description"));
				job.setQualification(rSet.getString("qualification"));
				job.setPostingDate(rSet.getDate("postingDate"));
				job.setClosingDate(rSet.getDate("closingDate"));
				job.setNote(rSet.getString("note"));
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			DBUtil.closeConnection(conn);
		}
		return job;
	}
	
	
	public List<JobBean> searchJobs(String title, String city) {
		Connection conn = null;
		List<JobBean> jobs = new ArrayList<JobBean>();
		System.out.println("inside dao.searchJobs");
		
		try {
			conn = DBUtil.getConnection();
			PreparedStatement pStmt = conn.prepareStatement("SELECT * FROM jobs WHERE title = ? AND city = ?");
			pStmt.setString(1, title);
			pStmt.setString(2, city);
			ResultSet rSet = pStmt.executeQuery();	
			System.out.println("inside dao.searchJobs.try");
			
			while(rSet.next()) {//if rSet has something in it
				System.out.println("inside dao.searchJobs.while");
				JobBean job = new JobBean();	
				
				job.setJobId(rSet.getInt("jobID"));
				job.setEmployerId(rSet.getInt("employerID"));
				job.setTitle(rSet.getString("title"));
				job.setCity(rSet.getString("city"));
				job.setAddress(rSet.getString("address"));
				job.setNumOfPosition(rSet.getInt("numOfPosition"));
				job.setDescription(rSet.getString("description"));
				job.setQualification(rSet.getString("qualification"));
				job.setPostingDate(rSet.getDate("postingDate"));
				job.setClosingDate(rSet.getDate("closingDate"));
				job.setNote(rSet.getString("note"));
				
				jobs.add(job);
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			DBUtil.closeConnection(conn);
		}
		return jobs;
	}
	
}
