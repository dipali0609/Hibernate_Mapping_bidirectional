package com.edu1;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import co.edu.Employee;

@Entity
public class Dept 
{
	@Id
	//@GeneratedValue
private int Depid;
private String DeptName;
public Dept() {
	super();
	// TODO Auto-generated constructor stub
}


@OneToMany(cascade=CascadeType.ALL)
@JoinColumn(name="deptID")
private List<Emp> emp;


public List<Emp> getEmp() {
	return emp;
}
public void setEmp(List<Emp> emp) {
	this.emp = emp;
}
public Dept(int depid, String deptName) {
	super();
	Depid = depid;
	DeptName = deptName;
}
public int getDepid() {
	return Depid;
}
public void setDepid(int depid) {
	Depid = depid;
}
public String getDeptName() {
	return DeptName;
}
public void setDeptName(String deptName) {
	DeptName = deptName;
}
@Override
public String toString() {
	return "Dept [Depid=" + Depid + ", DeptName=" + DeptName + "]";
}



}
