package com.edu1;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		configuration.addAnnotatedClass(Dept.class);
		configuration.addAnnotatedClass(Emp.class);
		
	
		
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		//create department object
		
		Dept dept=new Dept(1,"sales");
		//dept.setDepid(1);
		//dept.setDeptName("computer");
		
		Emp emp=new Emp(1,"Dipali");
		//emp.setEmpid(1);
		//emp.setEmpname("Dipali");

		Emp emp1=new Emp(2,"Prasad");
		//emp.setEmpid(2);
		//emp1.setEmpname("Prasad");

		ArrayList<Emp> list=new ArrayList<Emp>();
		list.add(emp);
		list.add(emp1);
		
		dept.setEmp(list);
		
		session.save(dept);
		
	
		transaction.commit();
		session.close();
		
		
	}

}
