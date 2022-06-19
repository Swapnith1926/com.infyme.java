package com.infyme.Serialization;

public class EmployeeAddress extends EmployeeDemo {

	private String city;
	private String pincode;
	private int phone;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	private static final long serialVersionUID = 1L;

	public EmployeeAddress(String name, int ID, String job, String DOB, int age) {
		super(name, ID, job, DOB, age);
		// TODO Auto-generated constructor stub

	}

	@Override
	public String toString() {
		return "EmployeeAddress [City=" + city + ", Pincode=" + pincode + ", Phone=" + phone + "]";
	}

}
