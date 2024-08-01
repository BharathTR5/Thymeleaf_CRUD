package com.CRUD.sboot.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

@Entity
public class Student {
	@Id
	@GeneratedValue(generator = "id")
	@SequenceGenerator(initialValue = 1001, allocationSize = 1, name = "id")
	private int id;
	private String name;
	private String mobile;
	private String gender;
	private String email;
	private int kannada;
	private int english;
	private int it;

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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getKannada() {
		return kannada;
	}

	public void setKannada(int kannada) {
		this.kannada = kannada;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getIt() {
		return it;
	}

	public void setIt(int it) {
		this.it = it;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", mobile=" + mobile + ", gender=" + gender + ", email=" + email + ", kannada="
				+ kannada + ", english=" + english + ", it=" + it + "]";
	}
}
