package com.pradeep.hibernate.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity // by default class name is table
@Table(name="UserDetails")
public class UserDetailsDTO {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)	
	@Column(name="UserID")
	private int userId;
	
	@Column(name="UserName")
	//@Transient doesn't save to db
	private String userName;
	
	@Column(name="JoinedDate")
	@Temporal(TemporalType.TIMESTAMP)
	private Date joinedDate;
	
	@Column(name="Address")
	private String address;
	
	@Column(name="Description")
	//@Lob use this when huge amount of text
	private String description;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getJoinedDate() {
		return joinedDate;
	}

	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
