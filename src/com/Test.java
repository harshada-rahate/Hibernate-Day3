package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test {
	public static void main(String [] args)
	{
		
		
		Student s=new Student();
		 s.setRollno(3);
		 s.setName("prq");
		
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		session.persist(s);
		session.beginTransaction().commit();
		System.out.println("save student");
		
		
		
			
		  
		}
		
		
	}


