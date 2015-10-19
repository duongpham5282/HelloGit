package com.cboe;

public class Employee {

	private String name;
	private String address;
	private int age;
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
