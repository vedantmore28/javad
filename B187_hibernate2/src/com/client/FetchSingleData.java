package com.client;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.config.HibernateUtil;
import com.model.Student;

public class FetchSingleData {

	public static void main(String[] args) {
		
		Session session =HibernateUtil.getSessionFactory().openSession();
		
		
						String hql="from Student";		
						
		Query<Student> query	=session.createQuery(hql);
		
		List<Student> list= query.getResultList();
		for(Student s: list)
		{
			 
			System.out.println(s.getSid());
			System.out.println(s.getSname());
		
		}
		
		
	}
	
	
}
