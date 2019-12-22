package com.pradeep.hibernate.dao;

import java.util.Date;

import org.hibernate.Session;

import org.hibernate.Transaction;

import com.pradeep.hibernate.dto.UserDetailsDTO;
import com.pradeep.hibernate.util.HibernateUtil;

public class InsertData {
	public static void main(String[] args) {
		UserDetailsDTO user=new UserDetailsDTO();
		user.setUserName("SecondUser");
		user.setAddress("YM");
		user.setJoinedDate(new Date());
		user.setDescription("SE");
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.save(user);
		session.getTransaction();
		transaction.commit();
		session.close();
		HibernateUtil.shutdown();
	}
}
