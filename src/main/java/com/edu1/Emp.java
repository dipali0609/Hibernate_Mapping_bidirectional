package com.edu1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Emp 
{
	@Id
	//@GeneratedValue
private int Empid;
private String Empname;
public Emp() {
	super();
	// TODO Auto-generated constructor stub
}


@ManyToOne
@JoinColumn(name="deptID")
private Dept dept;

public Dept getDept() {
	return dept;
}
public void setDept(Dept dept) {
	this.dept = dept;
}



public Emp(int empid, String empname) {
	super();
	Empid = empid;
	Empname = empname;
}
public int getEmpid() {
	return Empid;
}
public void setEmpid(int empid) {
	Empid = empid;
}
public String getEmpname() {
	return Empname;
}
public void setEmpname(String empname) {
	Empname = empname;
}
@Override
public String toString() {
	return "Emp [Empid=" + Empid + ", Empname=" + Empname + "]";
}




}
