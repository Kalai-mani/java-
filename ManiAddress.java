package com.demo.Hibernate;


	import java.util.Date;

	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.cfg.Configuration;

	public class ManiAddress {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Session Start");
			SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
			
			Session session = sessionfactory.getCurrentSession();
			System.out.println(sessionfactory.isClosed());
			
			Address add = new Address(5, "Banu", "India", true, 12.42, new Date());
			
			session.beginTransaction();
			session.save(add);
			
			session.getTransaction().commit();
			session.close();
		}

	}

