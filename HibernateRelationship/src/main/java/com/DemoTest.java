package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DemoTest {

	public static void main(String[] args) {
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tran=session.getTransaction();
		
		System.out.println("table created");
		
//		Trainer tr=new Trainer();
//		tr.setTid(102);
//		tr.setTname("ravi");
//		tran.begin();
//		session.save(tr);
//		tran.commit();
//		System.out.println("trainer record saved successfully");
		
//		Students s1=new Students();
//		s1.setSid(14);
//		s1.setSname("veeta");
//		s1.setAge(23);
//		tran.begin();
//		session.save(s1);
//		tran.commit();
//		System.out.println("stored succuesfully");
//		
		
//		Course c1=new Course();
//		c1.setCname("python");
//		c1.setFees(25000);
//		tran.begin();
//		session.save(c1);
//		tran.commit();
//		System.out.println("course details saved successfully");
//		
		
		//Assign student to trainer
//		Students s1=session.get(Students.class, 14);
//		if(s1==null)
//		{
//			System.out.println("student not present");
//		}
//		else
//		{
//			tran.begin();
//			s1.setTsid(102);
//			session.update(s1);
//			tran.commit();
//			System.out.println("student assigned to trainer successfully");
//			
//		}
//		
//
	}

}
