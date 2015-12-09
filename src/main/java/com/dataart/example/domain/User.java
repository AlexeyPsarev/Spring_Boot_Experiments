package com.dataart.example.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User
{
	@Id
	@Column(name = "id")
    private Integer id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "surname")
	private String surname;
	
	public User()
	{
	}
	
	public User(String name, String surname)
	{
		this.name = name;
		this.surname = surname;
	}
	
	public Integer getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getSurname()
	{
		return surname;
	}
	
	public void setId(Integer value)
	{
		id = value;
	}
	
	public void setName(String str)
	{
		name = str;
	}
	
	public void setSurname(String str)
	{
		surname = str;
	}
}
