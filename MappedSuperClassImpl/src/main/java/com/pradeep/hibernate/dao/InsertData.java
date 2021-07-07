package com.pradeep.hibernate.dao;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pradeep.hibernate.dto.UserDetailsDTO;
import com.pradeep.hibernate.util.HibernateUtil;

public class InsertData {
	public static void main(String[] args) throws UnsupportedEncodingException {

		UserDetailsDTO user = new UserDetailsDTO();
		user.setFirstName("Pradeep");
		user.setLastName("Kumar");
		user.setEmail("Pradeep@gmail.com");
		user.setEncryptedEmail(toSHA256String("Pradeep@gmail.com"));
		// UUID guid = UUID.randomUUID();
		// user.setGuid(guid.toString());
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.save(user);
		session.getTransaction();
		transaction.commit();
		session.close();
		HibernateUtil.shutdown();

	}

	public static String toSHA256String(String str) throws UnsupportedEncodingException {
		MessageDigest digest = getSHA256MessageDigest();
		byte[] hash = digest.digest(str.getBytes("UTF-8"));
		StringBuilder result = new StringBuilder();
		for (byte b : hash) {
			result.append(String.format("%02x", b));
		}
		return result.toString();
	}

	public static MessageDigest getSHA256MessageDigest() {
		try {
			return MessageDigest.getInstance("SHA-256");
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException("Missing Sha-256", e);
		}
	}
}
