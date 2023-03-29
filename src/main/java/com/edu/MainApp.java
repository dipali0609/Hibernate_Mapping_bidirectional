package com.edu;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edu.Department;
import co.edu.Employee;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		configuration.addAnnotatedClass(Student.class);
		configuration.addAnnotatedClass(Subject.class);
		configuration.addAnnotatedClass(Teacher.class);
		
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		//create department object
		
		
		
		Student student=new Student();
       	student.setStudname("Dipali");
		
		
		Teacher teacher=new Teacher();
		teacher.setTeachername("XYZ");
		
		
		Subject subject=new Subject();
		subject.setSname("Java");
		
		Subject subject1=new Subject();
		subject1.setSname("Python");
		
		
		ArrayList<Subject> list=new ArrayList<Subject>();
		list.add(subject);
		list.add(subject1);
		
		student.setSubject(list);
		teacher.setSubject(list);
		
		session.save(student);
		session.save(teacher);
	
		transaction.commit();
		session.close();
		
		
	}

}
