package com.magesh;

import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class MasterService {

	static int CONTACT_SIZE = 2;

	public static Map<Object, Object> getDataSourceHashMap() {
		HashMap<Object, Object> hashMap = new HashMap<>();
		for (int i = 1; i <= CONTACT_SIZE; i++) {
			String url = "jdbc:mysql://localhost:3306/contact" + i;
			DriverManagerDataSource dataSource = new DriverManagerDataSource();
			dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
			dataSource.setUrl(url);
			dataSource.setUsername("root");
			dataSource.setPassword("mysql");
			hashMap.put("contactId"+i, dataSource);
		}
		return hashMap;
	}
}