package fr.sabralex.m1.pui.java;

public class ContactObject {
	private String name;
	private String email;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	private String mobileNumber;

	public ContactObject(String name, String email, String mobileNumber) {
		this.name = name;
		this.email = email;
		this.mobileNumber = mobileNumber;
	}

}
