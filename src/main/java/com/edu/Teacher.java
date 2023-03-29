package com.edu;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Teacher 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int teacherid;
private String teachername;
public Teacher() {
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



public Teacher(int teacherid, String teachername) {
	super();
	this.teacherid = teacherid;
	this.teachername = teachername;
}
public int getTeacherid() {
	return teacherid;
}
public void setTeacherid(int teacherid) {
	this.teacherid = teacherid;
}
public String getTeachername() {
	return teachername;
}
public void setTeachername(String teachername) {
	this.teachername = teachername;
}
@Override
public String toString() {
	return "Teacher [teacherid=" + teacherid + ", teachername=" + teachername + "]";
}

}
