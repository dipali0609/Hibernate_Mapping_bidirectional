package com.edu;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;

@Entity
public class Student 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int studid;
private String studname;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}

@OneToMany(cascade=CascadeType.ALL)
private List<Subject> subject;
public List<Subject> getSubject() {
	return subject;
}
public void setSubject(List<Subject> subject) {
	this.subject = subject;
}




public Student(int stud_id, String studname) {
	super();
	this.studid = stud_id;
	this.studname = studname;
}
public int getStud_id() {
	return studid;
}
public void setStud_id(int stud_id) {
	this.studid = stud_id;
}
public String getStudname() {
	return studname;
}
public void setStudname(String studname) {
	this.studname = studname;
}
@Override
public String toString() {
	return "Student [studid=" + studid + ", studname=" + studname + "]";
}

}
