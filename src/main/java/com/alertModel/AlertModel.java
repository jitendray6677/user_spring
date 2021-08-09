
package com.alertModel;

import com.fasterxml.jackson.annotation.JsonInclude; import
 com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_DEFAULT) 
public class AlertModel {
	int id;
	String name;
	int age;
	String address; // String author; // int year; public

	public AlertModel() {
		super();
	}

	public AlertModel(String name) {
		super();
		this.name = name;
	}

	public AlertModel(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public AlertModel(int id, String name, int age, String address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
