package co.edu;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class MainAppOneToMany {

	public static void main(String[] args) {
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		configuration.addAnnotatedClass(Department.class);
		configuration.addAnnotatedClass(Employee.class);
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		//create department object
		Department department = new Department();
		department.setDepartmentName("Sales");

		//create employee object
		Employee emp1 = new Employee("Nina", "Mayers", "111");
		Employee emp2 = new Employee("Tony", "Almeida", "222");
		ArrayList<Employee>emplist=new ArrayList<Employee>();
		emplist.add(emp1);
		emplist.add(emp2);
		department.setEmployees(emplist);
		
		
		session.save(department);
		transaction.commit();
		session.close();
		
	}
}
