package com.spring.core.JDBC;

public class StudentN {
	
	private int StudentId;
	private String StudentName;
	private int Studentage;
	
	public StudentN(int StudentId, String StudentName, int Studentage) {
		this.StudentId = StudentId;
		this.StudentName = StudentName;
		this.Studentage = Studentage;
	}
	
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public int getStudentage() {
		return Studentage;
	}
	public void setStudentage(int studentage) {
		Studentage = studentage;
	}
	@Override
	public String toString() {
		return "StudentN [StudentId=" + StudentId + ", StudentName=" + StudentName + ", Studentage=" + Studentage + "]";
	}
	
}
