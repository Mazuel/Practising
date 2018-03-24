package test.group;

import java.math.BigDecimal;

public class Person {
	private String company;
	private String firstName;
	private String lastname;
	private BigDecimal montlySalary;
	public Person(String company, String firstName, String lastname, BigDecimal montlySalary) {
		this.company = company;
		this.firstName = firstName;
		this.lastname = lastname;
		this.montlySalary = montlySalary;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public BigDecimal getMontlySalary() {
		return montlySalary;
	}
	public void setMontlySalary(BigDecimal montlySalary) {
		this.montlySalary = montlySalary;
	}
	
	

}
