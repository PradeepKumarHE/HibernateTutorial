package com.pradeep.hibernate.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@MappedSuperclass
public class BaseEntity {
	
	public BaseEntity() {
		this.createdTS=new Date();
		this.updatedTS=new Date();
	}

	@Column(name = "CreatedTS",updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdTS;

	@Column(name = "UpdatedTS")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedTS;
}
