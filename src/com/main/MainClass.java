package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Profile;
import com.entities.User;

public class MainClass {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(User.class);
		cfg.addAnnotatedClass(Profile.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		User u1 = new User();
		u1.setUser_id(1011);
		u1.setUsername("srv");
		u1.setEmail("shubham@gmail.com");
		u1.setPassword("Shubham@123");
		
		User u2 = new User();
		u2.setUser_id(1014);
		u2.setUsername("vishu");
		u2.setEmail("vishal@gmail.com");
		u2.setPassword("Vishal@123");

		Profile p1 = new Profile();
		p1.setName("Shubham Verma");
		p1.setAddress("Pune");
		p1.setMobile("8879754547");
		p1.setEmail("shubham@gmail.com");
		p1.setUsers(u1);
		
		Profile p2 = new Profile();
		p2.setName("Vishal Shrivastava");
		p2.setAddress("Motihari");
		p2.setMobile("8879748789");
		p2.setEmail("vishal@gmail.com");
		p2.setUsers(u2);

		ss.persist(u1);
		ss.persist(p1);
		ss.persist(u2);
		ss.persist(p2);

		System.out.println("Data Inserted Successufully!");
		tr.commit();
		ss.close();

	}

}
