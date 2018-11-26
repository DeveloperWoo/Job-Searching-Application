package Model;

import java.io.Serializable;

public class EmployerBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int employerId;
	private String eName;
	private String address;
	private String contact;
	private String aboutUs;
	private String website;

	//constructor with no argument
	public EmployerBean() {	}

	public int getEmployerId() {
		return employerId;
	}

	public void setEmployerId(int employerId) {
		this.employerId = employerId;
	}

	public String getEName() {
		return eName;
	}

	public void setEName(String eName) {
		this.eName = eName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAboutUs() {
		return aboutUs;
	}

	public void setAboutUs(String aboutUs) {
		this.aboutUs = aboutUs;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	@Override
	public String toString() {
		return "EmployerBean [employerId=" + employerId + ", eName=" + eName + ", address=" + address + ", contact="
				+ contact + ", aboutUs=" + aboutUs + ", website=" + website + "]";
	}

	
	
}
