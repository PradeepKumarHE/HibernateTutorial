package com.pradeep.hibernate.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity // by default class name is table
@Table(name="UserDetails")
public class UserDetailsDTO extends BaseEntity{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)	
	@Column(name="UserID")
	private int userId;
	
	@Column(name="FirstName")
	private String firstName;
	
	@Column(name="LastName")
	private String lastName;
	
	@Column(name="UserTypeID")
	private Integer userTypeID;
	
	@Column(name="Email")
	private String email;
	
	@Column(name="EncryptedEmail")
	private String encryptedEmail;
	
	@Column(name="Password")
	private String password;
	
	@Column(name="GUID")
	private String guid;
	
	@Column(name="PhoneCountryCodeID")
	private Integer phoneCountryCodeID;
	
	@Column(name="PhoneNumber")
	private Integer phoneNumber;
	
	@Column(name="ValidEmail")
	private Boolean validEmail;
	
	@Column(name="ValidOTP")
	private Boolean validOTP;
	
	@Column(name="ValidUser")
	private Boolean validUser;
	
	@Column(name="ProfilePicURL")
	private String profilePicURL;	

}
