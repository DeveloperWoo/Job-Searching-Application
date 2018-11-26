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

	public void addJob(JobBean job) {
		Connection conn = null;
		try {
			conn = DBUtil.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(
					"INSERT INTO jobs"
					+ "(jobID, employerID, title, type, subType, city, address, numOfPosition, "
					+ "description, qualification, howToApply, postingDate, closingDate, note)"
					+ "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");  //14
			pstmt.setInt(1, job.getJobId());
			pstmt.setInt(2, job.getEmployerId());
			pstmt.setString(3, job.getTitle());
			pstmt.setString(4, job.getType());
			pstmt.setString(5, job.getSubType());
			pstmt.setString(6, job.getCity());
			pstmt.setString(7, job.getAddress());
			pstmt.setInt(8, job.getNumOfPosition());
			pstmt.setString(9, job.getDescription());
			pstmt.setString(10, job.getQualification());
			pstmt.setString(11, job.getHowToApply());
			pstmt.setDate(12, new java.sql.Date(job.getPostingDate().getTime())); //Check later!!
			pstmt.setDate(13, new java.sql.Date(job.getClosingDate().getTime())); //
			pstmt.setString(14, job.getNote());	
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		finally {
			DBUtil.closeConnection(conn);
		}
	}
	
	public void deleteUser(int jobID) {
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
					+ "title = ?, type =?, subType = ?, city = ?, address = ?, numOfPosition = ?, "
					+ "description = ?, qualification = ?, howToApply = ?, postingDate = ?, "
					+ "closingDate = ?, note = ?");

			pstmt.setString(1, job.getTitle());
			pstmt.setString(2, job.getType());
			pstmt.setString(3, job.getSubType());
			pstmt.setString(4, job.getCity());
			pstmt.setString(5, job.getAddress());
			pstmt.setInt(6, job.getNumOfPosition());
			pstmt.setString(7, job.getDescription());
			pstmt.setString(8, job.getQualification());
			pstmt.setString(9, job.getHowToApply());
			pstmt.setDate(10, new java.sql.Date(job.getPostingDate().getTime())); //Check later!!
			pstmt.setDate(11, new java.sql.Date(job.getClosingDate().getTime())); //
			pstmt.setString(12, job.getNote());
			
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
			Statement stmt = conn.createStatement();
			ResultSet rSet = stmt.executeQuery("SELECT * FROM jobs");
			
			while(rSet.next()) {//if rSet has sth in it
				JobBean job = new JobBean();				
				job.setJobId(rSet.getInt("jobId"));
				job.setTitle(rSet.getString("title"));
				job.setType(rSet.getString("type"));
				job.setCity(rSet.getString("city"));
				job.setPostingDate(rSet.getDate("postingDate"));
				job.setClosingDate(rSet.getDate("closingDate"));
				
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
	
	public List<JobBean> searchJobs(String title, String city) {
		Connection conn = null;
		List<JobBean> jobs = new ArrayList<JobBean>();
		
		try {
			conn = DBUtil.getConnection();
			String sql = "SELECT * FROM jobs WHERE title = ? AND city = ?";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, title);
			pStmt.setString(2, city);
			ResultSet rSet = pStmt.executeQuery();		
			
			while(rSet.next()) {//if rSet has sth in it
				JobBean job = new JobBean();				
				job.setJobId(rSet.getInt("jobId"));
				job.setTitle(rSet.getString("title"));
				job.setType(rSet.getString("type"));
				job.setCity(rSet.getString("city"));
				job.setPostingDate(rSet.getDate("postingDate"));
				job.setClosingDate(rSet.getDate("closingDate"));
				
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
