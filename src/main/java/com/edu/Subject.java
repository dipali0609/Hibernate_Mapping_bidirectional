package com.edu;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Subject
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int subjectid;
private String subjectname;
public Subject() {
	super();
	// TODO Auto-generated constructor stub
}

@ManyToOne
private Student student;

@ManyToOne
private Teacher teacher;

public Subject(int sid, String sname) {
	super();
	this.subjectid = subjectid;
	this.subjectname = subjectname;
}
public int getSid() {
	return subjectid;
}
public void setSid(int subjectid) {
	this.subjectid = subjectid;
}
public String getSname() {
	return subjectname;
}
public void setSname(String subjectname) {
	this.subjectname = subjectname;
}
@Override
public String toString() {
	return "Subject [subjectid=" + subjectid + ",subjectname =" + subjectname + "]";
}


}
