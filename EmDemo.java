package com.demo.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmDemo {
		
			public static void main(String [] args){
				System.out.println("Project Started");
				SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
				
				Session session = sessionfactory.getCurrentSession();
				System.out.println(sessionfactory.isClosed());
				
				Certificate certi = new Certificate("3456789", "21/1/1998", "Java" ,"250");
				
				StudentEntity st = new StudentEntity("kalai","hour", certi);
				
				
				
				session.beginTransaction();
				session.save(st);
					
						
						
						
				
				
				session.getTransaction().commit();
				session.close();
				
				
			}
		}
		