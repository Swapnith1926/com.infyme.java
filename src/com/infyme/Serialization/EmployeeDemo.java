package com.infyme.Serialization;

import java.io.Serializable;

public class EmployeeDemo implements Serializable {

	private static final long serialVersionUID = 1L; // Not mandatory as it will create while runtime
	private String name;
	private int ID;
	private String job;
	private String DOB;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "EmployeeDemo [Name=" + name + ", ID=" + ID + ", Job=" + job + ", DOB=" + DOB + ", age=" + age + "]";
	}

	public EmployeeDemo(String name, int ID, String job, String DOB, int age) {
		super();
		this.name = name;
		this.ID = ID;
		this.job = job;
		this.DOB = DOB;
		this.age = age;
	}

}
