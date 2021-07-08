package com.service;

public enum EnumTest {
	server_port("444"), spring_datasource_url("jdbc:mysql://localhost:3306/users"), spring_datasource_username("root"),
	spring_datasource_password("root"), spring_jpa_properties_hibernate_dialect("org.hibernate.dialect.MySQL5Dialect"),
	server_Driver("com.mysql.jdbc.driver");

	private String action;

	public String getAction() {
		return action;
	}

	private EnumTest(String action) {
		this.action = action;
	}

}
