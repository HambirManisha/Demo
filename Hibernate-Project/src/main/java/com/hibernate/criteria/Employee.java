package com.hibernate.criteria;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
 
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
   // @Column(name = "Employee_Id")
    private int employeeId;
   
    //@Column(name = "FirstName")
    private String firstName;
   
   // @Column(name = "LastName")
    private String lastName;
   
   // @Column(name = "Age")
    private int age;
   
   // @Column(name = "Education")
    private String education;
   
  //  @Column(name = "Salary")
    private int salary;

public Employee(int employeeId, String firstName, String lastName, int age, String education, int salary) {
	super();
	this.employeeId = employeeId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.age = age;
	this.education = education;
	this.salary = salary;
}

public Employee() {
	super();
	//TODO Auto-generated constructor stub
}

public int getEmployeeId() {
	return employeeId;
}

public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
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

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getEducation() {
	return education;
}

public void setEducation(String education) {
	this.education = education;
}

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}

@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
			+ ", education=" + education + ", salary=" + salary + "]";
}
   
    

}
