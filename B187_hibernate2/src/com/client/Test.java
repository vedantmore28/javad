package com.client;

import org.hibernate.Session;

import com.config.HibernateUtil;
import com.model.Student;

public class Test {

	public static void main(String[] args) {
		
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		
				
		Student s=new Student();
		
				s.setSid(10);
				s.setSname("nikita mam");
				s.setAddress("pune Karvenagar");
				
				session.save(s);
				
				session.beginTransaction().commit();
				System.out.println("add pushh to pull ")
				
		
		
	}
	
	
}
