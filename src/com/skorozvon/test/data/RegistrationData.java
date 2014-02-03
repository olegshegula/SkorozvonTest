package com.skorozvon.test.data;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.DataProvider;

import au.com.bytecode.opencsv.CSVReader;

public class RegistrationData {
	
	private String name;
	private String city;
	private String post;
	private String phone;
	private String email;
	private String comment;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@DataProvider(name = "registrationCSVData")
	public static Object[][] getCSVData() throws IOException {

		CSVReader csvReader = new CSVReader(new FileReader(
				RegistrationData.class.getResource("newdata.csv").getPath()));

		List<String[]> dataList = csvReader.readAll();
		Object[][] data = new Object[dataList.size()][1];
		List<RegistrationData> regList = new ArrayList<RegistrationData>();

		for (String[] strArray : dataList) {
			RegistrationData registrationData = new RegistrationData();
			registrationData.setCity(strArray[0].trim());
			registrationData.setPost(strArray[1].trim());
			registrationData.setPhone(strArray[2].trim());
			registrationData.setEmail(strArray[3].trim());
			registrationData.setComment(strArray[4].trim());
			regList.add(registrationData);
		}

		for (int i = 0; i < data.length; i++) {

			for (int j = 0; j < data[i].length; j++) {
				data[i][j] = regList.get(i);
			}
		}
		csvReader.close();
		return data;
	}
}
