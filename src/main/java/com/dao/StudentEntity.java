
package com.dao;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_tbl")
public class StudentEntity {

	int id;
	String name;
	int age;
	String address;

	public StudentEntity() {
		super();

	}

	public StudentEntity(int id, String name, String address, int age) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.age=age;
	}
  @Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
public void setAge(int age) {
	this.age=age;
}
	
	public int getAge() {
		return age;
	}
	 
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "StudentEntity [id=" + id + ", name=" + name + ", address=" + address + ",age=" + age + "]";
	}

}
