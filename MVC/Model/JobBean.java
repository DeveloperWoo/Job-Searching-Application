package Model;

import java.io.Serializable;
import java.util.Date;

public class JobBean implements Serializable{

	private int jobId;
	private String title;
	private String type;
	private String subType;
	private String city;
	private String address;
	private int	numOfPosition;
	private String description;
	private String qualification;
	private String howToApply;
	private Date postingDate;
	private Date closingDate;
	private String note;
	
	public JobBean() {
		// TODO Auto-generated constructor stub
	}

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSubType() {
		return subType;
	}

	public void setSubType(String subType) {
		this.subType = subType;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNumOfPosition() {
		return numOfPosition;
	}

	public void setNumOfPosition(int numOfPosition) {
		this.numOfPosition = numOfPosition;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getHowToApply() {
		return howToApply;
	}

	public void setHowToApply(String howToApply) {
		this.howToApply = howToApply;
	}

	public Date getPostingDate() {
		return postingDate;
	}

	public void setPostingDate(Date postingDate) {
		this.postingDate = postingDate;
	}

	public Date getClosingDate() {
		return closingDate;
	}

	public void setClosingDate(Date closingDate) {
		this.closingDate = closingDate;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return "JobBean [jobId=" + jobId + ", title=" + title + ", type=" + type + ", subType=" + subType + ", city="
				+ city + ", address=" + address + ", numOfPosition=" + numOfPosition + ", description=" + description
				+ ", qualification=" + qualification + ", howToApply=" + howToApply + ", postingDate=" + postingDate
				+ ", closingDate=" + closingDate + ", note=" + note + "]";
	}

}
