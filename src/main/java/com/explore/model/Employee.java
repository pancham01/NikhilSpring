package com.explore.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

	private int id;

	private String name, gender;

	private Address address;

	private List<Integer> list;
	private Set<Integer> set;
	private Map<Integer, String> map;

	public Employee() {
		super();
		System.out.println("Employee.Employee()");
	}

	
	public Employee(int id, String name, String gender, Address address, List<Integer> list, Set<Integer> set,
			Map<Integer, String> map) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.list = list;
		this.set = set;
		this.map = map;
	}


	public List<Integer> getList() {
		return list;
	}


	public void setList(List<Integer> list) {
		this.list = list;
	}


	public Set<Integer> getSet() {
		return set;
	}


	public void setSet(Set<Integer> set) {
		this.set = set;
	}


	public Map<Integer, String> getMap() {
		return map;
	}


	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}


	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("Employee.setAddress()");
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Employee.setId()");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Employee.setName()");
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		System.out.println("Employee.setGender()");
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", address=" + address + ", list="
				+ list + ", set=" + set + ", map=" + map + "]";
	}

}
