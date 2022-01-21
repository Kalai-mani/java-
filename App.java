package com.demo.Hibernate;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args ) throws IOException

    {
        System.out.println( "Project started" );
        SessionFactory factory=new Configuration().configure().buildSessionFactory();
        
        Session session=factory.getCurrentSession();
        System.out.println(factory.isClosed());
        
        StudentEntity st=new StudentEntity();
        System.out.println(st);
        session.beginTransaction();
        session.save(st);
        session.getTransaction().commit();
        session.close();
        
    }
    
}
