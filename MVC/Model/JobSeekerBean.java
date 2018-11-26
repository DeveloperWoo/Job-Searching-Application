package Model;

import java.io.Serializable;

public class JobSeekerBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int jobseekerId;
	private String firstName;
	private String lastName;
	private String phoneNum;
	private String email;
	
	public JobSeekerBean() {
		// TODO Auto-generated constructor stub
	}

	public int getJobseekerId() {
		return jobseekerId;
	}

	public void setJobseekerId(int jobseekerId) {
		this.jobseekerId = jobseekerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "JobSeekerBean [jobseekerId=" + jobseekerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", phoneNum=" + phoneNum + ", email=" + email + "]";
	}

}
