package com.puntosingular.base.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="roles")

public class Rol{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_role;
	@Column(length=45)
	private String name;
	@Column(length=45)
	private String description;
	@Column(nullable=false)
	private String status;
	@Column(name="create_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;
	
	
	
	public long getId() {
		return id_role;
	}
	public void setId(long id_role) {
		this.id_role = id_role;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void description(String description) {
		this.description = description;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	}
	
