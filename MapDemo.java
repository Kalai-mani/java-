package com.map;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class MapDemo {
	public static void main(String[] args) {
		
	

	SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
	Session session=sessionfactory.openSession();
	Transaction t=session.beginTransaction();
	Question Q1=new Question();
	Q1.setQues("what is java");
	Answer ans=new Answer();
	ans.setAnswer("java oops");
	Q1.setAns(ans);
	session.save(ans);
	session.save(Q1);
	
	
	
	t.commit();
	
//	Question ques=(Question)session.load(Question.class,10);
	//System.out.println(ques.getQues());
	//System.out.println(ques.getAns().getAnswer());
	session.close();
	sessionfactory.close();
	
	
	
	
	}

}
